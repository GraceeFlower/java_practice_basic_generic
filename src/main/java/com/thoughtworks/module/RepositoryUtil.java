package com.thoughtworks.module;

import java.util.Collection;

public class RepositoryUtil<E> {

    public static <E> void printList(MemoryRepository<E> memory) {
        Collection<E> list = memory.list();
        for (E ele: list) {
            System.out.println(ele.toString());
        }
    }
}
