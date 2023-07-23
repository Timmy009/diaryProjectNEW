package controllers;

import Dtos.request.RegisterRequest;
import Dtos.response.RegisterUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import services.DiaryService;

@RestController
public class DiaryController {

    @Autowired
    DiaryService diaryService;

    @PostMapping("/register")
    public RegisterUserResponse registerUser (@RequestBody RegisterRequest registerRequest) {
        return diaryService.register(registerRequest);
    }

    @GetMapping("/register1")
    public String registerUser () {
        return "timi";
    }

}
