package com.Models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "learning_plans")
public class LearningPlan {
    @Id
    private String id;
    private String userId;
    private String title; // e.g., "Mastering Portrait Photography"
    private List<String> topics;
    private List<String> resources;
    private String timeline; // e.g., "Complete by May 2025"
    private boolean completed;
}
