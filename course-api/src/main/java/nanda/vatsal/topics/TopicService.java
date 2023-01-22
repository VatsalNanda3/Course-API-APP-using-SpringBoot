package nanda.vatsal.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework", "Spring framework desc"),
			
			new Topic("java","core java", "core java desc"),
			
			new Topic("javascript","Javascript", "Javascript desc")
		 				));
	
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();//from the topics list, we 
	
		//we use the topics stream, filter it using a lambda function where for every element in the list, we check the id and we get the very first topic element and we get it. 
	}


	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		
		topics.add(topic);
	}


	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
		
	}


	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		
		topics.removeIf(t-> t.getId().equals(id));
		
	}

}
