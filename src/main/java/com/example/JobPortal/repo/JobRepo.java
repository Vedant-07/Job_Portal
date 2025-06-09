package com.example.JobPortal.repo;

import com.example.JobPortal.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<JobPost,Integer> {

}
