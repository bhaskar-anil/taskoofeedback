package in.taskoo.feedback.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class FeedbackData implements Serializable {
  private static final long serialVersionUID = 1148763428302452086L;
  private FeedbackMaster feedbackMaster;
  private Integer rating;
  @Length(max = 2000)
  private String comment;
}
