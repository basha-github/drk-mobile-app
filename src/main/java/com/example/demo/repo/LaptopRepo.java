package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Mobile;

public interface LaptopRepo  extends JpaRepository<Mobile, String> {

}
