package ru.crafts;

public class KMPSearch {
    public static String prefixSubstring(String needle, int prefixLength) {
        return needle.substring(0, prefixLength);
    }

    public static String suffixSubstring(String needle, int suffixLength) {
        return needle.substring(needle.length() - suffixLength);
    }

    public static int prefix(String needle) {
        int max = 0;
        for (int i = 1; i < needle.length(); i++) {

            if (prefixSubstring(needle, i).equals(suffixSubstring(needle, i)) && i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int searchNeedle(String needle, String haystack) {
        char[] needleChars = needle.toCharArray();
        char[] haystackChars = haystack.toCharArray();

        int index = 0;
        while (index < haystackChars.length) {
            int dismatchIndex = compareNeedleWithHaystack(index, needleChars, haystackChars);
            if (dismatchIndex == -1) {
                return index;
            }
            if (dismatchIndex == 0) {
                index++;
                continue;
            }

            index += dismatchIndex - prefix(needle.substring(0, dismatchIndex - 1));
        }
        return index;
    }

    private static int compareNeedleWithHaystack(int startIndex, char[] needleChars, char[] haystackChars) {
        for (int i = 0; i < needleChars.length; i++) {
            if (needleChars[i] != haystackChars[i + startIndex]) {
                return i;
            }
        }
        return -1;
    }
}
