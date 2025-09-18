package com.osama.PackageUpdate.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;


@Document(collection  = "package_updates")
public class PackageUpdate {
    @Id
    private String id;
    private String trackingId;
    private String status;
    private Instant timestamp = Instant.now();

    public PackageUpdate() {

    }

    public PackageUpdate(String trackingId, String status) {
        this.trackingId = trackingId;
        this.status = status;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
