package com.polakams.polakamstrust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.polakams.polakamstrust.model.Blog_Stories;



public interface IBlogStoriesRepository extends JpaRepository<Blog_Stories, String> {

	
	@Query("SELECT b FROM Blog_Stories b WHERE b.created_by = :created_by")
	public List<Blog_Stories> getStoriesbyCreatedName( @Param("created_by") String created_by);
	
}
