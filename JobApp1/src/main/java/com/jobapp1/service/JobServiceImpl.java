package com.jobapp1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jobapp1.entity.JobEntity;
import com.jobapp1.repository.JobRepo;

import jakarta.transaction.Transactional;
@Service

public class JobServiceImpl implements JobService {

	private JobRepo jobRepository;

	JobServiceImpl(JobRepo jobRepository) {
        this.jobRepository =jobRepository;
	}

	public List<JobEntity> getJobs() {
		return jobRepository.findAll();
	}

	public JobEntity getJob(int id) {
		Optional<JobEntity> job = jobRepository.findById(id);
		if (job.isPresent()) {
			return job.get();
		} else {
			return null;
		}
	}

	@Transactional
	public JobEntity addJob(JobEntity job) {
		return jobRepository.save(job);
	}

	@Transactional
	public JobEntity updateJob(JobEntity job) {
		return jobRepository.save(job);
	}

	public void deleteJob(int id) {
		jobRepository.deleteById(id);
	}

	
}
