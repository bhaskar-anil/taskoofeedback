package in.taskoo.feedback.dto.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum FeedbackStatus {
  NEW(1),
  ACCEPTED(2),
  REJECTED(3);
  
  private Integer id;
  
  @JsonCreator
  public static FeedbackStatus toEnum(Integer value) {
      return Arrays.stream(FeedbackStatus.values())
              .filter(type -> type.getId().equals(value))
              .findFirst()
              .orElseThrow(null);
  }

  @JsonValue
  public Integer getId() {
      return this.id;
  }
}
