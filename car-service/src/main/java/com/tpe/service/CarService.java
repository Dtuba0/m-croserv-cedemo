package com.tpe.service;

import com.tpe.domain.Car;
import com.tpe.dto.CarRequest;
import com.tpe.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    private final ModelMapper modelMapper;
    public void saveCar(CarRequest carRequest) {
        Car car=modelMapper.map(carRequest, Car.class);
        carRepository.save(car);

        //todo : log işlemleri...
    }
}