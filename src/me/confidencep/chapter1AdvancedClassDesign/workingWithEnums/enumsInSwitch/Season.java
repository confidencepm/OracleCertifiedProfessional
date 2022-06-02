package me.confidencep.chapter1AdvancedClassDesign.workingWithEnums.enumsInSwitch;

// You cannot extend an enum
//public enum ExtendedSeason extends Season {} DOES NOT COMPILE

public enum Season {
    WINTER, SPRING, SUMMER,FALL
}

class EnumsMain {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);

        for (Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season s1 = Season.valueOf("SUMMER");

        // Throws illegalArgumentException because summer does not match casing in the enum
        //Season s2 = Season.valueOf("summer");
    }
}
