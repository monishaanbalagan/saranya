package com.example.cab.service;

import java.util.List;

import com.example.cab.dto.CabDto;

public interface CabService {

	List<CabDto> findCabByCarNumber(String carNumber);

}
