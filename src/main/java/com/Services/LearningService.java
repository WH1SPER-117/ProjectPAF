package com.Services;


import com.Models.LearningProgressUpdate;
import com.Models.LearningPlan;
import com.Repositories.LearningProgressUpdateRepository;
import com.Repositories.LearningPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LearningService {

    @Autowired
    private LearningProgressUpdateRepository updateRepository;

    @Autowired
    private LearningPlanRepository planRepository;

    // Learning Progress Updates
    public LearningProgressUpdate createUpdate(LearningProgressUpdate update) {
        update.setCreatedAt(LocalDateTime.now().toString());
        return updateRepository.save(update);
    }

    public List<LearningProgressUpdate> getUpdatesByUser(String userId) {
        return updateRepository.findByUserId(userId);
    }

    // Learning Plans
    public LearningPlan createPlan(LearningPlan plan) {
        return planRepository.save(plan);
    }

    public LearningPlan updatePlan(String id, LearningPlan plan) {
        plan.setId(id);
        return planRepository.save(plan);
    }

    public void deletePlan(String id) {
        planRepository.deleteById(id);
    }

    public List<LearningPlan> getPlansByUser(String userId) {
        return planRepository.findByUserId(userId);
    }
}
