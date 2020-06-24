package com.example.cab.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cab.model.Route;

@Repository
public interface RouteDao extends CrudRepository<Route,Integer> {
	public Optional<List<Route>> findRouteBySourceAndDestination(String source, String destination);

	public Route findPriceByRouteId(int routeId);

}
