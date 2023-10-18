package com.esprit.firstproject.repository;


import com.esprit.firstproject.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface Ietudiant extends JpaRepository<Etudiant,Integer>
{
    List<Etudiant> findAll();

    List<Etudiant> findEtudiantByEcole(String ecole);

    Etudiant findEtudiantByCin(Integer cin);

    List<Etudiant> findEtudiantByDateNaissance(Date dateNaissance);




}
