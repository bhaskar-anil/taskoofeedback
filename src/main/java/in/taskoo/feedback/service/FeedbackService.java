package in.taskoo.feedback.service;

import in.taskoo.feedback.dto.Feedback;

public interface FeedbackService {

  void saveFeedbackOfSeeker(Feedback feedback);

  void saveFeedbackOfTasker(Feedback feedback);

}
