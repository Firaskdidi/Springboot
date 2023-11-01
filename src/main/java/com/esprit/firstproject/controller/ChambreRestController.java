package com.esprit.firstproject.controller;

import com.esprit.firstproject.entity.Chambre;
import com.esprit.firstproject.service.IChambreService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreRestController {
    @Autowired
     IChambreService ichambreService;

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre c) {
         Chambre chambre= ichambreService.addChambre(c);
         return chambre;
    }

    @GetMapping("/all")
    public List<Chambre>getchambre(){
     List <Chambre> chambres= ichambreService.retrieveAllChambres();
        return chambres;
    }

    @GetMapping("/ChambreById/{idChambre}")
    public ResponseEntity<?> getbyid(@PathVariable("idChambre") Integer chid) {
        Chambre chambre = ichambreService.retrieveChambre(chid);

        if (chambre != null) {
            return ResponseEntity.ok(chambre);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Aucune chambre trouvée avec l'ID : " + chid);
        }
    }

    @DeleteMapping("/delet/{idChambre}")
    public ResponseEntity<?> removechambre(@PathVariable("idChambre")Integer chiid){
        ichambreService.removeChambre(chiid);
        return new ResponseEntity("delete succ"+chiid ,HttpStatus.CREATED);
    }

    @PutMapping("/Modi/{idChambre}")
    public ResponseEntity<?> update(@PathVariable("idChambre") Integer chidd, @RequestBody Chambre updatedChambre) {
        Chambre chambre = ichambreService.modifyChambre(chidd, updatedChambre);
        if (chambre != null) {
            return ResponseEntity.ok(chambre);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucune chambre trouvée avec l'ID : " + chidd);
        }
    }
}
