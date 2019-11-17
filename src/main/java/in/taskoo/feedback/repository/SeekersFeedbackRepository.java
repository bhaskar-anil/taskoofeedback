package in.taskoo.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.taskoo.feedback.entity.SeekersFeedbackEntity;

@Repository
public interface SeekersFeedbackRepository extends CrudRepository<SeekersFeedbackEntity, Long> {

}
