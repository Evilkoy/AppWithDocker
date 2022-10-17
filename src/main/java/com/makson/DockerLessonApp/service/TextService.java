package com.makson.DockerLessonApp.service;

import com.makson.DockerLessonApp.dao.UserPostDao;
import com.makson.DockerLessonApp.model.UserPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TextService {
    @Autowired
    UserPostDao userPostDao;

    public List<String> getAll() {
        return userPostDao.findAll().stream().map(UserPost::getText).collect(Collectors.toList());
    }

    public void saveText(UserPost userPost) {
        userPostDao.save(userPost);
    }
}
