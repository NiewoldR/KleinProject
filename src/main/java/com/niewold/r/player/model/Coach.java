
/* generated by: ControllerGenerator Wed May 18 15:20:45 CEST 2016 */
package com.niewold.r.player.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String email;
    String coachRole;
    String password;




    public Coach() {
    }

    public Coach(int id, String name, String email, String coachRole, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.coachRole = coachRole;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoachRole() {
        return coachRole;
    }

    public void setCoachRole(String coachRole) {
        this.coachRole = coachRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", coachRole='" + coachRole + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

