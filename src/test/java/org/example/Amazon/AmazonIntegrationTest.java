package org.example.Amazon;

import org.example.Amazon.Cost.ItemType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmazonIntegrationTest {

    @Test
    @DisplayName("specification-based")
    void testItemAndCartIntegration() {

        Item item = new Item(ItemType.ELECTRONIC, "Mouse", 1, 20);

        assertEquals("Mouse", item.getName());
        assertEquals(20, item.getPricePerUnit());
    }

    @Test
    @DisplayName("structural-based")
    void testMultipleItems() {

        Item item1 = new Item(ItemType.ELECTRONIC, "Keyboard", 1, 50);
        Item item2 = new Item(ItemType.ELECTRONIC, "Mouse", 2, 20);

        assertEquals(50, item1.getPricePerUnit());
        assertEquals(2, item2.getQuantity());
    }
}