package com.thoughtworks;

import java.util.List;

public interface Repository<I> {
    void save(String id, I entity);
    List<I> get(String id);
    void delete(String id);
    void update(String id, I entity);
    List<I> list();
}
