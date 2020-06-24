package com.example.cab.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cab.Dao.CabDao;
import com.example.cab.dto.CabDto;
import com.example.cab.dto.RouteDto;
import com.example.cab.model.Cab;
import com.example.cab.model.Route;
import com.example.cab.service.CabService;


@Service
public class CabServiceImpl implements CabService {
	@Autowired
    CabDao cabDao;
	@Override
	public List<CabDto> findCabByCarNumber(String carNumber) {

		List<CabDto> productDtoList = new ArrayList<CabDto>();
		Optional<List<Cab>> cabs = cabDao.findCabByCarNumber(carNumber);
		System.out.println(cabs);
		if(cabs.isPresent())
		return cabs.get().stream().map(cab->getCabDto(cab)).collect(Collectors.toList());
		else {
			return productDtoList;
		}
	}
	private CabDto getCabDto(Cab cab)
	{
		CabDto cabDto = new CabDto();
		BeanUtils.copyProperties(cab, cabDto);
		return cabDto;
	}

}
