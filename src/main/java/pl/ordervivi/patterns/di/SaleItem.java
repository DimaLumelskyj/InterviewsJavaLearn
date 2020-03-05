package pl.ordervivi.patterns.di;

public class SaleItem {
    private static int offerNumber = 0;
    private final ItemProperty itemProperty;

    public SaleItem(ItemProperty itemProperty) {
        this.itemProperty = itemProperty;
    }

    public String getOffer() {
        StringBuilder stringBuilder = new StringBuilder("OFFER [")
                .append(offerNumber++)
                .append("]\n")
                .append("Description: ")
                .append(itemProperty.getSpecification());
        return stringBuilder.toString();
    }
}
