package dev.monczall.springplayground.trainer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/trainers")
public class TrainerController {

    private final TrainerService trainerService;

}
