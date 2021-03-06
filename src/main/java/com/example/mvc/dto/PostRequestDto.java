package com.example.mvc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestDto {

      private String name;
      private int age;
      @JsonProperty("car_list")
      private List<CarDto> carList;

//    private String account;
//    private String email;
//    private String address;
//    private String password;
//    @JsonProperty("phone_number") // json key와 매핑
//    private String phoneNumber;
//    @JsonProperty("OTP") // snakeCase, camelCase도 아닌경우
//    private String OTP;
}
