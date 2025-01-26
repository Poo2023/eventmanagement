package com.example.event.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.event.management.entities.Category;
import com.example.event.management.repo.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	public List<Category> getAllCategories() {
		return categoryRepo.findAll();
	}

	public Category getCategoryById(Long id) {
		return categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category not found with id " + id));
	}

	public Category createCategory(Category category) {
		return categoryRepo.save(category);
	}

	public void deleteCategory(Long id) {
		categoryRepo.deleteById(id);
	}

}