package com.esprit.firstproject.repository;

import com.esprit.firstproject.entity.Bloc;
import com.esprit.firstproject.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Ibloc extends JpaRepository<Bloc,Long> {



}
