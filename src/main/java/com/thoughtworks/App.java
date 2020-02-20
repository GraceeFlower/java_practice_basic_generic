package com.thoughtworks;

import com.thoughtworks.module.MemoryRepository;
import com.thoughtworks.module.RepositoryUtil;
import com.thoughtworks.module.Student;

public class App {

    public static void main(String[] args) {

        MemoryRepository<Student> stuMemory = new MemoryRepository<>();
        stuMemory.save("3", new Student("3", "张三"));
        stuMemory.save("4", new Student("4", "李四"));
        stuMemory.save("5", new Student("5", "王五"));
        stuMemory.save("6", new Student("6", "赵六"));
        stuMemory.save("7", new Student("7", "钱七"));

        System.out.println("- id为3的学生信息 -");
        System.out.println(stuMemory.get("3").toString());
        stuMemory.delete("4");
        stuMemory.update("5", new Student("5", "冯五"));
        System.out.println("- List中的学生信息 -");
        RepositoryUtil.printList(stuMemory);

    }
}
