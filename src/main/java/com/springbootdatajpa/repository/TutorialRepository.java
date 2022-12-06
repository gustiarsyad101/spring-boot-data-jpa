package com.springbootdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdatajpa.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>  {
	List<Tutorial> findByTitleContaining(String title);
}
