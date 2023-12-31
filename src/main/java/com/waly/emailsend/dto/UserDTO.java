package com.waly.emailsend.dto;

import com.waly.emailsend.entities.Role;
import com.waly.emailsend.entities.User;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {

    private long Id;
    private String name;
    private String email;
    private String password;
    private boolean verified;

    private Set<Role> roles = new HashSet<>();

    public UserDTO(){}

    public UserDTO(long id, String name, String email, String password) {
        Id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.verified = false;
    }

    public UserDTO(User entity) {
        Id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.verified = entity.isVerified();
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
