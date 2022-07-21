package io.benedetto.luanforniture.model;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer role_id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;
  
  public Role() {
  }
  public Role(ERole name) {
    this.name = name;
  }
  public Integer getId() {
    return role_id;
  }
  public void setId(Integer role_id) {
    this.role_id = role_id;
  }
  public ERole getName() {
    return role_name;
  }
  public void setName(ERole name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Role{" + "id=" + role_id + ", name=" + name + '}';
  }
}