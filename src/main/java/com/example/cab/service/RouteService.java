package com.example.cab.service;

import java.util.List;

import com.example.cab.dto.RouteDto;

public interface RouteService {

	List<RouteDto> findRouteBySourceAndDestination(String source, String destination);

}
