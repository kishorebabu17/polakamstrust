package com.polakams.polakamstrust.services;
import java.util.List;

import com.polakams.polakamstrust.model.Blog_Stories;


public interface IBlogStoriesServices {
	public Blog_Stories  createPost(Blog_Stories blogStories);

	public List<Blog_Stories> getStories(String created_by);
	public List<Blog_Stories> gellposts();
}
