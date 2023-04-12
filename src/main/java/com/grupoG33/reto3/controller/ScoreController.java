package com.grupoG33.reto3.controller;

import com.grupoG33.reto3.dbo.ReservationDbo;
import com.grupoG33.reto3.dbo.ScoreDbo;
import com.grupoG33.reto3.model.ReservationModel;
import com.grupoG33.reto3.model.ScoreModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    //@Autowired
    //AdminService adminService;

    @GetMapping("/all")
    public List<ScoreModel> obtenerPuntajes(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearPuntajes(@RequestBody ScoreDbo score){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
