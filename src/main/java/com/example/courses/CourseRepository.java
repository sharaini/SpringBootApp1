package com.example.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{
	/*
	 * getalltopics
	 * gettopic(id)
	 * updatetopic(topic t)
	 * deletetopic(String id)
	 */
	//if topic would have been a string you could have done something like findbyTopic(String topicId)
	public List<Course> findByTopicId(String topicId);
}
