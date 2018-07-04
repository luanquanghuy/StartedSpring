package com.example.demo.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("spring", "Spring", "Spring Framework Description"),
                new Topic("java", "Java Core", "Java Core Description"),
                new Topic("node", "Node JS1", "Node JS Description"),
                new Topic("node1", "Node JS", "Node JS Description")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
