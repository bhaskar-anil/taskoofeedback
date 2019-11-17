package in.taskoo.feedback.dto.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum FeedbackOf {
  TASKER(1),
  SEEKER(2);
  
  private Integer id;
  
  @JsonCreator
  public static FeedbackOf toEnum(Integer value) {
      return Arrays.stream(FeedbackOf.values())
              .filter(type -> type.getId().equals(value))
              .findFirst()
              .orElseThrow(null);
  }

  @JsonValue
  public Integer getId() {
      return this.id;
  }
}
