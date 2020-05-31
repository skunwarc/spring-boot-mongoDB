package com.nepal.io.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nepal.io.models.Pets;
import com.nepal.io.repositories.PetsRepository;

@RestController
@RequestMapping("/pets")
public class PetsController {

	@Autowired
	private PetsRepository petsRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Pets> getAllPets() {
		return petsRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Pets getPetsById(@PathVariable("id") ObjectId id) {
		return petsRepository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Pets pets) {
		pets.set_id(id);
		petsRepository.save(pets);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Pets createPet(@Valid @RequestBody Pets pets) {
		pets.set_id(ObjectId.get());
		petsRepository.save(pets);
		return pets;
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletePet(@PathVariable ObjectId id) {
		petsRepository.delete(petsRepository.findBy_id(id));
	}
}
