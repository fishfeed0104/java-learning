package com.fish.system;

import java.util.Scanner;

// 入口 / 界面层：只负责菜单、读键盘、打印结果。
// 所有"学生数据"的操作都交给 StudentService —— 这一层不碰数组、不碰 size。
public class StudentApp {

    static Scanner sc = new Scanner(System.in);      // 全程序只用这一个 Scanner

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.添加  2.删除  3.修改  4.查询  5.列出全部  6.统计信息  7.退出");
            System.out.print("请选择：");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();/* 添加：含查重 */
                    break;
                case 2:
                    deleteStudent();/*删除*/
                    break;
                case 3:
                    updateStudent();/*修改*/
                    break;
                case 4:
                    findStudent();/*查询*/
                    break;
                case 5:
                    listAll();/* 列出全部 */
                    break;
                case 6:
                    stats();/*统计信息*/
                    break;
                case 7:
                    System.out.println("再见");
                    return;
                default:
                    System.out.println("输入有误");
            }
        }
    }

    // ---------- 以下方法只做三件事：读输入 → 调 StudentService → 打印结果 ----------

    // 添加
    private static void addStudent() {
        int id;
        while (true) {
            System.out.println("请输入学号：");
            id = sc.nextInt();
            if (StudentService.indexOfId(id) == -1) {
                break;
            }
            System.out.println("学号 " + id + " 已存在，请重新输入");
        }

        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        try {
            boolean ok = StudentService.add(new Student(id, name, age));
            if (ok) {
                System.out.println("添加成功，当前共 " + StudentService.size() + " 名学生");
            } else {
                System.out.println("添加失败：学号 " + id + " 已存在");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("添加失败：" + e.getMessage());
        }
    }

    // 删除
    private static void deleteStudent() {
        int index = askIndex("删除");
        StudentService.removeAt(index);
        System.out.println("删除成功，当前共 " + StudentService.size() + " 名学生");
    }

    // 修改
    private static void updateStudent() {
        int index = askIndex("修改");

        while (true) {
            System.out.println("1.修改学号  2.修改姓名  3.修改年龄  4.返回");
            System.out.print("请选择：");
            int choice = sc.nextInt();

            // 统一接住 setter 抛出的非法值异常：失败就回到子菜单重选，程序不崩
            try {
                switch (choice) {
                    case 1:
                        System.out.println("请输入新的学号：");
                        int newId = sc.nextInt();
                        // 允许"保持自己原来的学号"（即没改）
                        if (StudentService.isIdUsedByOther(newId, index)) {
                            System.out.println("学号 " + newId + " 已被其他学生占用");
                            break;
                        }
                        StudentService.get(index).setId(newId);
                        System.out.println("修改成功：" + StudentService.get(index));
                        break;
                    case 2:
                        System.out.println("请输入新的姓名：");
                        StudentService.get(index).setName(sc.next());
                        System.out.println("修改成功：" + StudentService.get(index));
                        break;
                    case 3:
                        System.out.println("请输入新的年龄：");
                        StudentService.get(index).setAge(sc.nextInt());
                        System.out.println("修改成功：" + StudentService.get(index));
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("输入有误");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("修改失败：" + e.getMessage());
            }
        }
    }

    // 查询
    private static void findStudent() {
        int index = askIndex("查询");
        System.out.println(StudentService.get(index));
    }

    // 列出全部
    private static void listAll() {
        if (StudentService.size() == 0) {
            System.out.println("暂无学生");
            return;
        }
        for (int i = 0; i < StudentService.size(); i++) {
            System.out.println(StudentService.get(i));
        }
    }

    // 统计信息 —— 实测结论：
    //   ① size 与 count 不是一回事：加 3 个后 count = 3；再删掉 1 个 → size = 2，
    //      但 count 仍然是 3。因为 count++ 只写在构造器里，记的是"构造器执行过几次"；
    //      删除只是把数组元素置空、对象被 GC 回收，构造器不会倒着再跑一遍。
    //      → 一句话：size 看当下，count 看历史。
    //   ② 关掉程序重新运行 → count 变回 0。因为 static 变量随"类加载"创建、
    //      随"类卸载"销毁；进程结束 = 类没了 = 变量没了。它只在内存里、不落磁盘，
    //      所以不是持久化（想持久化得写文件或数据库）。
    private static void stats() {
        System.out.println("当前学生数 size = " + StudentService.size()
                + "，本次运行创建过 count = " + Student.getCount());
    }

    // 反复询问学号直到找到，返回它的下标
    // （删除 / 修改 / 查询共用；action 只用来拼提示语，如"删除"）
    private static int askIndex(String action) {
        int index;
        while (true) {
            System.out.println("请输入你要" + action + "的学生的学号：");
            int id = sc.nextInt();
            index = StudentService.indexOfId(id);
            if (index != -1) {
                break;
            }
            System.out.println("没有找到学号为 " + id + " 的学生，请重新输入");
        }
        return index;
    }
}
