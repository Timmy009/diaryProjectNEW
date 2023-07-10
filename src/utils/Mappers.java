package utils;

import Dtos.request.CreateEntryRequest;
import Dtos.request.RegisterRequest;
import Dtos.response.RegisterUserResponse;
import data.model.Entry;
import data.model.User;

import java.time.LocalDateTime;

import static utils.Converter.convertDate;
import static utils.Converter.convertTime;

public class Mappers {


    public static void map (Entry entry, CreateEntryRequest createEntryRequest) {
        entry.setBody(createEntryRequest.getBody());
        entry.setTitle(createEntryRequest.getTitle());
    }





//    public static void map(User user, RegisterRequest request) {
//        user.setUsername(request.getUsername());
//        user.setPassword(request.getPassword());
//        user.setEmail(request.getEmail());
//    }
//
//
//    public static void map (RegisterUserResponse response, RegisterRequest request) {
//        response.setEmail(request.getEmail());
//        LocalDateTime localDateTime = LocalDateTime.now();
//        response.setTimeCreated(convertTime(localDateTime));
//        response.setDateCreated(convertDate(localDateTime));
//    }
}
