package com.company.dsa.linkedin;

public enum DirectionEnum {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    DirectionEnum(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getShortCode(){
        return shortCode;
    }


}
