package com.example.JobPortal.model;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    // No-argument constructor
    public JobPost() {
    }

    // All-argument constructor
    public JobPost(int postId, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    // Getters
    public int getPostId() {
        return postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public Integer getReqExperience() {
        return reqExperience;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    // Setters
    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public void setReqExperience(Integer reqExperience) {
        this.reqExperience = reqExperience;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }

    // Optional: toString()
    @Override
    public String toString() {
        return "JobPost{" +
                "postId=" + postId +
                ", postProfile='" + postProfile + '\'' +
                ", postDesc='" + postDesc + '\'' +
                ", reqExperience=" + reqExperience +
                ", postTechStack=" + postTechStack +
                '}';
    }
}
