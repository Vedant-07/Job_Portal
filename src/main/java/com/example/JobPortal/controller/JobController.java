package com.example.JobPortal.controller;

import com.example.JobPortal.model.JobPost;
import com.example.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // 👈 allow requests from React
public class JobController {
    @Autowired
    JobService service;

    @GetMapping({"/","/jobPosts"})
    public List<JobPost> home(){
        return service.viewAllJobs();
    }
    @GetMapping("jobPost/{id}")
    public JobPost fetchJob(@PathVariable("id") Integer jobId){

        return service.getJob(jobId);
    }

    @PostMapping("jobPost")
    public List<JobPost> handleForm(@RequestBody JobPost jobPost){
        System.out.println("im heit !!!!!!!!!!!!!!!!!!!!!!");
        service.addJobPost(jobPost);
        return service.viewAllJobs();
    }

    //remove this in later version...
    @GetMapping("viewalljobs")
    public List<JobPost> viewAllJobs(Model model){
        //model.addAttribute("jobPosts",service.viewAllJobs());
        return service.viewAllJobs();
    }

    //editing the job Post, setting the http method for editing the request
    @PutMapping("/jobPost")
    public ResponseEntity<String> editJob(@RequestBody JobPost editJobPost){
        String status=service.editJob(editJobPost);
        if (status.equals("edited"))
        return ResponseEntity.status(HttpStatus.OK).body(status);
        else return ResponseEntity.status(HttpStatus.NOT_FOUND).body(status);
    }


    @DeleteMapping("jobPost/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable("id") Integer jobId){
        String isdeleted=service.deleteJob(jobId);
        if(isdeleted.equals("deleted")){
            return ResponseEntity.status(HttpStatus.OK).body(isdeleted);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(isdeleted);
    }

}
