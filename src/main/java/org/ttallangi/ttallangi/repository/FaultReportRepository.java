package org.ttallangi.ttallangi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ttallangi.ttallangi.model.FaultReport;

public interface FaultReportRepository extends JpaRepository<FaultReport, Integer> {

}
