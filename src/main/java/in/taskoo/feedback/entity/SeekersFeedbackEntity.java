package in.taskoo.feedback.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "t_seekers_feedback")
@Data
@EqualsAndHashCode(callSuper = false)
public class SeekersFeedbackEntity extends UsersFeedbackEntity {
  private static final long serialVersionUID = 2177907207462975302L;

  @OneToMany(mappedBy = "seekersFeedbackEntity", cascade = CascadeType.ALL)
  private List<FeedbackDataEntity> feedbackDataEntityList;
}
