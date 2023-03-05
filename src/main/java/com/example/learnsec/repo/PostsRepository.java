package com.example.learnsec.repo;

import com.example.learnsec.model.Posts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface PostsRepository extends CrudRepository<Posts, Long> {

}