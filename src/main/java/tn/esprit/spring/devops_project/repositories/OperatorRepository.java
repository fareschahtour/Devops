package tn.esprit.spring.devops_project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.devops_project.entities.Operator;

public interface OperatorRepository extends CrudRepository<Operator, Long> {

}
