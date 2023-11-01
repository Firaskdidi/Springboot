package com.esprit.firstproject.repository;

import com.esprit.firstproject.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Ichambre extends JpaRepository<Chambre, Integer> {
  public List<Chambre> findByIdChambre(Integer idChambre);


    public List<Chambre> findByNumeroChambre(Integer numeroChambre);
}

