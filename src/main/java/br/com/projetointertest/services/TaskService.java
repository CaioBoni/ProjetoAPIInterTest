package br.com.projetointertest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetointertest.dao.TaskDao;
import br.com.projetointertest.model.Task;

@Service
public class TaskService {
	
	@Autowired
	private TaskDao taskDao;

	public Iterable<Task> findAll() {
		return taskDao.findAll();
	}

	public Optional<Task> findById(Integer id) {
		return taskDao.findById(id);
	}
	
	public Task save(Task task) {
		return taskDao.save(task);
	}

	public void deleteById(Integer id) {
		taskDao.deleteById(id);
	}

}
