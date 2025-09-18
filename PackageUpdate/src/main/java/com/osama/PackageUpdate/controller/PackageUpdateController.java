package com.osama.PackageUpdate.controller;

import com.osama.PackageUpdate.model.PackageUpdate;
import com.osama.PackageUpdate.repository.PackageUpdateRepository;
import com.osama.PackageUpdate.service.PackageUpdateService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/packages")
public class PackageUpdateController {

    @Autowired
    private PackageUpdateRepository repository;

    @Autowired
    private PackageUpdateService service;

    // POST: Insert new tracking event
    @PostMapping
    public Mono<PackageUpdate> addUpdate(@RequestBody PackageUpdate update) {
        return repository.save(update);
    }

    // GET: Live streaming endpoint via SSE
    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<PackageUpdate> streamUpdates() {
        return service.streamUpdates();
    }

}
