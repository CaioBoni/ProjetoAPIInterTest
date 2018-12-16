package br.com.projetointertest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetointertest.model.Task;
import br.com.projetointertest.services.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	@RequestMapping(value="/task", method=RequestMethod.GET)
	public Iterable<Task> findAll() {
		return taskService.findAll();
	}
	
	@RequestMapping(value="/task/{id}", method=RequestMethod.POST)
	public Optional<Task> findById(@PathVariable("id") Integer id) {
		return taskService.findById(id);
	}
	
	@RequestMapping(value="/task", method=RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Task save(@RequestBody Task task) {
		return taskService.save(task);
	}
	
	@RequestMapping(value="/task/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		taskService.deleteById(id);
	}
	
}
