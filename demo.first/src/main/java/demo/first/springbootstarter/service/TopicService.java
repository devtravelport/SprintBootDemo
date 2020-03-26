package demo.first.springbootstarter.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import demo.first.springbootstarter.data.Topic;

@Service
public class TopicService {
	
	private List<Topic> topicList = Arrays.asList(
			new Topic("spring", "spring framework", "spring framework bootcamp"),
			new Topic("java", "java basics", "java  bootcamp"));
	
	public List<Topic> getAllTopics(){
		return topicList;
	}
	
	public Topic getTopic(String id) {
		return topicList.stream().filter(x -> x.getId().equals(id)).findFirst().get();
	}

}
