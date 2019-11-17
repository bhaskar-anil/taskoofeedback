package in.taskoo.feedback.dto;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import in.taskoo.feedback.dto.enums.FeedbackStatus;
import lombok.Data;

@Data
public class Feedback implements Serializable {
  private static final long serialVersionUID = -2121580243511164962L;
  
  private Task task;
  private Category category;
  private User user;
  private List<FeedbackData> feedbackData;

  @Length(max = 2000)
  private String comment;
  @JsonIgnoreProperties(allowSetters = false)
  private FeedbackStatus feedbackStatus;
}
