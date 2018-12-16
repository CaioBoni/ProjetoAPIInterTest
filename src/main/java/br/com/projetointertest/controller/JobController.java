package br.com.projetointertest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetointertest.model.Job;
import br.com.projetointertest.services.JobService;

@RestController
public class JobController {
	
	@Autowired
	JobService jobService;
	
	@RequestMapping(value="/job", method=RequestMethod.GET)
	public Iterable<Job> findAll() {
		return jobService.findAll();
	}
	
	@RequestMapping(value="/job/{id}", method=RequestMethod.POST)
	public Optional<Job> findById(@PathVariable("id") Integer id) {
		return jobService.findById(id);
	}
	
	@RequestMapping(value="/job", method=RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Job save(@RequestBody Job job) {
		return jobService.save(job);
	}
	
	@RequestMapping(value="/job/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		jobService.deleteById(id);
	}

}
