package com.personal.mobile_pos.controller;


import com.personal.mobile_pos.dto.CategoryDto;
import com.personal.mobile_pos.repository.CategoryRepository;
import com.personal.mobile_pos.service.custom.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/category/")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CategoryService categoryService;

    @PostMapping("/")
    public ResponseEntity save(@RequestBody CategoryDto categoryDto){

            categoryService.add(categoryDto);
            return new ResponseEntity<>(HttpStatus.CREATED);

    }

//    @GetMapping
//    public List<CategoryDto> searchCategory(){
//        return categoryService.searchLike();
//    }

}
