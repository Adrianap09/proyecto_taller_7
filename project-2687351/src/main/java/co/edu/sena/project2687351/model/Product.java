package co.edu.sena.project2687351.model;

import java.math.BigDecimal;

public class Product {
    private Integer product_id;
    private String product_name;
    private BigDecimal product_value;
    private co.edu.sena.project2687351.model.Category category;

    public Product() {
    }

    public Product(Integer product_id, String product_name, BigDecimal product_value, Category category) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_value = product_value;
        this.category = category;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public BigDecimal getProduct_value() {
        return product_value;
    }

    public void setProduct_value(String product_value) {
        this.product_value = product_value;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_value=" + product_value +
                ", category=" + category +
                '}';
    }
}
