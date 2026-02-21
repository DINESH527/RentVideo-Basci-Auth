package com.example.rentvideo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.rentvideo.entity.Video;
import com.example.rentvideo.service.VideoService;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public List<Video> getAll() {
        return videoService.getAll();
    }

    @PostMapping
    public Video create(@RequestBody Video video) {
        return videoService.create(video);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        videoService.delete(id);
    }
}