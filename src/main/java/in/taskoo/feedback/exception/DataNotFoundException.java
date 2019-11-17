package in.taskoo.feedback.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DataNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 8203343605773014032L;

}
