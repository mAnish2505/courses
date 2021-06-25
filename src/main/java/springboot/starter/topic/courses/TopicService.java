package springboot.starter.topic.courses;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{
   public List <Topic> topics= Arrays.asList(new Topic("java","CoreJava","CoreJava is Start of Java"),
           new Topic("spring","Spring","Spring is Start of spring Framework"),new Topic("javascript","JavaScript","JavaScript is Start of Web Tech"));

   public List<Topic> getAllTopics()
   {
       return topics;
   }
}
