package com.personal.mobile_pos.repository;

import com.personal.mobile_pos.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends CrudRepository<Category,Integer> {

    Category findByName(String name);
}
