package com.firstone.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Java Framework","Core Java Description"),
			new Topic("Javascript","Javascript Framework","Javascript Framework Description")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){ 
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){//this works adding in to database
		topics.add(topic);
	}
	public void updateTopic(String id,Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
				return;
			}
		}
		
	}
	public void DeleteTopic(String id) {
	
		topics.removeIf(t->t.getId().equals(id));
		 
		
	}

}