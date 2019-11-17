package in.taskoo.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.taskoo.feedback.entity.TaskersFeedbackEntity;

@Repository
public interface TaskersFeedbackRepository extends CrudRepository<TaskersFeedbackEntity, Long> {

}
