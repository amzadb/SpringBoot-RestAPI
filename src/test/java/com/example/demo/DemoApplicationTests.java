package com.example.demo;

import com.example.demo.model.Payload;
import com.example.demo.repository.PayloadRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private PayloadRepository payloadRepository;

    @Test
    public void testHandlePayload() {
        String url = "http://localhost:" + port + "/api/payload";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer valid-token");

        Payload payload = new Payload();
        payload.setRecordType("xxx");
        payload.setDeviceId("357370040159770");
        payload.setEventDateTime("2014-05-12T05:09:48Z");
        payload.setFieldA(68);
        payload.setFieldB("xxx");
        payload.setFieldC(123.45);

        HttpEntity<Payload> request = new HttpEntity<>(payload, headers);
        ResponseEntity<Payload> response = restTemplate.exchange(url, HttpMethod.POST, request, Payload.class);

        assertThat(response.getStatusCodeValue()).isEqualTo(200);
        assertThat(payloadRepository.findAll()).isNotEmpty();
    }
}
