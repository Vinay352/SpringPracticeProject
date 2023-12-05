package io.javabrains.springbootstarter.repository;

import io.javabrains.springbootstarter.entity.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {

    // get all topics
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)

}
