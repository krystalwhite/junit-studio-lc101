package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithTextInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[text]"));
    }

    @Test
    public void textFollowedByEmptyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("text[]"));
    }

    @Test
    public void textFollowedByBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("text[more text]"));
    }

    @Test
    public void emptyBracketsFollowedByTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]text"));
    }

    @Test
    public void bracketsWithTextFollowedByTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[text] more text"));
    }

    @Test
    public void textFollowedByBracketsWithTextFollowedByTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("text [more text] even more text"));
    }

    @Test
    public void singleCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleOpenBracketFollowedByTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[text"));
    }

    @Test
    public void textFollowedBySingleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("text["));
    }

    @Test
    public void textFollowedBySingleOpenBracketFollowedByTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("text[ more text"));
    }

    @Test
    public void singleCloseBracketFollowedByTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]text"));
    }

    @Test
    public void textFollowedBySingleCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("text]"));
    }

    @Test
    public void textFollowedBySingleCloseBracketFollowedByTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("text] more text"));
    }

    @Test
    public void singleBracketPairInWrongDirectionsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void textFollowedBySingleCloseBracketFollowedByTextFollowedBySingleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("text] more text ["));
    }

    @Test
    public void threeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }



}
