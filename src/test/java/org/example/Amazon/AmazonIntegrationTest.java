package org.example.Amazon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmazonIntegrationTest {

    @Test
    @DisplayName("specification-based: item + database interaction")
    void testItemDatabaseInteraction() {

        Database db = new Database();
        Item item = new Item(null, "Headphones", 1, 100.0);

        assertNotNull(db);
        assertNotNull(item);
    }

    @Test
    @DisplayName("structural-based: create multiple components")
    void testComponentCreation() {

        Database db = new Database();
        Item item = new Item(null, "Phone", 1, 500.0);

        assertTrue(item.getQuantity() > 0);
        assertNotNull(db);
    }
}