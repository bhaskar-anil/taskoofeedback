package in.taskoo.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.taskoo.feedback.entity.FeedbackDataEntity;

@Repository
public interface FeedbackDataRepository extends CrudRepository<FeedbackDataEntity, Long> {

}
