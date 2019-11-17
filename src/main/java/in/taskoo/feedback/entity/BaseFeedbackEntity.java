package in.taskoo.feedback.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import in.taskoo.feedback.entity.listener.BaseEntityListener;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(BaseEntityListener.class)
public class BaseFeedbackEntity implements Serializable {
  private static final long serialVersionUID = 486443016325666342L;
  
  private String updatedUser;
  private String createdUser;
  private String updatedProgram;
  private String createdProgram;
  
  private LocalDateTime systemCreatedDateTime;
  private LocalDateTime systemUpdatedDateTime;
  private Boolean systemDeleteFlag;
  @Version
  private Integer systemUpdateCount;
}
