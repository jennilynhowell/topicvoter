package com.jennilyn.interfaces;

import com.jennilyn.models.Topic;

import java.util.List;

public interface TopicRepository {

    List<Topic> findAll();

}
