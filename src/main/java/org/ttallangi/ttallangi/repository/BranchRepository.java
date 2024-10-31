package org.ttallangi.ttallangi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ttallangi.ttallangi.model.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
}
