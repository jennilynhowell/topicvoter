package com.jennilyn.controllers;

import com.jennilyn.interfaces.TopicRepository;
import com.jennilyn.models.Topic;
import com.jennilyn.repositories.TopicRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TopicController {

    @Autowired
    private TopicRepository repo;

    @RequestMapping("/")
    public String index(Model model){

        List<Topic> allTopics = repo.findAll();

        model.addAttribute("topics", allTopics);

        return "index";
    }


}
