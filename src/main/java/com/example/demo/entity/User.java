// package com.example.demo.entity;

// import com.fasterxml.jackson.annotation.JsonIgnore;
// import jakarta.persistence.*;
// import lombok.*;

// import java.util.List;

// @Entity
// @Table(
//         name = "users",
//         uniqueConstraints = @UniqueConstraint(columnNames = "email")
// )
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// public class User {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String name;

//     @Column(nullable = false, unique = true)
//     private String email;

//     private String password;

//     private String role;

//     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//     @JsonIgnore   
//     private List<Vehicle> vehicles;
// }
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String role;

    // ===== No-arg constructor (REQUIRED) =====
    public User() {
    }

    // ===== BUILDER (REQUIRED BY TESTS) =====
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final User user = new User();

        public Builder id(Long id) {
            user.setId(id);
            return this;
        }

        public Builder name(String name) {
            user.setName(name);
            return this;
        }

        public Builder email(String email) {
            user.setEmail(email);
            return this;
        }

        public Builder password(String password) {
            user.setPassword(password);
            return this;
        }

        public Builder role(String role) {
            user.setRole(role);
            return this;
        }

        public User build() {
            return user;
        }
    }

    // ===== getters & setters =====
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
}