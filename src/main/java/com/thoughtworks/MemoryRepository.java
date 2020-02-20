package com.thoughtworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemoryRepository<I> implements Repository<I> {

    private Map<String, I> memoryMap = new HashMap<>();

    public MemoryRepository() {

    }

    public MemoryRepository(Map<String, I> memoryMap) {
        this.memoryMap = memoryMap;
    }

    public Map<String, I> getMemoryMap() {
        return memoryMap;
    }

    public void setMemoryMap(Map<String, I> memoryMap) {
        this.memoryMap = memoryMap;
    }

    @Override
    public void save(String id, I entity) {
        memoryMap.put(id, entity);
    }

    @Override
    public I get(String id) {
        return memoryMap.get(id);
    }

    @Override
    public void delete(String id) {
        memoryMap.remove(id);
    }

    @Override
    public void update(String id, I entity) {
        memoryMap.replace(id, entity);
    }

    @Override
    public Collection<I> list() {
        return memoryMap.values();
    }
}
