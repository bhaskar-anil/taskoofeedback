package in.taskoo.feedback.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class Task implements Serializable {
  private static final long serialVersionUID = 7145884479752362919L;
  @Length(max = 50)
  private String id;
  @Length(max = 200)
  private String title;
  @Length(max = 200)
  private String taskCode;
}
