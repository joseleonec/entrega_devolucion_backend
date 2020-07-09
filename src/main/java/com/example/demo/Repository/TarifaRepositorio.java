package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modelo.Tarifa;
import com.example.demo.Modelo.TarifaKey;

public interface TarifaRepositorio extends JpaRepository<Tarifa, TarifaKey> {

}
