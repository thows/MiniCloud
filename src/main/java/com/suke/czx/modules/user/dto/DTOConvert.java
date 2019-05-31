package com.suke.czx.modules.user.dto;

public interface DTOConvert<S,T> {
    T convert(S s);
}
