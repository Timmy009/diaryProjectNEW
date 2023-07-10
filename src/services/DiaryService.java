package services;

import Dtos.request.ChangePasswordRequest;
import Dtos.request.CreateEntryRequest;
import Dtos.request.LoginRequest;
import Dtos.request.RegisterRequest;
import Dtos.response.RegisterUserResponse;
import data.model.Entry;

public interface DiaryService {
RegisterUserResponse register(RegisterRequest request);
void changePassword(ChangePasswordRequest changePasswordRequest);
void unlock(LoginRequest loginRequest);

    void lock(String email);

    void numberOfUsers();
    boolean isLocked (String email);


}
