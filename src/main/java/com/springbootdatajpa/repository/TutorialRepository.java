package com.springbootdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdatajpa.model.ModelTutorial;

public interface TutorialRepository extends JpaRepository<ModelTutorial, Long>  {
	List<ModelTutorial> findByTitleContaining(String title);
}
