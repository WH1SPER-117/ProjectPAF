package com.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "learning_progress_updates")
public class LearningProgressUpdate {
    @Id
    private String id;
    private String userId;
    private String template; // e.g., "Today's Photography Tip", "Editing Skills Learned"
    private String content;
    private String createdAt;
}
