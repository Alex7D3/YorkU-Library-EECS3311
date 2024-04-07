package com.yorku.library.restservice.auth;

public class AuthenticationResponse {
    private String token;

    private AuthenticationResponse() {}

    public static AuthenticationResponseBuilder builder() {
        return new AuthenticationResponseBuilder();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class AuthenticationResponseBuilder {
        private String token;

        private AuthenticationResponseBuilder() {}

        public AuthenticationResponseBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AuthenticationResponse build() {
            AuthenticationResponse response = new AuthenticationResponse();
            response.setToken(token);
            return response;
        }
    }
}
