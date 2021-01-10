package ru.crafts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KMPSearchTest {

    @Test
    public void getPrefixForOneLetter() {
        assertEquals (0, KMPSearch.prefix("a"));
    }

    @Test
    public void getPrefixForTwoDifferentLetters() {
        assertEquals (0, KMPSearch.prefix("ab"));
    }

    @Test
    public void getPrefixForAbab() {
        assertEquals (2, KMPSearch.prefix("abab"));
    }

    @Test
    public void getPrefixForAba() {
        assertEquals (1, KMPSearch.prefix("aba"));
    }

    @Test
    public void getPrefixString() {
        String result = KMPSearch.prefixSubstring("abcabc", 2);
        assertEquals ("ab", result);
    }
    @Test
    public void getSuffixString() {
        String result = KMPSearch.suffixSubstring("abcabc", 2);
        assertEquals ("bc", result);
    }

    @Test
    public void getComparisonResults() {
        String needle = "abc";
        String haystack = "blabbljkabcljkdbckfj";

        int position = KMPSearch.searchNeedle(needle, haystack);
        assertEquals(8, position);
    }

    @Test
    public void getComparisonResultsMoreComplicated() {
        String needle = "abc";
        String haystack = "bcaacbabcabcbacabc";

        int position = KMPSearch.searchNeedle(needle, haystack);
        assertEquals(6, position);
    }

}
