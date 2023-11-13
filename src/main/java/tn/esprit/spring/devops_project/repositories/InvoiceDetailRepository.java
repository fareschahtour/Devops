package tn.esprit.spring.devops_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.devops_project.entities.InvoiceDetail;

public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetail, Long> {

}
