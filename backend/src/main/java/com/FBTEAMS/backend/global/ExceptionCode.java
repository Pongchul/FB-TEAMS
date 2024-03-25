package com.FBTEAMS.backend.global;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionCode {

    ;


    private final int code;
    private final String message;
}
