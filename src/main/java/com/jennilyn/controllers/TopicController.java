package com.jennilyn.controllers;

import com.jennilyn.models.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TopicController {

    @RequestMapping("/")
    public String index(Model model){
        Topic first = new Topic(1, "JavaSpring", "Let's learn Spring");
        Topic second = new Topic(2, "Node", "How do we use JS on the back end?");
        Topic third = new Topic(3, "React", "What's a single-page app, anyway?");

        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(first);
        topics.add(second);
        topics.add(third);

        model.addAttribute("topics", topics);

        return "index";
    }


}
