package com.grupoG33.reto3.service;

import com.grupoG33.reto3.model.CarModel;
import com.grupoG33.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<CarModel> obtener(){
        return carRepository.findAll();
    }

    public void crear(CarModel car){
        carRepository.save(car);
    }

    public List<CarModel> obtenerPorMarca(String brand){
        return carRepository.findByBrand(brand);
    }

    public List<CarModel> obtenerPorMarcaYAño(String brand, int year){
        return carRepository.findByBrandAndYear(brand,year);
    }

    public List<CarModel> obtenerPorMarcaOrdenado(String brand){
        return carRepository.findByBrandOrderByYearDesc(brand);
    }

    public List<CarModel> obtenerPorMarcaContenido(String value){
        return carRepository.findByBrandEndsWith(value);
    }

    public Page<CarModel> obtenerPorPaginas(String brand,int page, int size){
        Pageable pageable = PageRequest.of(page,size, Sort.by(Sort.Direction.DESC,"year"));
        return carRepository.findByBrand(brand,pageable);
    }


}
