package in.taskoo.feedback.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Data;

@MappedSuperclass
@Data
public class BaseFeedbackEntity implements Serializable {
  private static final long serialVersionUID = 486443016325666342L;
  
  private LocalDateTime createdDateTime;
  private LocalDateTime updatedDateTime;
  private Boolean systemDeleteFlag;
  @Version
  private Integer systemUpdateCount = 0;
  private String updatedBy;
  private String createdBy;
}
