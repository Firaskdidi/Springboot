package com.esprit.firstproject.repository;

import com.esprit.firstproject.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Ifoyer extends JpaRepository<Foyer,Integer> {

    List<Foyer> findAllFoyer();

    List<Foyer> findFoyerByIdFoyer(Integer idFoyer);

    List<Foyer> findByNomFoyer(String nomFoyer);

    List<Foyer> findByCapaciteFoyer(Long capaciteFoyer);
}
