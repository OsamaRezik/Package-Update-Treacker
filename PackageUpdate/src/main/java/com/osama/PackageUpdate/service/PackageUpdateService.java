package com.osama.PackageUpdate.service;

import com.osama.PackageUpdate.model.PackageUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PackageUpdateService {
    @Autowired
    ReactiveMongoTemplate mongoTemplate;

    public Flux<PackageUpdate>streamUpdates(){
        return mongoTemplate.changeStream(PackageUpdate.class)
                .watchCollection("package_updates")
                .listen()
                .map(change->change.getBody());
    }

}
