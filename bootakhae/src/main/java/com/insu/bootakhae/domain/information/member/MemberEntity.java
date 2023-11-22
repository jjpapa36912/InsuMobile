package com.insu.bootakhae.domain.information.member;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity(name = "member")
@Data
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@ToString(of = {"id", "username", "age"})
public class MemberEntity {

  public MemberEntity(String loginId, String name, String password) {
    this.loginId = loginId;
    this.name = name;
    this.password = password;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id")
  private Long id;

  @NotEmpty
  @Column(name = "login_id")
  private String loginId; // 로그인 id
  @NotEmpty
  @Column(name = "name")
  private String name; // 사용자 이름
  @NotEmpty
  @Column(name = "password")
  private String password;

}
