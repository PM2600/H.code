package com.cy.store.entity;

import java.io.Serializable;
import java.util.Objects;

public class Pro extends BaseEntity implements Serializable {
    private Integer id;
    private Integer category_id;
    private String title;
    private Double price;
    private String image1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pro pro = (Pro) o;
        return Objects.equals(id, pro.id) &&
                Objects.equals(category_id, pro.category_id) &&
                Objects.equals(title, pro.title) &&
                Objects.equals(price, pro.price) &&
                Objects.equals(image1, pro.image1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category_id, title, price, image1);
    }

    @Override
    public String toString() {
        return "Pro{" +
                "id=" + id +
                ", category_id=" + category_id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", image1='" + image1 + '\'' +
                '}';
    }
}
