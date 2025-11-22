package service;

import dto.FeedbackDTO;
import exception.DataInvalidException;

public interface FeedbackService {
    public void validSave(FeedbackDTO feedbackDTO) throws DataInvalidException;
}
