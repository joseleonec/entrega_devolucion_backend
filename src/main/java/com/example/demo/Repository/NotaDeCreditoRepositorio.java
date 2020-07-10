package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.NotaDeCredito;

public interface NotaDeCreditoRepositorio  extends JpaRepository<NotaDeCredito, Integer> {

}
