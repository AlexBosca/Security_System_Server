package com.securitysystem.server.controller;

import com.securitysystem.server.model.request.Request;
import com.securitysystem.server.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {

    private final RequestService service;

    @Autowired
    public RequestController(RequestService service) {
        this.service = service;
    }

    @PostMapping("/send")
    public Request sendRequest(@RequestBody Request request) {
        return service.saveRequest(request);
    }

    @GetMapping("/retrieveAll")
    public List<Request> retrieveAll() {
        return new ArrayList<>(service.getAllRequests().values());
    }

    @GetMapping("/retrieveByID")
    public Request retrieveByID(@RequestBody String id) {
        return service.getRequestByID(id);
    }

}
