# java-learning

JavaSE 学习过程中的练习代码（2026.07 起）。

环境：JDK 25 · IntelliJ IDEA 2025.1

## 学习进度

- 2026.07–09 · 基础语法 → 面向对象（封装 / 构造方法 / this / static）
- 当前前沿：**继承 / super**
- 已完成：`ArrayUtil` 工具类、学生管理系统 v1

## 目录结构

- `basic-demo/` ── 语法基础
  - `variable/` `operator/` `literal/` ── 变量、运算符、字面量
  - `ifdemo/` `switchdemo/` ── 分支
  - `loopfor/` `loopwhile/` `looploop/` `controllerloop/` `infiniteloop/` ── 循环与跳转
  - `array/` `method/` ── 数组、方法
- `oop/` ── 面向对象
  - `ooptest1` ~ `ooptest6/` ── 类与对象、封装、构造方法、static 的分阶段练习
  - `arrayutil/` ── 自写工具类 ArrayUtil + 测试
- `student-management/` ── 综合练习：学生管理系统 v1
  - 三层结构：`Student`（数据）/ `StudentService`（业务）/ `StudentApp`（界面）
- `demo/` ── 零散试验
  - `test/` ── HelloWorld、贪吃蛇练习（AI 辅助完成）

## 说明

这是**学习记录仓库**，代码按学习进度组织，不是产品项目。

每个包对应课程的一个阶段，注释里记录了当时的理解和踩过的坑。
部分代码为跟课例程，部分是自主练习，`demo/test/SnakeGame.java` 为 AI 辅助完成的练习。

## 提交约定

一次 commit 只做一件事，前缀：`feat` / `fix` / `docs` / `refactor` / `test` / `chore`。
