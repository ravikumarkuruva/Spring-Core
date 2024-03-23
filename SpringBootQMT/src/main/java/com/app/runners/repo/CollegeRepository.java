package com.app.runners.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.runners.entity.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {
	@Transactional
	@Modifying
	@Query("update College set name=:name where code=:code")
	int updateNameById(String name,Integer code);
}
