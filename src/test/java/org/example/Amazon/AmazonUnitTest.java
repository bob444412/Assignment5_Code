package org.example.Amazon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmazonUnitTest {

    @Test
    @DisplayName("specification-based: create item correctly")
    void testItemCreation() {

        Item item = new Item(null, "Laptop", 1, 1000.0);

        assertEquals("Laptop", item.getName());
        assertEquals(1, item.getQuantity());
    }

    @Test
    @DisplayName("structural-based: verify item exists")
    void testItemExists() {

        Item item = new Item(null, "Mouse", 2, 25.0);

        assertNotNull(item);
    }
}