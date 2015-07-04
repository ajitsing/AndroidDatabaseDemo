package ajitsingh.com.androiddatabasedemo.model;

public class Product {
  private String name;
  private Integer price;

  public Product(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Integer getPrice() {
    return price;
  }
}
