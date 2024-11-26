package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payload;
import com.example.demo.service.PayloadService;

@RestController
@RequestMapping("/api")
public class PayloadController {

    @Autowired
    private PayloadService payloadService;

    @PostMapping("/payload")
    public ResponseEntity<?> handlePayload(@Valid @RequestBody Payload payload) {
        payloadService.savePayload(payload);
        return ResponseEntity.ok(payload);
    }

    @GetMapping("/nocontent")
    public ResponseEntity<Void> noContent() {
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/echo")
    public ResponseEntity<Payload> echo(@Valid @RequestBody Payload payload) {
        return ResponseEntity.ok(payload);
    }

    @PostMapping("/device")
    public ResponseEntity<String> device(@Valid @RequestBody Payload payload) {
        return ResponseEntity.ok("{\"DeviceId\":\"" + payload.getDeviceId() + "\"}");
    }
}