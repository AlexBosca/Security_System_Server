package com.securitysystem.server.service;

import com.securitysystem.server.model.request.Request;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RequestService {

    private final Map<String, Request> requests = new HashMap<>();

    public Request saveRequest(Request request) {
        requests.put(request.getId(), request);
        return requests.get(request.getId());
    }

    public Map<String, Request> getAllRequests() {
        return requests;
    }

    public Request getRequestByID(String id) {
        return requests.get(id);
    }

}
