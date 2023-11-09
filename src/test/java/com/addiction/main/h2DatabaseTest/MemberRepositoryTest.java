package com.addiction.main.h2DatabaseTest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepositoryTest extends JpaRepository<MemberDto, Long> {
}
