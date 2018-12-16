package br.com.projetointertest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.projetointertest.model.Task;

@Component
public interface ITaskDao extends CrudRepository<Task, Integer>{}
