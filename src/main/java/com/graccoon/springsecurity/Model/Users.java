package com.graccoon.springsecurity.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Users {
    @Id
    private Integer id;
    private String username;
    private String password ;

}
