package com.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ProgressModel.LearningProgress;

public interface ProgressRepo extends MongoRepository<LearningProgress,Integer>{

}
