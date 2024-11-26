package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payload;
import com.example.demo.repository.PayloadRepository;

@Service
public class PayloadService {

    @Autowired
    private PayloadRepository payloadRepository;

    public Payload savePayload(Payload payload) {
        return payloadRepository.save(payload);
    }
}