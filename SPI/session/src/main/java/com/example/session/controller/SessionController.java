package com.example.session.controller;

import com.example.session.pojo.LineItem;
import com.example.session.pojo.Session;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/checkout/sessions")
public class SessionController {
    private Map<Integer, Session> sessions = new HashMap<>();

    @PostMapping
    public Map<String, Integer> createSession(@RequestBody Session session) {
        int sessionId = session.getId();
        sessions.put(sessionId, session);
        Map<String, Integer> response = new HashMap<>();
        response.put("id", sessionId);
        return response;
    }

    @GetMapping("/{id}")
    public Session getSessionById(@PathVariable int id) {
        return sessions.get(id);
    }

    @GetMapping("/{id}/line_items")
    public List<LineItem> getLineItemsBySessionId(@PathVariable int id) {
        Session session = sessions.get(id);
        if (session != null) {
            return session.getLineItems();
        }
        return new ArrayList<>();
    }

    @GetMapping
    public List<Session> getAllSessions() {
        return new ArrayList<>(sessions.values());
    }

    @PostMapping("/{id}/expire")
    public String expireSession(@PathVariable int id) {
        if (sessions.containsKey(id)) {
            sessions.remove(id);
            return "Session expired successfully";
        }
        return "Session not found";
    }
}

