package ru.labs.coffer.service;

import ru.labs.coffer.dto.PersonDto;
import ru.labs.coffer.dto.RoleDto;
import ru.labs.coffer.entity.Person;

import java.util.Set;

public interface PersonService {
    PersonDto read(Long id);

    void update(PersonDto personDto);

    void delete(Long id);

    void delete();

    Person findByLogin(String login);

    void updatePersonRole(Long id, Set<RoleDto> roles);

    void ratePerson(Long id, Integer score);
}