package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring FrameWork", "Spring FrameWork Desc"),
			new Topic("java", "java", "java FrameWork Desc"), new Topic("js", "js FrameWork", "js FrameWork Desc")));

	public List<Topic> getTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(x -> x.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}
	
	public void deleteTopic(String id) {
		topics.removeIf(topic->topic.getId().equals(id));
	}

}
