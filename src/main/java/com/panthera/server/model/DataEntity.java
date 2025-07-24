package com.panthera.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataEntity {

    @Id
    private String id;
    private String mpc;
    private String community;
    private String city;
    private String state;
    private String zipcode;
    private double latitude;
    private double longitude;
    private String planUrl;
    private int homesitePrice;
    private int homesiteSqFt;
    private int version;
}
