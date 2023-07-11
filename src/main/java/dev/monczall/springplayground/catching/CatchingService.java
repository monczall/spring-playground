package dev.monczall.springplayground.catching;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CatchingService {

    private final CatchingRepository catchingRepository;

}
