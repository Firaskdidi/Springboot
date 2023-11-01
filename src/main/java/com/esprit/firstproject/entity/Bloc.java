package com.esprit.firstproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Bloc implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long IdBloc;

    @ManyToOne()
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private Set<Chambre> chambres;

    private String nomBloc;
    private Long capaciteBloc;



}
