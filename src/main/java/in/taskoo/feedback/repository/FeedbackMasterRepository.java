package in.taskoo.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.taskoo.feedback.entity.FeedbackMasterEntity;

@Repository
public interface FeedbackMasterRepository extends CrudRepository<FeedbackMasterEntity, Long> {
  
}
