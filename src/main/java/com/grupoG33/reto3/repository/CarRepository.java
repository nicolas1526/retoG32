package com.grupoG33.reto3.repository;

import com.grupoG33.reto3.model.CarModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarModel,Integer> {

    List<CarModel> findByBrandContains(String value);
    List<CarModel> findByBrandStartsWith(String value);
    List<CarModel> findByBrandEndsWith(String value);

    /*
    @Query(value = "SELECT * FROM reto3g35.car where brand=? and yyear=?", nativeQuery = true)
    List<CarModel> obtenerPorMarcaYAño(String brand, int year);*/

    List<CarModel> findByBrand(String brand);

    List<CarModel> findByBrandAndYear(String brand, int year);

    List<CarModel> findByBrandOrderByYearDesc(String brand);

    Page<CarModel> findByBrand(String brand, Pageable pageable);





}
