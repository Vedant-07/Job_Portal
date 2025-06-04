package com.example.JobPortal.service;

import com.example.JobPortal.model.JobPost;
import com.example.JobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo repo;


    public List<JobPost> viewAllJobs() {
        return repo.getAllJobs();
    }

    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);
    }
}
