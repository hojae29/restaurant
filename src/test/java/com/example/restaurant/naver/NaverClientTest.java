package com.example.restaurant.naver;

import com.example.restaurant.naver.dto.SearchImagelReq;
import com.example.restaurant.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NaverClientTest {

    @Autowired
    NaverClient naverClient;

    @Test
    public void searchLocalTest(){
        var search = new SearchLocalReq();
        search.setQuery("냉면");

        var result = naverClient.searchLocal(search);
        System.out.println(result);
    }

    @Test
    public void searchImageTest(){
        var search = new SearchImagelReq();
        search.setQuery("냉면");

        var result = naverClient.searchImage(search);
        System.out.println(result);
    }
}