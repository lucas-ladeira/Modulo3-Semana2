package br.com.futurodev.modulo3semana2exercicios.service;

import br.com.futurodev.modulo3semana2exercicios.model.Pet;
import br.com.futurodev.modulo3semana2exercicios.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public Pet salvar(Pet pet) {
        // create / update
        return petRepository.save(pet);
    }

    public List<Pet> buscarPets() {
        // read
        return petRepository.findAll();
    }

    public void excluir(Integer id) {
        // delete
        petRepository.delete(id);
    }

}
