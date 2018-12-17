package br.com.projetointertest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import br.com.projetointertest.dao.JobDao;
import br.com.projetointertest.model.Job;

@Service
public class JobService implements ApplicationRunner {

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

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Testando referência circular");

		Job j = new Job();
		j.setName("teste");
		j.setRequired(true);
		try {
			save(j);
		} catch (Exception e) {
			System.out.println(e);
		}
		j.setParentJob(j);
		save(j);
	}
	
}
