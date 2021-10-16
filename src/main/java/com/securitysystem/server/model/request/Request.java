package com.securitysystem.server.model.request;

import com.securitysystem.server.model.Response;
import com.securitysystem.server.model.User;

public class Request {

    private static int requestNumber = 1;

    private String id;
    private User user;
    private Response response;
    private String body;
    private RequestType type;


    public Request(User user, String body, RequestType type) {
        this.user = user;
        this.response = Response.PENDING;
        this.body = body;
        this.type = type;
        this.id = type + "-" + String.format("%04d", requestNumber) + "-" + user.getFirstName() + "-" + user.getLastName();

        requestNumber++;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = type + "-" + String.format("%04d", requestNumber) + "-" + user.getFirstName() + "-" + user.getLastName();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }
}
