package com.fernando_larissa.web_service.service;

import com.fernando_larissa.web_service.model.Feedback;
import java.util.List;

public interface FeedbackService {
    Feedback saveFeedback(Feedback feedback);
    List<Feedback> getAllFeedbacks();
    List<Feedback> getFeedbacksByStatus(String status);
    Feedback getFeedbackById(Long id);
    Feedback updateFeedback(Long id, Feedback feedbackDetails);
    void deleteFeedback(Long id);
}
