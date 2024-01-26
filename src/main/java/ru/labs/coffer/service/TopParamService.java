package ru.labs.coffer.service;

import ru.labs.coffer.dto.TopParamDto;

public interface TopParamService {
    void update(TopParamDto dto);

    void updateIsTop();
}
