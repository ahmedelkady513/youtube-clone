package com.videohosting.elkady.youtubeclone.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.videohosting.elkady.youtubeclone.entity.Video;
import com.videohosting.elkady.youtubeclone.repository.VideoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final S3Service s3Service;
    private final VideoRepository videoRepository;
    
    @Transactional
    public void uploadVideo(MultipartFile multipartFile) {
       String videoUrl = s3Service.uploadFile(multipartFile);
       var video = new Video();
       video.setVideoUrl(videoUrl);
       videoRepository.save(video);
    }
}
