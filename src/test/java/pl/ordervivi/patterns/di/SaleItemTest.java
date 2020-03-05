package pl.ordervivi.patterns.di;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SaleItemTest {
    private static ItemProperty itemProperty;

    @BeforeAll
    static void setupDependencyInjectionObjects() {
        itemProperty = new FullItemPropertyImpl();
    }

    @Test
    public void dependencyInjectionTest() {
        SaleItem saleItem = new SaleItem(itemProperty);
        assertTrue(saleItem.getOffer().contains("Full item specification"));
    }
}