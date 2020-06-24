package com.example.cab.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cab.Dao.RouteDao;
import com.example.cab.dto.RouteDto;
import com.example.cab.model.Route;
import com.example.cab.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService {
 @Autowired
  RouteDao routeDao;
	@Override
	public List<RouteDto> findRouteBySourceAndDestination(String source, String destination) {
		
		List<RouteDto> productDtoList = new ArrayList<RouteDto>();
		Optional<List<Route>> routes = routeDao.findRouteBySourceAndDestination(source,destination);
		System.out.println(routes);
		if(routes.isPresent())
		return routes.get().stream().map(route->getRouteDto(route)).collect(Collectors.toList());
		else {
			return productDtoList;
		}
	}
	private RouteDto getRouteDto(Route route)
	{
		RouteDto RouteDto = new RouteDto();
		BeanUtils.copyProperties(route, RouteDto);
		return RouteDto;
	}

}
