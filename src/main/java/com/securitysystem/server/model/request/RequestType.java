package com.securitysystem.server.model.request;

public enum RequestType {
    PERSONAL_ACCESS {
        @Override
        public String toString() {
            return "ACCESS";
        }
    },
    GUEST_ACCESS {
        @Override
        public String toString() {
            return "GUEST_ACCESS";
        }
    }
}
