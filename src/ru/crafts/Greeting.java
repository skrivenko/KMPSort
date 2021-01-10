package ru.crafts;

import java.util.Arrays;

public class Greeting {
    public static void main(String[] args) {
        System.out.println(Greeting.greet("Alexander"));
    }

    public static String greet(String... names) {
        if (names == null) {
            return greetingForLowerNames(null);
        }

        String lowerNames = getNamesByCase(false, names);
        String upperNames = getNamesByCase(true, names);

        String lowerGreeting = greetingForLowerNames(lowerNames);
        String upperGreeting = greetingForUpperNames(upperNames);
        return lowerGreeting
                + (!lowerGreeting.isEmpty() && !upperGreeting.isEmpty() ? " AND " : "")
                + upperGreeting;
    }

    public static String getNamesByCase(boolean upperCase, String... names) {

        return names == null ? null :
                getAllNamesFromArray(Arrays.stream(names)
                        .filter(name -> upperCase == isNameUpperCase(name))
                        .toArray(String[]::new));


    }

    public static String greetingForLowerNames(String lowerNames) {
        return lowerNames != null && lowerNames.isEmpty() ? "" :
                "Hello, "
                        + (lowerNames == null ? "my friend" : lowerNames)
                        + ".";
    }

    public static String greetingForUpperNames(String upperNames) {
        return upperNames == null || upperNames.isEmpty() ? "" :
                "HELLO " + upperNames + "!";
    }

    public static String getAllNamesFromArray(String... names) {
        if (names == null) {
            return null;
        }
        String allNames = "";
        if (names.length <= 2) {
            allNames = String.join(" and ", names);
        } else {
            String[] copiedNames = Arrays.copyOf(names, names.length);
            copiedNames[copiedNames.length - 1] =
                    "and " + copiedNames[copiedNames.length - 1];
            allNames = String.join(", ", copiedNames);
        }

        return allNames;
    }

    public static boolean isNameUpperCase(String name) {
        // всё имя в крупных буквах,
        // если его перевод совпадает с ним самим
        return name != null && name.equals(name.toUpperCase());
    }
}
