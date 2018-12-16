package br.com.projetointertest.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projetointertest.model.Task;

@Component
public class TaskDao {
	
	@Autowired
	private ITaskDao taskDao;

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
