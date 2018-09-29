package lab01;

public class Products
{
    public final static int DEFAULT_MAX_SIZE = 100;

    private Product[] products;
    private int size;

    public Products(int maxSize)
    {
        this.size = 0;
        this.products = new Product[maxSize];
    }

    public Products()
    {
        this(DEFAULT_MAX_SIZE);
    }

    public Product get(int x)
    {
        return products[x];
    }

    public void add(Product product)
    {
        // TODO: check for space or catch out of bounds exception
        products[size++] = product;
    }

    public Product query(String name)
    {
        for(Product product: products)
            if(product != null)
                if(product.getName().equals(name))
                    return product;
        return null;
    }

    public int size()
    {
        return size;
    }
}
