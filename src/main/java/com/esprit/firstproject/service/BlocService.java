package com.esprit.firstproject.service;

import com.esprit.firstproject.entity.Bloc;
import com.esprit.firstproject.entity.Chambre;
import com.esprit.firstproject.repository.Ibloc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlocService implements IBlocService{
    @Autowired
    private Ibloc ibloc;
    @Override
    public List<Bloc> retrieveAllBloc() {
        return ibloc.findAll();
    }

    @Override
    public Bloc retrieveBloc(Integer IdBloc) {
        Optional<Bloc> opt = ibloc.findById(IdBloc);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return ibloc.save(b);
    }

    @Override
    public void removeBloc(Integer IdBloc) {
        ibloc.deleteById(IdBloc);
    }

    @Override
    public Bloc modifyBloc(Integer IdBloc, Bloc updatedBloc) {
        Optional<Bloc> optmodifiy = ibloc.findById(IdBloc);
        if (optmodifiy.isPresent()) {
            Bloc blocexist = optmodifiy.get();

            blocexist.setCapaciteBloc(updatedBloc.getCapaciteBloc());
            blocexist.setNomBloc(updatedBloc.getNomBloc());

        } else {
            return null;
        }
        return null;
    }
}
