package seedu.duke;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    private LocalDate date = LocalDate.now();
    private Item rice = new Item("rice", "S$", 2);

    @Test
    public void testStringConversion() {
        String expectedString = date.toString() + " rice S$2.0";
        assertEquals(expectedString, rice.toString());
    }

    @Test
    public void editAmount() {
        String expectedString = date.toString() + " rice S$5.0";
        rice.editAmount(5);
        assertEquals(expectedString, rice.toString());
    }

    @Test
    public void editDescription() {
        String expectedString = date.toString() + " chicken rice S$2.0";
        rice.editDescription("chicken rice");
        assertEquals(expectedString, rice.toString());
    }

    @Test
    public void editSymbol() {
        String expectedString = date.toString() + " rice $2.0";
        rice.editSymbol("$");
        assertEquals(expectedString, rice.toString());
    }

    @Test
    public void getAmount() {
        Double expectedAmount = 2.0;
        assertEquals(expectedAmount, rice.getAmount());
    }

    @Test
    public void getDescription() {
        String expectedDescription = "rice";
        assertEquals(expectedDescription, rice.getDescription());
    }

    @Test
    public void getSymbol() {
        String expectedSymbol = "S$";
        assertEquals(expectedSymbol, rice.getSymbol());
    }

    @Test
    public void getYearMonth() {
        String expectedString = date.toString().substring(0, 7);
        assertEquals(expectedString, rice.getYearMonth());
    }
}