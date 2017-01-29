package com.example.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String>{
	/*
	 * getalltopics
	 * gettopic(id)
	 * updatetopic(topic t)
	 * deletetopic(String id)
	 */
	
}
