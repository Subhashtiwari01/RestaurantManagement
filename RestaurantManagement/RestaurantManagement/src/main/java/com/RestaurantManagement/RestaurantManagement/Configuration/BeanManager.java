package com.RestaurantManagement.RestaurantManagement.Configuration;

import com.RestaurantManagement.RestaurantManagement.Modal.RestaurantInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class BeanManager {
    @Bean


    public List<RestaurantInformation> getRestaurantInfo(){
        RestaurantInformation restaurant =new RestaurantInformation("RudraHotel","Lucknow","9876543210","CholaBhatura","77",1);
        List<RestaurantInformation> initList=new ArrayList<>();
        initList.add(restaurant);
        return initList;


    }

}
