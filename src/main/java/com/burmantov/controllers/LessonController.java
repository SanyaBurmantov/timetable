package com.burmantov.controllers;

import com.burmantov.models.Lesson;
import com.burmantov.repositories.LessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LessonController {
    @Autowired
    private LessonRepo lessonRepo;

    @GetMapping
    public String main(Map<String, Object> model){
        Iterable<Lesson> lessons = lessonRepo.findAll();

        model.put("lessons", lessons);

        return "main";
    }

    @PostMapping
    public String add(@RequestParam String name, @RequestParam String text, @RequestParam String teacher, Map<String, Object> model){
        Lesson lesson = new Lesson(name, text, teacher);
        lessonRepo.save(lesson);


        return "main";
    }

}
