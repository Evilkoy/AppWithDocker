package com.makson.DockerLessonApp.controller;

import com.makson.DockerLessonApp.model.UserPost;
import com.makson.DockerLessonApp.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    TextService textService;

    @PostMapping("/post")
    public ResponseEntity<HttpStatus> postText(@RequestBody UserPost userPost) {
        textService.saveText(userPost);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<String>> getText() {
        return new ResponseEntity<>(textService.getAll(), HttpStatus.OK);
    }
}
