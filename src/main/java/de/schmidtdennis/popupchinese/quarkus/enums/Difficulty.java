package de.schmidtdennis.popupchinese.quarkus.enums;

public enum Difficulty {
    BEGINNER,
    ELEMENTARY,
    INTERMEDIATE,
    ADVANCED;

    public static Difficulty getEnumValue(String enumValue){
        for(Difficulty difficulty : Difficulty.values()){
            if(difficulty.name().equals(enumValue)){
                return difficulty;
            }
        }

        throw new IllegalArgumentException("Enum not found with value: " + enumValue);
    }
}
