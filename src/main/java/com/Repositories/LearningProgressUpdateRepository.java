package com.Repositories;

import com.Models.LearningProgressUpdate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LearningProgressUpdateRepository extends MongoRepository<LearningProgressUpdate, String> {
    List<LearningProgressUpdate> findByUserId(String userId);
}
