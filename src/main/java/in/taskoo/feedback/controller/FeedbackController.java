package in.taskoo.feedback.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.taskoo.feedback.dto.Feedback;
import in.taskoo.feedback.service.FeedbackService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/feedbacks")
@RequiredArgsConstructor
public class FeedbackController {
  
  private final FeedbackService feedbackService;

  @PostMapping("/ofseeker")
  public void ofSeeker(@Valid @RequestBody Feedback feedback) {
    feedbackService.saveFeedbackOfSeeker(feedback);
  }

  @PostMapping("/oftasker")
  public void ofTasker(@Valid @RequestBody Feedback feedback) {
    feedbackService.saveFeedbackOfSeeker(feedback);
  }
}
