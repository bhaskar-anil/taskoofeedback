package in.taskoo.feedback.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class User implements Serializable {
  private static final long serialVersionUID = 2917578992975010857L;

  @Length(max = 50)
  private String id;
  @Length(max = 100)
  private String email;
  @Length(max = 100)
  private String shortName;
  @Length(max = 100)
  private String longName;
}
