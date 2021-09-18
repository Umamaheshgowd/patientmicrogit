package com.htc.appointement.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.appointement.entity.Appiontement;



public interface AppointementInterface extends JpaRepository<Appiontement, Long> {

}
