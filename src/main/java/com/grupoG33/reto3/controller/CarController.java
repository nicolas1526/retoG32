package com.grupoG33.reto3.controller;

import com.grupoG33.reto3.dbo.CarDbo;
import com.grupoG33.reto3.model.CarModel;
import com.grupoG33.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    //@Autowired
    //AdminService adminService;

    @GetMapping("/all")
    public List<CarModel> obtenerCarros(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearCarros(@RequestBody CarDbo car){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
