package com.greycampus.intfc;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.greycampus.entity.City;
import com.greycampus.entity.CityEntity;

@Repository("cityRepository")
public interface CityRepo extends CrudRepository<City, Integer> {

	@Query("select new com.greycampus.entity.CityEntity(id, name) from City where state.id = :id")
	public List<CityEntity> findByState(@Param("id") int id);

}
