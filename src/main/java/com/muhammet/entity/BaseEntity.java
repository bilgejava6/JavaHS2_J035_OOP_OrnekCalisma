package com.muhammet.entity;

import java.util.UUID;

public class BaseEntity {
    private String uuid;
    private Long createdAt;
    private Long updatedAt;

    public BaseEntity(){
        this.uuid = UUID.randomUUID().toString();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
    }
    public String getUuid() {
        return this.uuid;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }
}
