package com.game.housie.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    private Long id;
    private String name;
   // private List<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

  //  @ManyToMany(mappedBy = "roles")
  //  public List<User> getUsers() {
  //      return users;
 //   }

 //   public void setUsers(List<User> users) {
  //      this.users = users;
 //   }
}
