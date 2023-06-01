package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FifthItemTest {
    @Test
    public void testGetFifthItem() {
        FifthItem fifthItem = new FifthItem();
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");
        myList.add("Elderberry");
        myList.add("Fig");

        String actual = fifthItem.getFifthItem(myList);
        String expected = "Elderberry";
        assertEquals(expected, actual);
    }
}
