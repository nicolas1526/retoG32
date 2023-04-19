package com.grupoG33.reto3.controller;

import com.grupoG33.reto3.model.CarModel;
import com.grupoG33.reto3.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public List<CarModel> obtener(){
        return carService.obtener();
    }

    @GetMapping("/all/por-marca/{brand}")
    public List<CarModel> obtenerProMarca(@PathVariable String brand){
        return carService.obtenerPorMarca(brand);
    }

    @GetMapping("/all/por-marca-año")
    public List<CarModel> obtenerPorMarcaYAño(@RequestParam String brand,@RequestParam int year){
        return carService.obtenerPorMarcaYAño(brand,year);
    }

    @GetMapping("/all/order")
    public List<CarModel> obtenerPorMarcaOrdenado(@RequestParam String brand){
        return carService.obtenerPorMarcaOrdenado(brand);
    }

    @GetMapping("/all/contains")
    public List<CarModel> obtenerPorMarcaContenido(@RequestParam String value){
        return carService.obtenerPorMarcaContenido(value);
    }

    @GetMapping("/all/page")
    public Page<CarModel> obtenerPorPaginas(@RequestParam String brand,@RequestParam int page, @RequestParam int size){
        return carService.obtenerPorPaginas(brand,page,size);
    }



    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody CarModel car){
        carService.crear(car);

    }
}
