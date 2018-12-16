package br.com.projetointertest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetointertest.dao.JobDao;
import br.com.projetointertest.model.Job;

@Service
public class JobService {
	
	@Autowired
	JobDao jobDao;

	public Iterable<Job> findAll() {
		return jobDao.findAll();
	}

	public Optional<Job> findById(Integer id) {
		return jobDao.findById(id);
	}
	
	public Job save(Job job) {
		return jobDao.save(job);
	}

	public void deleteById(Integer id) {
		jobDao.deleteById(id);
	}
}
