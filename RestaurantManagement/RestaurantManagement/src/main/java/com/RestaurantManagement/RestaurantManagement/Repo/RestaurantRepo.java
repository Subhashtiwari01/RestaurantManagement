package com.RestaurantManagement.RestaurantManagement.Repo;

import com.RestaurantManagement.RestaurantManagement.Modal.RestaurantInformation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RestaurantRepo {

    private static List<RestaurantInformation> restaurentList=new ArrayList<>();

    public static RestaurantInformation getRestaurantById(int restaurantInformationId) {
        for(RestaurantInformation restaurantInformation:restaurentList){
            if(restaurantInformation.getRestaurantId() ==restaurantInformationId){
                return restaurantInformation;
            }
        }
        return null;

    }
    public String removeRestaurant(int restaurantId){
        for(RestaurantInformation restaurantInformation:restaurentList){
            if(restaurantInformation.getRestaurantId()==restaurantId){
                restaurentList.remove(restaurantInformation);
                return"restaurant deleted";
            }
        }
        return "User with given id not found";
    }


    public List<RestaurantInformation> getRestaurant() {
        return restaurentList;
    }
}
