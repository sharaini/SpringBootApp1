package com.example.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class topicsService {
	/* in spring business service are the singletons
	 * when the app starts spring creates an instance and other controllers depends on this and spring injects to other classes
	 */
	@Autowired
	private TopicRepository topicRepository;
	List<Topic> topics =new ArrayList<Topic>(Arrays.asList(
			new Topic("spring","frame","description"),
			new Topic("spring2","frame","description"),
			new Topic("spring3","frame","description")
			));

	public List<Topic> getTopics() {
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	public Topic getTopic(String id){
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}
	public void addTopic(Topic topic){
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<topics.size();i++){		
			if(topics.get(i).getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic);
	}

	public void deleteTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		//topics.removeIf(t->t.getId().equals(id));
		topicRepository.delete(id);
	}
	
}
