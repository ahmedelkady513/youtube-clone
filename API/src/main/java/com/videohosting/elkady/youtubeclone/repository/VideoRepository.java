package com.videohosting.elkady.youtubeclone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.videohosting.elkady.youtubeclone.entity.Video;

public interface VideoRepository extends MongoRepository<Video, String> {
    
}
