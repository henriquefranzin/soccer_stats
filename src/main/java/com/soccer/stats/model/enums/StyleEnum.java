package com.soccer.stats.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.soccer.stats.config.exceptions.EnumException;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum StyleEnum {

    PLAY_OFF("P", "PLAY OFF"),
    ROUND_ROBIN("R", "ROUND ROBIN"),
    GROUPS_AND_PLAYOFF("G", "GROUPS AND PLAYOFF");

    private String code;
    private String description;

    @JsonCreator
    public static StyleEnum getEnum(String code) {
        return Arrays.stream(StyleEnum.values())
                .filter(x -> x.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(EnumException::new);
    }

    @JsonValue
    public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
}
