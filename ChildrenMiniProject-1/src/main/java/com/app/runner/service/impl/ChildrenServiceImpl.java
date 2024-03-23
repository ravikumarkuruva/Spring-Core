package com.app.runner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.app.runner.entity.Children;
import com.app.runner.repo.ChildrenRepo;
import com.app.runner.service.IChildrenService;
@Service
public class ChildrenServiceImpl implements IChildrenService {
	@Autowired
	ChildrenRepo repo;
	
	public Integer saveChild(Children c) {
		repo.save(c);
		return c.getId();
	}

	@CacheEvict(value = "users", key = "#id")
	public void deleteChild(Integer id) {
		repo.deleteById(id);

	}

	@CachePut(value = "users", key = "#id")
	public void updateChild(Integer id,Children c) {
		Children ch=repo.findById(id).get();
		ch.setAge(c.getAge());
		ch.setId(c.getId());
		ch.setName(c.getName());
		repo.save(ch);
	}

	@Cacheable(value = "users", key = "#id")
	public Children getChildById(Integer id) {
		
		return repo.findById(id).get();
	}

}
