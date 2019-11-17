package in.taskoo.feedback.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class FeedbackMaster implements Serializable {
  private static final long serialVersionUID = -5872286261545333845L;
  
  private Long id;
  private String feedbackMasterTitle;
}
