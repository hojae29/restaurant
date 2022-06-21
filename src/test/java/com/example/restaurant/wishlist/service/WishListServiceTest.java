package com.example.restaurant.wishlist.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WishListServiceTest {

    @Autowired
    WishListService wishListService;

    @Test
    public void searchTest(){
        var result = wishListService.search("냉면");

        System.out.println(result);

        Assertions.assertNotNull(result);
    }
}