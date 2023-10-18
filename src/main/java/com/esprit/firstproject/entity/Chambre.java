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

public class Chambre implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdChambre ;

    @ManyToOne()
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reservations> reservations;


    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;






}
