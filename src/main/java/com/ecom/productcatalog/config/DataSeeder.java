package com.ecom.productcatalog.config;


import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.productRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final productRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(productRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
        public void run(String... args) {
        //clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        //Create Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));

        //Create Products
        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Fast, smooth and high quality camera mobile phone");
        phone.setImageURL("https://placehold.co/600x400");
        phone.setPrice(399.9);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Gaming Laptop");
        laptop.setDescription("Fast, smooth and high quality build Gaming Laptop");
        laptop.setImageURL("https://placehold.co/600x400");
        laptop.setPrice(699.9);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("puffer jacket");
        jacket.setDescription("warm, cozy and stylish puffer jacket");
        jacket.setImageURL("https://placehold.co/600x400");
        jacket.setPrice(39.9);
        jacket.setCategory(clothing);

        Product Oven = new Product();
        Oven.setName("Oven");
        Oven.setDescription("Fast and easy cooking oven");
        Oven.setImageURL("https://placehold.co/600x400");
        Oven.setPrice(59.9);
        Oven.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, Oven));

    }


}
