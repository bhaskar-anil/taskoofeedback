package in.taskoo.feedback.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "t_taskers_feedback")
@Data
@EqualsAndHashCode(callSuper=false)
public class TaskersFeedbackEntity extends UsersFeedbackEntity {
  private static final long serialVersionUID = -2742084808993394553L;

  @OneToMany(mappedBy = "taskersFeedbackEntity", cascade = CascadeType.ALL)
  private List<FeedbackDataEntity> feedbackDataEntityList;
}
