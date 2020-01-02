package com.chandler.security.dto;

import lombok.*;

import java.time.LocalDateTime;

import com.chandler.security.domain.Member;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {
    private Long id;
    private String email;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Member dtoToDomain(){
        return Member.builder()
                .id(id)
                .email(email)
                .password(password)
                .build();
    }
}
