package com.github.unijobs.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.unijobs.api.model.User;

import java.sql.Timestamp;
import java.time.LocalTime;

public class UserDTO {

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("registroAcademico")
    private String registroAcademico;

    @JsonProperty("whatsapp")
    private String whatsapp;

    private Timestamp createdAt;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.registroAcademico = user.getRegistroAcademico();
        this.whatsapp = user.getWhatsapp();
        this.createdAt = user.getCreatedAt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
}
