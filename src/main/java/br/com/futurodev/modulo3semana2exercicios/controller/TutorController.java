package br.com.futurodev.modulo3semana2exercicios.controller;

import br.com.futurodev.modulo3semana2exercicios.model.Tutor;
import br.com.futurodev.modulo3semana2exercicios.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    // busca de recurso Tutor
    @GetMapping
    public List<Tutor> get() {
        return tutorService.buscarTutores();
    }

    // inserção de novo recurso Tutor
    @PostMapping
    public Tutor post(@RequestBody Tutor tutor) {
        return tutorService.salvar(tutor);
    }

    // atualização de recurso Tutor
    @PutMapping
    public Tutor put(@RequestBody Tutor tutor) {
        return tutorService.salvar(tutor);
    }

    // remoção de recurso Tutor
    @DeleteMapping
    public boolean delete(@RequestBody Tutor tutor) {
        tutorService.excluir(tutor.getId());
        return true;
    }

}
