package com.thoughtworks;

import java.util.Collection;

public interface Repository<I> {
    void save(String id, I entity);
    I get(String id);
    void delete(String id);
    void update(String id, I entity);
    Collection<I> list();
}
