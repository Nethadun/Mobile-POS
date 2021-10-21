package com.personal.mobile_pos.service.custom.impl;

import com.personal.mobile_pos.dto.CategoryDto;
import com.personal.mobile_pos.entity.Category;
import com.personal.mobile_pos.enums.Status;
import com.personal.mobile_pos.repository.CategoryRepository;
import com.personal.mobile_pos.service.custom.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Long add(CategoryDto categoryDto) {
        Category category= new Category();
        category.setName(categoryDto.getName());
        category.setStatus(Status.ACTIVE);
        Category saved = categoryRepository.save(category);
        return saved.getId();
    }

    @Override
    public Long update(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public List<CategoryDto> searchLike(String searchText, Integer count, Integer page) {
        return null;
    }

    @Override
    public CategoryDto getName(String nameText) {
        return null;
    }

    @Override
    public CategoryDto get(Long id) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }
}
