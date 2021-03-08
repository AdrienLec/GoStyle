package fr.epsi.alecaplain.mspr_gostyle.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.List;

public class Promotion implements Serializable {

    private Integer id;
    private String name;
    private String description;
    private String type;
    private String codeAdvantage;
    private Blob picture;
    private Category category;
    private List<ShopPromotion> shopPromotions;

    public List<ShopPromotion> getShopPromotions() {
        return shopPromotions;
    }

    public void setShopPromotions(List<ShopPromotion> shopPromotions) {
        this.shopPromotions = shopPromotions;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodeAdvantage() {
        return codeAdvantage;
    }

    public void setCodeAdvantage(String codeAdvantage) {
        this.codeAdvantage = codeAdvantage;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", codeAdvantage='" + codeAdvantage + '\'' +
                ", picture=" + picture +
                ", category=" + category +
                '}';
    }
}
