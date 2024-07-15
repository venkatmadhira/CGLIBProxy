package com.neoteric.cglibproxy.demo.service;

import org.springframework.stereotype.Service;

@Service
public class VideoService {
    public void addVideo(String title) {
        System.out.println("Adding video: " + title);
    }

    public void deleteVideo(String title) {
        System.out.println("Deleting video: " + title);
    }
}
