package org.example.Amazon;

import org.example.Amazon.Cost.ItemType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmazonUnitTest {

    @Test
    @DisplayName("specification-based")
    void testItemCreation() {

        Item item = new Item(ItemType.ELECTRONIC, "Laptop", 1, 1000);

        assertEquals("Laptop", item.getName());
        assertEquals(1, item.getQuantity());
        assertEquals(1000, item.getPricePerUnit());
    }

    @Test
    @DisplayName("structural-based")
    void testItemType() {

        Item item = new Item(ItemType.OTHER, "Book", 2, 20);

        assertEquals(ItemType.OTHER, item.getType());
    }
}