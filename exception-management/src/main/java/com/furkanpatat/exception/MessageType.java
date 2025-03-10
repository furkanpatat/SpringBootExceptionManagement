package com.furkanpatat.exception;

import lombok.Getter;

@Getter
public enum MessageType {
    NO_RECORD_EXIST("1001","Kayıt bulunamadı."),
    GENERAL_EXCEPTION("9999","Hata.");


    private String code;
    private String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
