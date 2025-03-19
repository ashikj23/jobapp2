package com.jobapp1.service;

import java.util.List;

import com.jobapp1.entity.JobEntity;

public interface JobService {

	List<JobEntity> getJobs();

	JobEntity getJob(int id);

	JobEntity addJob(JobEntity job);

	JobEntity updateJob(JobEntity job);

	void deleteJob(int id);
	
	

}
