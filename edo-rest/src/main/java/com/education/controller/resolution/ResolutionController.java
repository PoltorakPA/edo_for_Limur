package com.education.controller.resolution;

import com.education.service.appeal.AppealService;
import com.education.service.resolution.ResolutionService;
import io.swagger.annotations.ApiOperation;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import model.dto.EmployeeDto;
import model.dto.QuestionDto;
import model.dto.ResolutionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author Aleksandr Kostenko
 * Контроллер в модуле edo-rest, работает с моделью ResolutionDto,
 * которая произошла из сущности Resolution выполняет несколько операций:
 * добавляет резолюцию

 */
/**
 * Служит для связи с сервисом ResolutionService
 */
@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping("api/rest/resolution")
public class ResolutionController {

    private final ResolutionService resolutionService;

    @ApiOperation(value = "Добавление резолюции")
    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<ResolutionDto> saveResolution(@RequestBody ResolutionDto resolutionDto) {
        log.info("POST request has been sent");
        resolutionService.save(resolutionDto);
        log.info("{} has has been added", resolutionDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
