package service.impl;

import dto.FeedbackDTO;
import exception.DataInvalidException;
import service.FeedbackService;

public class FeedBackServiceImpl implements FeedbackService {
    @Override
    public void validSave(FeedbackDTO feedbackDTO) throws DataInvalidException {
        System.out.println("The Feedback service implemented");

        String name=feedbackDTO.getName();
        String email=feedbackDTO.getEmail();
        String comment=feedbackDTO.getComment();
        String star=feedbackDTO.getStar();

        boolean inValid=false;
        if(name==null || name.length()<3){
            inValid=true;
        } else if (email==null || email.length()<3) {
            inValid=true;
        } else if (comment==null || comment.length()<5) {
            inValid=true;
        }
        else if(star==null){
            inValid=true;
        }
        if(inValid){
            throw new DataInvalidException("The provided data is not valid");
        }

    }
}
