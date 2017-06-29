package com.polakams.polakamstrust.servicesimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.polakams.polakamstrust.model.Blog_Stories;
import com.polakams.polakamstrust.repository.IBlogStoriesRepository;
import com.polakams.polakamstrust.services.IBlogStoriesServices;


@Service
public class BlogStoriesServicesImpl implements IBlogStoriesServices{

	@Autowired
	IBlogStoriesRepository iBlogStoriesRepository;

	
	@Override
	public Blog_Stories createPost(Blog_Stories story) {
		
		Date currDate = new Date();
		
		// blogger name and created_by need to get from logged in user.
		story.setBlogger_name("Admin");
		story.setCreated_by("Admin");
		story.setCreate_date(currDate);
		
		iBlogStoriesRepository.save(story);
		return story;
	}
	@Override
	public List<Blog_Stories> getStories(String created_by) {
		List<Blog_Stories> blogStory = iBlogStoriesRepository.getStoriesbyCreatedName(created_by);
		return blogStory;
	}
	@Override
	public List<Blog_Stories> gellposts() {
		List<Blog_Stories> list =iBlogStoriesRepository.findAll();
		return list;
	}
}
