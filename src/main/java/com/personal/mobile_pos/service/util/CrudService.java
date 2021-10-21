package com.personal.mobile_pos.service.util;

import java.util.List;

public interface CrudService<T> {
    public Long add(T t);
    public Long update(T t);
    public List<T> searchLike(String searchText, Integer count, Integer page);
    public T getName(String nameText);
    public T get(Long id);
    public Long delete(Long id);
}
