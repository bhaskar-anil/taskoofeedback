package in.taskoo.feedback.service.impl;

import org.springframework.stereotype.Service;

import in.taskoo.feedback.dto.Feedback;
import in.taskoo.feedback.dto.enums.FeedbackOf;
import in.taskoo.feedback.entity.SeekersFeedbackEntity;
import in.taskoo.feedback.entity.TaskersFeedbackEntity;
import in.taskoo.feedback.mapper.FeedbackMapper;
import in.taskoo.feedback.repository.SeekersFeedbackRepository;
import in.taskoo.feedback.repository.TaskersFeedbackRepository;
import in.taskoo.feedback.service.FeedbackService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {
  private final TaskersFeedbackRepository taskersFeedbackRepository;
  private final SeekersFeedbackRepository seekersFeedbackRepository;
  
  private final FeedbackMapper mapper;
  
  @Override
  public void saveFeedbackOfSeeker(Feedback feedback) {
    SeekersFeedbackEntity seekersFeedbackEntity = 
        (SeekersFeedbackEntity) mapper.mapTousersFeedbackEntity(feedback, FeedbackOf.SEEKER);
    // set something Seeker specific if required
    seekersFeedbackEntity
      .setFeedbackDataEntityList(mapper.generateFeedbackDataEntityList(feedback.getFeedbackData()));
    seekersFeedbackRepository.save(seekersFeedbackEntity);
  }
  
  @Override
  public void saveFeedbackOfTasker(Feedback feedback) {
    TaskersFeedbackEntity taskersFeedbackEntity =
        (TaskersFeedbackEntity) mapper.mapTousersFeedbackEntity(feedback, FeedbackOf.TASKER);
    // set something Tasker specific if required
    taskersFeedbackEntity
      .setFeedbackDataEntityList(mapper.generateFeedbackDataEntityList(feedback.getFeedbackData()));
    taskersFeedbackRepository.save(taskersFeedbackEntity);
  }
}
