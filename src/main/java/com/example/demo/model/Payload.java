package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Payload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @JsonProperty("RecordType")
    private String recordType;

    @NotNull
    @JsonProperty("DeviceId")
    private String deviceId;

    @NotNull
    @JsonProperty("EventDateTime")
    private String eventDateTime;

    @NotNull
    @JsonProperty("FieldA")
    private Integer fieldA;

    @NotNull
    @JsonProperty("FieldB")
    private String fieldB;

    @NotNull
    @JsonProperty("FieldC")
    private Double fieldC;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public Integer getFieldA() {
        return fieldA;
    }

    public void setFieldA(Integer fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public Double getFieldC() {
        return fieldC;
    }

    public void setFieldC(Double fieldC) {
        this.fieldC = fieldC;
    }
}