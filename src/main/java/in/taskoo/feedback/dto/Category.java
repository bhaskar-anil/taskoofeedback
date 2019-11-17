package in.taskoo.feedback.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class Category implements Serializable {
  private static final long serialVersionUID = -5184755105254728874L;

  @Length(max = 50)
  private String id;
  @Length(max = 100)
  private String title;
  @Length(max = 100)
  private String categoryCode;
}
