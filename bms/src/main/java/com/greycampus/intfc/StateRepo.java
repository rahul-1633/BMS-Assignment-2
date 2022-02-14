package com.greycampus.intfc;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.greycampus.entity.State;
import com.greycampus.entity.StateEntity;

@Repository("stateRepository")
public interface StateRepo extends CrudRepository<State, Integer> {

	@Query("select new com.greycampus.entity.StateEntity(id, name) from State where country.id = :id")
	public List<StateEntity> findByCountry(@Param("id") int id);

}
