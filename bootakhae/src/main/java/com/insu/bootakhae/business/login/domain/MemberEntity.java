package com.insu.bootakhae.business.login.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity(name = "member")
@Data
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"userId", "name", "password"})
public class MemberEntity {

  public MemberEntity(String userId, String name, String password) {
    this.userId = userId;
    this.name = name;
    this.password = password;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id")
  private Long id;

  @NotEmpty
  @Column(name = "user_id")
  private String userId; // 로그인 id
  @NotEmpty
  @Column(name = "name")
  private String name; // 사용자 이름
  @NotEmpty
  @Column(name = "password")
  private String password;

}
