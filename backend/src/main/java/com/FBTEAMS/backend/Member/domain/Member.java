package com.FBTEAMS.backend.Member.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String socialLoginId;

    @Column(nullable = false, unique = true, length = 20)
    private String nickname;

    @Enumerated(value = STRING)
    private MemberState status;

}
