package tn.esprit.spring.devops_project.services.Iservices;

import tn.esprit.spring.devops_project.entities.Operator;

import java.util.List;


public interface IOperatorService {

	List<Operator> retrieveAllOperators();

	Operator addOperator(Operator operator);

	void deleteOperator(Long id);

	Operator updateOperator(Operator operator);

	Operator retrieveOperator(Long id);

}
