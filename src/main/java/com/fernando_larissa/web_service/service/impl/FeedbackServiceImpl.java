package com.fernando_larissa.web_service.service.impl;

import com.fernando_larissa.web_service.exception.ResourceNotFoundException;
import com.fernando_larissa.web_service.model.Feedback;
import com.fernando_larissa.web_service.repository.FeedbackRepository;
import com.fernando_larissa.web_service.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public List<Feedback> getFeedbacksByStatus(String status) {
        return feedbackRepository.findByStatus(status);
    }

    @Override
    public Feedback getFeedbackById(Long id) {
        return feedbackRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Feedback not found with id: " + id));
    }

    @Override
    public Feedback updateFeedback(Long id, Feedback feedbackDetails) {
        Feedback feedback = getFeedbackById(id);
        feedback.setTitulo(feedbackDetails.getTitulo());
        feedback.setDescricao(feedbackDetails.getDescricao());
        feedback.setData(feedbackDetails.getData());
        feedback.setStatus(feedbackDetails.getStatus());
        feedback.setResposta(feedbackDetails.getResposta());
        return feedbackRepository.save(feedback);
    }

    @Override
    public void deleteFeedback(Long id) {
        Feedback feedback = getFeedbackById(id);
        feedbackRepository.delete(feedback);
    }
}
