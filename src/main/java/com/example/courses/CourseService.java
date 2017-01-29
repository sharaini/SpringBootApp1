package com.example.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	/* in spring business service are the singletons
	 * when the app starts spring creates an instance and other controllers depends on this and spring injects to other classes
	 */
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		//return topics;
		List<Course> courses = new ArrayList<>();
		//courseRepository.findAll().forEach(topics::add);
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id){
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}
	public void addCourse(Course course){
		//topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<topics.size();i++){		
			if(topics.get(i).getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}*/
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		//topics.removeIf(t->t.getId().equals(id));
		courseRepository.delete(id);
	}
	
}
