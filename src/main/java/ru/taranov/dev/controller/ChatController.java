package ru.taranov.dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @PostMapping
    public ResponseEntity<Map<String, String>> handleMessage(@RequestBody Map<String, String> payload) {
        String userMessage = payload.get("message");
        System.out.println("Пользователь написал: " + userMessage);

        // Здесь в будущем будет вызов AI
        String reply = "Ты написал: " + userMessage;

        Map<String, String> response = new HashMap<>();
        response.put("reply", reply);
        return ResponseEntity.ok(response);
    }
}

