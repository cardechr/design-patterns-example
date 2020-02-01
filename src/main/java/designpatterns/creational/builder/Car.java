package designpatterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Car {
    //required data
    private final int year;
    private final String make;
    private final String model;

    //optional data
    private final String trim;
    private final String color;
    private final int mileage;
    private final String vin;
}
