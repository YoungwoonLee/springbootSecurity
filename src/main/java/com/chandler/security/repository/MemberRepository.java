package com.chandler.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandler.security.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String userEmail);
}
