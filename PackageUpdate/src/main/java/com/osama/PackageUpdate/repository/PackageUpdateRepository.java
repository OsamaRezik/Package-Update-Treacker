package com.osama.PackageUpdate.repository;

import com.osama.PackageUpdate.model.PackageUpdate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PackageUpdateRepository extends ReactiveMongoRepository<PackageUpdate, String> {

}
