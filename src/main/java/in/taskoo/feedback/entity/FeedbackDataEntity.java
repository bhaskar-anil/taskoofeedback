package in.taskoo.feedback.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "t_feedback")
@Data
@EqualsAndHashCode(callSuper=false)
public class FeedbackDataEntity extends BaseFeedbackEntity {
  private static final long serialVersionUID = -8048394125202660477L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "seekers_feedback_id", referencedColumnName = "id")
  private SeekersFeedbackEntity seekersFeedbackEntity;

  @ManyToOne
  @JoinColumn(name = "taskers_feedback_id", referencedColumnName = "id")
  private TaskersFeedbackEntity taskersFeedbackEntity;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "feedback_master_id", referencedColumnName = "id")
  private FeedbackMasterEntity feedbackMaster;
  private Integer rating;
  private String comment;
}
