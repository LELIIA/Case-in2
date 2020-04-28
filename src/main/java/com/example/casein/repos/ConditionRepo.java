package com.example.casein.repos;

import com.example.casein.domain.Condition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepo extends CrudRepository<Condition, Long> {
}
