package com.RestaurantManagement.RestaurantManagement.controller;

import com.RestaurantManagement.RestaurantManagement.Modal.RestaurantInformation;
import com.RestaurantManagement.RestaurantManagement.Service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("Restaurant")
    List <RestaurantInformation> grtRestaurantInfo(){

        return restaurantService.getRestaurant();
    }


    @PostMapping("postrestaurant")
    String addres(@Valid @RequestBody List<RestaurantInformation>restaurantInformation) {

        return restaurantService.createrestaurant(restaurantInformation);
    }
    @PostMapping("restaurant")
    String addrestaurant(@Valid @RequestBody RestaurantInformation restaurantInformation){
        return restaurantService.createRestaurent((RestaurantInformation) restaurantInformation);
    }
    @PutMapping("RestaurantInformation/{restaurantInformationId}")

    String updateRestaurant(@PathVariable int restaurantInformationId,@Valid @RequestBody RestaurantInformation restaurantInformation ){
        return restaurantService.updateRestaurant(restaurantInformationId,restaurantInformation);

    }



}
