package com.addiction.main.h2DatabaseTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@DataJpaTest
public class H2DatabaseTest {

    @Autowired
    private MemberRepositoryTest memberRepository;

    @BeforeEach
    void beforeInsertMemberBefore() {
        List<MemberDto> memberList = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            MemberDto memberDto = new MemberDto();

            memberDto.setMemberId("testId" + i);
            memberDto.setName("testName" + i);

            memberList.add(memberDto);

        }

        memberRepository.saveAll(memberList);

    }

    @Test
    void selectMemberTest() {
        log.info(memberRepository.findAll().toString());
    }

}
