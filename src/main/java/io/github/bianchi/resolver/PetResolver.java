package io.github.bianchi.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.bianchi.input.PetInput;
import io.github.bianchi.model.Person;
import io.github.bianchi.model.Pet;
import io.github.bianchi.repository.PersonRepository;
import io.github.bianchi.repository.PetRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class PetResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private PetRespository repository;

    @Autowired
    private PersonRepository personRepository;

    public Collection<Pet> findAllPets() {
        return repository.findAll();
    }

    public Pet savePet(PetInput input) {
        Person owner = personRepository.findById(input.getOwnerId()).get();
        Pet pet = new Pet(input.getName(), owner);
        return repository.save(pet);
    }
}
