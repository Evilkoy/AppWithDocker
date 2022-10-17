package com.makson.DockerLessonApp.dao;

import com.makson.DockerLessonApp.model.UserPost;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserPostDao extends CrudRepository<UserPost, Long> {
    public List<UserPost> findAll();
}
