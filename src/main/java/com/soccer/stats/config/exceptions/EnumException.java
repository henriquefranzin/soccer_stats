package com.soccer.stats.config.exceptions;

import static com.soccer.stats.util.MessageUtils.*;

public class EnumException extends RuntimeException{

    public EnumException() {
        super (NO_VALUE_ENUM);
    }
}
