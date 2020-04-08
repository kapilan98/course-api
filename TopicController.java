package com.firstone.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping(method = RequestMethod.GET,value="/topics")//actually default is GET simply i did  it!!
	public List<Topic> JavascriptgetAllTopics(){
		return topicservice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopicid(@PathVariable String id ) {
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicservice.addTopic(topic);
	}
	@RequestMapping(method = RequestMethod.PUT,value="/topics")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
		topicservice.updateTopic(id,topic);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
	public void updateTopic(@PathVariable String id){
		topicservice.DeleteTopic(id);
	}
}