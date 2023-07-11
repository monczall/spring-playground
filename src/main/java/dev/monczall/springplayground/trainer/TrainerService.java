package dev.monczall.springplayground.trainer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class TrainerService {

    private final TrainerRepository trainerRepository;

}
