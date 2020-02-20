package com.thoughtworks;

import java.util.Collection;

public class RepositoryUtil<E> {

    public static <E> void printList(MemoryRepository<E> memory) {
        Collection<E> list = memory.list();
        System.out.println(list);
    }
}
