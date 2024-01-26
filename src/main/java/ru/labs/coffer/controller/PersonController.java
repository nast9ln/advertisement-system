package ru.labs.coffer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import ru.labs.coffer.dto.PersonDto;
import ru.labs.coffer.dto.RatingDto;

@Tag(name = "Контроллер пользователя")
public interface PersonController {
    @Operation(summary = "Получение пользователя")
    ResponseEntity<PersonDto> read(Long id);

    @Operation(summary = "Обновление пользователя")
    ResponseEntity<Void> update(PersonDto dto);

    @Operation(summary = "Удаление пользователя")
    ResponseEntity<Void> delete();

    @Operation(summary = "Оценивание пользователя, с которым есть диалог")
    ResponseEntity<Void> ratePerson(RatingDto rating);
}
