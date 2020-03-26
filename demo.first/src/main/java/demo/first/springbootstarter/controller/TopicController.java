package demo.first.springbootstarter.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import demo.first.springbootstarter.data.Topic;
import demo.first.springbootstarter.service.TopicService;

@RestController
public class TopicController {
	
@Autowired
TopicService topicService;
			
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
				
				}
		
		@RequestMapping("/topics/{topicId}")
		public Topic getTopic(@PathVariable String topicId) {
			return topicService.getTopic(topicId);
		}


}
