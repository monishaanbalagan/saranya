package com.example.cab.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cab.model.Cab;

@Repository
public interface CabDao extends CrudRepository<Cab,Integer> {

	Optional<List<Cab>> findCabByCarNumber(String carNumber);

}
