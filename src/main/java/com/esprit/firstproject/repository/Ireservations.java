package com.esprit.firstproject.repository;

import com.esprit.firstproject.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface Ireservations extends JpaRepository<Reservations,String> {
    List<Reservations> findByIdReservation(String idReservation);
    List<Reservations> findByAnneeUniversitaire(Date anneeUniversitaire);

    List<Reservations> findByConfirmation(Boolean estValid);



}
