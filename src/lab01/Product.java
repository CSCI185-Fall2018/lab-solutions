package lab01;

public class Product
{
    private String name;
    private float unitPrice;

    public String getName()
    {
        return name;
    }

    public float getUnitPrice()
    {
        return unitPrice;
    }

    public String toString()
    {
        return String.format("%s {name: %s, unit_price: %.2f}", getClass().getSimpleName(), name, unitPrice);
    }

    public boolean equals(Product other)
    {
        return this.name.equals(other.name) && this.unitPrice == other.unitPrice;
    }

    public Product(String name, float unitPrice)
    {
        this.name = name;
        this.unitPrice = unitPrice;
    }
}
