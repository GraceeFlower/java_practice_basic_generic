package com.thoughtworks;

public class App {

    public static void main(String[] args) {

        MemoryRepository<String> stuMemory = new MemoryRepository<>();
        stuMemory.save("3", "张三");
        stuMemory.save("4", "李四");
        stuMemory.save("5", "王五");
        stuMemory.save("6", "赵六");
        stuMemory.save("7", "钱七");

        System.out.println(stuMemory.get("3"));
        stuMemory.delete("4");
        stuMemory.update("5", "冯五");
        RepositoryUtil.printList(stuMemory);

    }
}
