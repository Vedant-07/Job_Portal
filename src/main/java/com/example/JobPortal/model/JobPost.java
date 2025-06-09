package com.example.JobPortal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
@Entity
//@Scope("prototype")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class JobPost {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
