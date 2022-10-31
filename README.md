# AppWithDocker
## About this app
The purpose of creating this simple application was to learn how to work with **Docker** containers.  
It works in **Docker** container with **MySQL** database
using [dockerfile](https://github.com/Evilkoy/AppWithDocker/blob/master/Dockerfile) and
[docker-compose](https://github.com/Evilkoy/AppWithDocker/blob/master/docker-compose.yml) file.
It has no useful features, just methods that add a text into **DB** and show all information from it by **POST** and **GET** requests
## How it works
There is only two methods in Service class
```java
public List<String> getAll() {
        return userPostDao.findAll().stream().map(UserPost::getText).collect(Collectors.toList());
    }

public void saveText(UserPost userPost) {
        userPostDao.save(userPost);
    }
```
