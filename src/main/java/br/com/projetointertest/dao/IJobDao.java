package br.com.projetointertest.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetointertest.model.Job;

public interface IJobDao extends CrudRepository<Job, Integer>{

}
