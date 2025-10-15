package com.ecom.productcatalog.dto;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    private String categoryName;

    public ProductDTO(Long id, String name, String description, String imageUrl, Double price, String categoryName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.categoryName = categoryName;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
}
