package com.Controllers;

import com.Models.LearningProgressUpdate;
import com.Models.LearningPlan;
import com.Services.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/learning")
public class LearningController {

    @Autowired
    private LearningService learningService;

    // Learning Progress Updates
    @PostMapping("/updates")
    public ResponseEntity<LearningProgressUpdate> createUpdate(@RequestBody LearningProgressUpdate update) {
        return ResponseEntity.ok(learningService.createUpdate(update));
    }

    @GetMapping("/updates/{userId}")
    public ResponseEntity<List<LearningProgressUpdate>> getUpdatesByUser(@PathVariable String userId) {
        return ResponseEntity.ok(learningService.getUpdatesByUser(userId));
    }

    // Learning Plans
    @PostMapping("/plans")
    public ResponseEntity<LearningPlan> createPlan(@RequestBody LearningPlan plan) {
        return ResponseEntity.ok(learningService.createPlan(plan));
    }

    @PutMapping("/plans/{id}")
    public ResponseEntity<LearningPlan> updatePlan(@PathVariable String id, @RequestBody LearningPlan plan) {
        return ResponseEntity.ok(learningService.updatePlan(id, plan));
    }

    @DeleteMapping("/plans/{id}")
    public ResponseEntity<Void> deletePlan(@PathVariable String id) {
        learningService.deletePlan(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/plans/{userId}")
    public ResponseEntity<List<LearningPlan>> getPlansByUser(@PathVariable String userId) {
        return ResponseEntity.ok(learningService.getPlansByUser(userId));
    }
}
