package in.taskoo.feedback.entity.listener;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.apache.commons.lang3.StringUtils;

import in.taskoo.feedback.entity.BaseFeedbackEntity;

public class BaseEntityListener {
  public static final int DB_COLUMN_LIMIT = 32;

  // TODO please change to really user and program later
  public static final String CREATE_USER = "taskoo_feedback_create_user";
  public static final String CREATE_PROGRAM = "taskoo_feedback_create_program";
  public static final String UPDATE_USER = "taskoo_feedback_update_user";
  public static final String UPDATE_PROGRAM = "taskoo_feedback_update_program";

  /**
   * It runs before saving data into DB.
   *
   * @param entity
   */
  @PrePersist
  public void prePersist(BaseFeedbackEntity entity) {

    String user = StringUtils.substring(CREATE_USER, 0, DB_COLUMN_LIMIT);
    String programName = StringUtils.substring(CREATE_PROGRAM, 0, DB_COLUMN_LIMIT);


    entity.setCreatedProgram(programName);
    entity.setCreatedUser(user);

    entity.setSystemDeleteFlag(Boolean.FALSE);
    entity.setSystemCreatedDateTime(LocalDateTime.now());
    entity.setSystemUpdatedDateTime(LocalDateTime.now());
    entity.setUpdatedProgram(programName);
    entity.setSystemUpdateCount(0);
  }

  /**
   * It runs before updating data into DB.
   *
   * @param entity
   */
  @PreUpdate
  public void preUpdate(BaseFeedbackEntity entity) {

    String programName = StringUtils.substring(UPDATE_PROGRAM, 0, DB_COLUMN_LIMIT);

    entity.setSystemUpdatedDateTime(LocalDateTime.now());
    entity.setUpdatedProgram(programName);
  }
}