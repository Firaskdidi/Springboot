package com.esprit.firstproject.repository;


import com.esprit.firstproject.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Iuniversite extends JpaRepository<Universite,Integer> {


    List<Universite> findByIdUniversite(Integer idUniversite);

    List<Universite> findByNomUniversite(String nomUniversite);

    List<Universite> findByAddress(String address);

}
