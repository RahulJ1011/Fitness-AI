package com.fitness.activityService.Repository;

import com.fitness.activityService.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ActivityRepository extends MongoRepository<Activity,String> {
}
