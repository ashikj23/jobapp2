package com.jobapp1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobapp1.entity.JobEntity;
import com.jobapp1.service.JobService;

@RestController
public class JobController {


	private JobService jobService;

	JobController(JobService jobService) {
        this.jobService = jobService;
	}
	
	@GetMapping("/jobs")
	public List<JobEntity> getJobs() {
		return jobService.getJobs();
	}
	@GetMapping("/jobs/{id}")
	public JobEntity getJob(@PathVariable int id) {
		return jobService.getJob(id);
	}
	@PostMapping("/jobs")
	public JobEntity addJob(@RequestBody JobEntity job) {
		return jobService.addJob(job);
	}
	@PutMapping("/jobs")
	public JobEntity updateJob(@RequestBody JobEntity job) {
		return jobService.updateJob(job);
	}
	@DeleteMapping("/jobs/{id}")
	public void deleteJob(@PathVariable int id) {
		jobService.deleteJob(id);
	}
	
}
