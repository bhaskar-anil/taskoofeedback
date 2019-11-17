package in.taskoo.feedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "m_feedback")
@Data
@EqualsAndHashCode(callSuper=false)
public class FeedbackMasterEntity extends BaseFeedbackEntity {
  private static final long serialVersionUID = -9157232520096810429L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String textId;
  private String longTitle;
  private String shortTitle;
}
