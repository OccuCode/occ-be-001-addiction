package com.addiction.main.h2DatabaseTest;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "MEMBER")
public class MemberDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer memberNum;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "name")
    private String name;

}
