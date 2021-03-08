package fr.epsi.alecaplain.mspr_gostyle.model;


import java.util.List;

public class Shop {
    private Integer id;
    private String name;
    private String adress;
    private Integer postalCode;
    private String city;
    private List<ShopPromotion> shopPromotions;

    public List<ShopPromotion> getShopPromotions() {
        return shopPromotions;
    }

    public void setShopPromotions(List<ShopPromotion> shopPromotions) {
        this.shopPromotions = shopPromotions;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                '}';
    }
}
