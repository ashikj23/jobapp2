package com.jobapp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobapp1.entity.JobEntity;

@Repository
public interface JobRepo extends JpaRepository<JobEntity, Integer> {

}
