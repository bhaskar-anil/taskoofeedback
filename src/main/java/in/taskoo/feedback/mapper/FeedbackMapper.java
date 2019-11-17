package in.taskoo.feedback.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import in.taskoo.feedback.dto.Feedback;
import in.taskoo.feedback.dto.FeedbackData;
import in.taskoo.feedback.dto.FeedbackMaster;
import in.taskoo.feedback.dto.enums.FeedbackOf;
import in.taskoo.feedback.entity.FeedbackDataEntity;
import in.taskoo.feedback.entity.FeedbackMasterEntity;
import in.taskoo.feedback.entity.SeekersFeedbackEntity;
import in.taskoo.feedback.entity.TaskersFeedbackEntity;
import in.taskoo.feedback.entity.UsersFeedbackEntity;
import in.taskoo.feedback.repository.FeedbackMasterRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FeedbackMapper {
  private final FeedbackMasterRepository feedbackMasterRepository;

  public UsersFeedbackEntity mapTousersFeedbackEntity(Feedback feedback, FeedbackOf userType) {
    UsersFeedbackEntity userEntity = userType == FeedbackOf.SEEKER ? new SeekersFeedbackEntity()
        : new TaskersFeedbackEntity();

    return userEntity
        // task data
        .setTaskId(feedback.getTask().getId())
        .setTaskTitle(feedback.getTask().getTitle())
        .setTaskCode(feedback.getTask().getTaskCode())
        
        // category data
        .setCategoryId(feedback.getCategory().getId())
        .setCategoryTitle(feedback.getCategory().getTitle())
        .setCategoryCode(feedback.getCategory().getCategoryCode())
        
        // main comment
        .setComment(feedback.getComment())
        
        // user data
        .setUserId(feedback.getUser().getId())
        .setUserEmail(feedback.getUser().getEmail())
        .setUserShortName(feedback.getUser().getShortName())
        .setUserShortName(feedback.getUser().getLongName());
  }
  
  public List<FeedbackDataEntity> generateFeedbackDataEntityList(List<FeedbackData> feedbackDataList) {
    return feedbackDataList
        .stream()
        .map(this::generateFeedbackDataEntity)
        .collect(Collectors.toList());
  }

  private FeedbackDataEntity generateFeedbackDataEntity(FeedbackData feedbackData) {
    return new FeedbackDataEntity()
    .setRating(feedbackData.getRating())
    .setComment(feedbackData.getComment())
        .setFeedbackMaster(findFeedbackMasterEntity(feedbackData.getFeedbackMster()));
  }

  private FeedbackMasterEntity findFeedbackMasterEntity(FeedbackMaster feedbackMaster) {
    return feedbackMasterRepository
        .findById(feedbackMaster.getId())
        .orElse(new FeedbackMasterEntity()
            .setShortTitle(feedbackMaster.getFeedbackMasterTitle())
            .setLongTitle(feedbackMaster.getFeedbackMasterTitle())
            );
  }

}
