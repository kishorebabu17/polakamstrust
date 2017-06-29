package com.polakams.polakamstrust.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import com.polakams.polakamstrust.model.Orphan_Prevention;
import com.polakams.polakamstrust.services.IOrphanPreventionServices;

@RestController
public class OrphanPreventionRestController {
    
	@Autowired
	IOrphanPreventionServices iOrphanPreventionServices;
	
    
    //http://localhost:8080/polakamstrust/creatpreventionidea
  	@CrossOrigin(origins = "http://localhost:8090")
  	@RequestMapping(value="/polakamstrust/creatpreventionidea",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
  	public ResponseEntity<Orphan_Prevention> create(@RequestBody Orphan_Prevention orphanPrevention ){
  		return new ResponseEntity<Orphan_Prevention>(iOrphanPreventionServices.createPreventionIdeas(orphanPrevention),HttpStatus.OK);

  	}
      
  	      
      //http://localhost:8080/polakamstrust/getallpreventionideas/0
      @CrossOrigin(origins = "http://localhost:8090")
      @RequestMapping(value="/polakamstrust/getallpreventionideas/{status}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
  	public ResponseEntity<List<Orphan_Prevention>> getall(@PathVariable int status){


  		return new ResponseEntity<List<Orphan_Prevention>>(iOrphanPreventionServices.getAllPreventionIdeas(status),HttpStatus.OK);

  	}

    
    
    
}
