package com.app.runner.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.runner.entity.Children;

public interface ChildrenRepo extends JpaRepository<Children, Integer> {

}
