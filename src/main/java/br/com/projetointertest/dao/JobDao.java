package br.com.projetointertest.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projetointertest.model.Job;

@Component
public class JobDao {
	
	@Autowired
	IJobDao jobDao;

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
