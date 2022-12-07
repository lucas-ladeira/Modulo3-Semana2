package br.com.futurodev.modulo3semana2exercicios.controller;

import br.com.futurodev.modulo3semana2exercicios.model.Pet;
import br.com.futurodev.modulo3semana2exercicios.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pets")
public class PetController {

    @Autowired
    private PetService petService;

    // busca de recurso Pet
    @GetMapping
    public List<Pet> get() {
        return petService.buscarPets();
    }

    // inserção de novo recurso Pet
    @PostMapping
    public Pet post(@RequestBody Pet pet) {
        return petService.salvar(pet);
    }

    // atualização de recurso Pet
    @PutMapping
    public Pet put(@RequestBody Pet pet) {
        return petService.salvar(pet);
    }

    // remoção de recurso Pet
    @DeleteMapping
    public boolean delete(@RequestBody Pet pet) {
        petService.excluir(pet.getId());
        return true;
    }

}
