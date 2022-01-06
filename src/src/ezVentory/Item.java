package src.ezVentory;

public class Item {
    private String name;
    private String barCode;
    private double costPrice;
    private double sellPrice;
    private int inventoryAmount;
    private boolean isOnSale;
    private double salePrice = 0;

    public Item(String name, String barCode, double costPrice, double sellPrice, int inventoryAmount, boolean isOnSale) {
        setName(name);
        setBarCode(barCode);
        setCostPrice(costPrice);
        setSellPrice(sellPrice);
        setInventoryAmount(inventoryAmount);
        setOnSale(isOnSale);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBarCode() {
        return barCode;
    }
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    public double getCostPrice() {
        return costPrice;
    }
    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }
    public double getSellPrice() {
        return sellPrice;
    }
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    public int getInventoryAmount() {
        return inventoryAmount;
    }
    public void setInventoryAmount(int inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }
    public boolean getIsOnSale() {
        return isOnSale;
    }
    public void setOnSale(boolean onSale) {
        isOnSale = onSale;

    }
    public void setSalePrice(double salePrice){
        if(this.getIsOnSale())
            this.salePrice = salePrice;
    }
    public double getSalePrice() {
        return salePrice;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof Item i)) return false;

        return this.barCode.equals(i.getBarCode());
    }
}
