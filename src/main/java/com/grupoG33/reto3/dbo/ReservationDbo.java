package com.grupoG33.reto3.dbo;

import com.grupoG33.reto3.model.CarModel;
import com.grupoG33.reto3.model.ClientModel;
import com.grupoG33.reto3.model.ScoreModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDbo {
    private int idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status;
    private ScoreModel score;
    private CarModel car;
    private ClientModel client;
}
