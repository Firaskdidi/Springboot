package com.esprit.firstproject.repository;

import com.esprit.firstproject.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Ibloc extends JpaRepository<Bloc,Integer> {

    List<Bloc> findAllBloc();

    Bloc findBlocById(Integer IdBloc);

    Bloc findBlocByNom(String nomBloc);



}
