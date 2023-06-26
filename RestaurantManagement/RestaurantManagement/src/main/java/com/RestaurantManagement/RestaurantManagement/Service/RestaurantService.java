package com.RestaurantManagement.RestaurantManagement.Service;

import com.RestaurantManagement.RestaurantManagement.Modal.RestaurantInformation;
import com.RestaurantManagement.RestaurantManagement.Repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RestaurantService {

    @Autowired

    RestaurantRepo studentRepo;

    public List<RestaurantInformation> getRestaurant() {
        return studentRepo.getRestaurant();
    }


    public String createrestaurant(List<RestaurantInformation> restaurantInformation) {
        List<RestaurantInformation>originalList=getRestaurant();
        originalList.addAll(restaurantInformation);
        return "New Restaurant Added";


    }

    public String createRestaurent(RestaurantInformation restaurantInformation) {
        List<RestaurantInformation> originalList=getRestaurant();
        originalList.add(restaurantInformation);
        return "RestaurantAdded";
    }

    public String updateRestaurant(int restaurantInformationId, RestaurantInformation restaurantInformation) {
        RestaurantInformation restaurent1=RestaurantRepo.getRestaurantById(restaurantInformationId);
        if(restaurent1!=null){
            restaurent1.setName(restaurantInformation.getName());
            restaurent1.setNumber(restaurantInformation.getNumber());
            restaurent1.setAddress (restaurantInformation.getAddress());
            restaurent1.setSpeciality(restaurantInformation.getSpeciality());
            restaurent1.setTotalStaffs (restaurantInformation.getTotalStaffs());


        }
        return "restaurant Updated";
    }
}
