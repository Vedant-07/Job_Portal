package com.example.JobPortal.service;

import com.example.JobPortal.model.JobPost;
import com.example.JobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    JobRepo repo;


    public List<JobPost> viewAllJobs() {
        return repo.findAll();
    }

    public void addJobPost(JobPost jobPost) {
        repo.save(jobPost);
    }

    public JobPost getJob(Integer jobId) {
        return repo.findById(jobId).orElse(null);
    }

    public String editJob(JobPost editJobPost) {
        Optional<JobPost> jobPostExists=repo.findById(editJobPost.getPostId());
        if (jobPostExists.isEmpty()){
            return "not edited";
        }
        else{
            JobPost jobPost=jobPostExists.get();

            jobPost.setPostProfile(editJobPost.getPostProfile());
            jobPost.setPostDesc(editJobPost.getPostDesc());
            jobPost.setReqExperience(editJobPost.getReqExperience());
            jobPost.setPostTechStack(editJobPost.getPostTechStack());
            repo.save(jobPost);
            return "edited";

        }
    }

    public String deleteJob(Integer jobId) {
        Optional<JobPost> jobPost=repo.findById(jobId);
        if(jobPost.isPresent())
        {
            repo.delete(jobPost.get());
            return "deleted";
        }

        return "error delting the job";
    }
}
