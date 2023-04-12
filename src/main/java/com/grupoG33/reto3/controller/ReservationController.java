package com.grupoG33.reto3.controller;

import com.grupoG33.reto3.dbo.MessageDbo;
import com.grupoG33.reto3.dbo.ReservationDbo;
import com.grupoG33.reto3.model.MessageModel;
import com.grupoG33.reto3.model.ReservationModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    //@Autowired
    //AdminService adminService;

    @GetMapping("/all")
    public List<ReservationModel> obtenerReservas(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearReservas(@RequestBody ReservationDbo reservation){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
