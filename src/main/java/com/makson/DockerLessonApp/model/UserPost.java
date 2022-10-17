package com.makson.DockerLessonApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "posts")
public class UserPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "text")
    private String text;
}
