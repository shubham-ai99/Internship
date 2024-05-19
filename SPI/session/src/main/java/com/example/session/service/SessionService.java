package com.example.session.service;

import com.example.session.pojo.LineItem;
import com.example.session.pojo.Session;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SessionService {
    private final Map<Integer, Session> sessions = new HashMap<>();

    public int createSession(Session session) {
        int id = Session.getIdCounter();
        session.setId(id);
        session.put(id, session);
        Session.incrementIdCounter();
        return id;
    }

    public Session getSessionById(int id) {
        return sessions.get(id);
    }

    public List<LineItem> getLineItemsBySessionId(int id) {
        Session session = sessions.get(id);
        if (session != null) {
            return session.getLineItems();
        }
        return new ArrayList<>();
    }

    public List<Session> getAllSessions() {
        return new ArrayList<>(sessions.values());
    }

    public boolean expireSession(int id) {
        if (sessions.containsKey(id)) {
            sessions.remove(id);
            return true;
        }
        return false;
    }
}

