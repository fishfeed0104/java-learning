package com.fish.system;

import java.util.Arrays;

// 业务层（Service）：只管学生数据的增删改查。
// 职责边界：不读键盘、不打印。所有输入输出都由 StudentApp 负责 ——
// 这样这一层可以脱离控制台单独测试，将来换成网页接口时也不用改。
public class StudentService {

    private static Student[] students = new Student[10];   // 容量不够会自动翻倍
    private static int size = 0;                           // 当前学生数

    private StudentService() {
    }        // 全是静态方法，不需要 new（工具类风格）

    // 当前学生数
    public static int size() {
        return size;
    }

    // 按学号查找，返回它在数组中的下标；找不到返回 -1（学号 → 下标的翻译器）
    public static int indexOfId(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    // 按下标取学生；调用方需保证 0 <= index < size()
    public static Student get(int index) {
        return students[index];
    }

    // 添加一个学生（含查重 + 容量不够自动扩容）
    // 返回 true = 添加成功；false = 学号已存在，没添加
    public static boolean add(Student s) {
        if (indexOfId(s.getId()) != -1) {
            return false;                                   // 学号重复
        }
        if (size == students.length) {                      // 装满了，先扩容
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[size] = s;
        size++;
        return true;
    }

    // 按下标删除：后面的元素整体往前挪一格，最后一格置空
    // 返回 true = 删除成功；false = 下标非法
    public static boolean removeAt(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        for (int j = index; j < size - 1; j++) {
            students[j] = students[j + 1];
        }
        students[size - 1] = null;                          // 清掉残留引用
        size--;
        return true;
    }

    // 学号是否已被"别人"占用 —— 改学号时用来查重
    // exceptIndex 是本人所在的下标：允许保持自己原来的学号
    public static boolean isIdUsedByOther(int id, int exceptIndex) {
        int i = indexOfId(id);
        return i != -1 && i != exceptIndex;
    }
}
