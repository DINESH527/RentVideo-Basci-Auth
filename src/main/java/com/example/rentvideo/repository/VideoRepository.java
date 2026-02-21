package com.example.rentvideo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rentvideo.entity.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
}