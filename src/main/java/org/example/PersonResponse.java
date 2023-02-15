package org.example;

import com.google.gson.Gson;

public class PersonResponse {
    private String message;

    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    // standard getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}