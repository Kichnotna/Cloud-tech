package org.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CounterController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/counter")
    public String Counter() {
        return "{\"success\":" + counter.incrementAndGet() + "}";
    }
}
