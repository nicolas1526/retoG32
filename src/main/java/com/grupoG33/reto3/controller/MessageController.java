package com.grupoG33.reto3.controller;

import com.grupoG33.reto3.dbo.GamaDbo;
import com.grupoG33.reto3.dbo.MessageDbo;
import com.grupoG33.reto3.model.GamaModel;
import com.grupoG33.reto3.model.MessageModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    //@Autowired
    //AdminService adminService;

    @GetMapping("/all")
    public List<MessageModel> obtenerMensajes(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearMensajes(@RequestBody MessageDbo message){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
