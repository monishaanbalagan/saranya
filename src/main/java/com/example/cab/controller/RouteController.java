package com.example.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab.dto.RouteDto;
import com.example.cab.service.RouteService;

@RestController
public class RouteController {
	@Autowired
	RouteService routeService;

	@GetMapping("/cab/routedetails")
	public List<RouteDto> findRouteBySourceAndDestination(@RequestParam("source") String source,@RequestParam("destination") String destination)
	{
		return routeService.findRouteBySourceAndDestination(source,destination);
	}

}
