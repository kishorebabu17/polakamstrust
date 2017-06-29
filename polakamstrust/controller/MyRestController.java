package com.polakams.polakamstrust.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.polakams.polakamstrust.model.Blog_Stories;
import com.polakams.polakamstrust.services.IBlogStoriesServices;


@RestController
public class MyRestController {

	@Autowired 
	IBlogStoriesServices iBlogStoriesServices;

	//http://localhost:8080/polakamstrust/createpost
	@CrossOrigin(origins = "http://localhost:8090")
	@RequestMapping(value="/polakamstrust/createpost",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Blog_Stories> create(@RequestBody Blog_Stories blogStories ){

		System.out.println(blogStories.toString());
		return new ResponseEntity<Blog_Stories>(iBlogStoriesServices.createPost(blogStories),HttpStatus.OK);

	}
    
	//http://localhost:8080/polakamstrust/getpost/kishore
    @RequestMapping(value="/polakamstrust/getpost/{created_by}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Blog_Stories>> getpost(@PathVariable String created_by){


		return new ResponseEntity<List<Blog_Stories>>(iBlogStoriesServices.getStories(created_by),HttpStatus.OK);

	}
    
    //http://localhost:8080/polakamstrust/getallposts
    @CrossOrigin(origins = "http://localhost:8090")
    @RequestMapping(value="/polakamstrust/getallposts",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Blog_Stories>> getall(){


		return new ResponseEntity<List<Blog_Stories>>(iBlogStoriesServices.gellposts(),HttpStatus.OK);

	}

}