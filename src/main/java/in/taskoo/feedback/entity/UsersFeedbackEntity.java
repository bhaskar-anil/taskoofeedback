package in.taskoo.feedback.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@MappedSuperclass
public class UsersFeedbackEntity extends BaseFeedbackEntity {
  private static final long serialVersionUID = -2742224808993394553L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String taskId;
  private String taskTitle;
  private String taskCode;
  private String categoryId;
  private String categoryTitle;
  private String categoryCode;

  private String userId;
  private String userEmail;
  private String userShortName;
  private String userLongName;



  private String comment;
}
