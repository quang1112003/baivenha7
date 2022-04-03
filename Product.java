package javafx;

public final class Product {

    public String fullname;
    public String unit;
    public Integer price;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer amount;
    public Product(){

    }
    public Product(String fullname, String unit, Integer price, Integer amount) {
        this.fullname = fullname;
        this.unit = unit;
        this.price = price;
        this.amount = amount;
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public String toString(){
        String s="\n----------";
        s+= "\n"+"NAME: " +getFullname();
        s+= "\n"+"UNIT: " +getUnit();
        s+= "\n"+"PRICE: "+getPrice();
        s+= "\n"+"AMOUNT: "+getAmount();
        return s;
    }
}
