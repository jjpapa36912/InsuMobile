package com.insu.bootakhae.business.login.domain;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

  MemberEntity findMemberEntityByLoginIdEquals(String loginId);

  List<MemberEntity> findAll();
}
