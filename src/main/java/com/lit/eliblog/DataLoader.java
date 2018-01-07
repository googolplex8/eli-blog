package com.lit.eliblog;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataLoader {
    
    private PostRepository postRepo;
    
    @Autowired
    public DataLoader(PostRepository postRepo) {
   	 this.postRepo = postRepo;
    }
    
    @PostConstruct
    private void loadData() {
    		Date d = new Date();
    		
    		Post p1 = new Post("Post 1", "Once upon a time");
    		p1.setDate(d);
    		
    		Post p2 = new Post("Post 2", "there was a boy");
    		p2.setDate(d);
    		
    		Post p3 = new Post("Post 3", "and he lived happily ever after");
    		p3.setDate(d);
    		
    		Post p4 = new Post("Post 4", "until one day!!!");
    		p4.setDate(d);
    		
    		postRepo.save(p1);
    		postRepo.save(p2);
    		postRepo.save(p3);
    		postRepo.save(p4);
    }
    
    public Iterable<Post> postReturner(){
    	return postRepo.findAll();
    	
    }
}	

