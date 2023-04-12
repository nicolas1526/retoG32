package com.grupoG33.reto3.controller;

import com.grupoG33.reto3.dbo.ClientDbo;
import com.grupoG33.reto3.model.AdminModel;
import com.grupoG33.reto3.model.ClientModel;
import com.grupoG33.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    //@Autowired
    //AdminService adminService;

    @GetMapping("/all")
    public List<ClientModel> obtenerClientes(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearClientes(@RequestBody ClientDbo client){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
