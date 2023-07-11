package dev.monczall.springplayground.catching;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/catches")
public class CatchingController {

    private final CatchingService catchingService;

}
