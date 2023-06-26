package com.RestaurantManagement.RestaurantManagement.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantInformation {

    private String Name;
    private String Address;

    private String Number;
    private String Speciality;
    private String TotalStaffs;
    private Integer RestaurantId;



}
