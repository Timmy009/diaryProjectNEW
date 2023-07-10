package services;

import Dtos.request.ChangePasswordRequest;
import Dtos.request.LoginRequest;
import Dtos.request.RegisterRequest;
import Dtos.response.RegisterUserResponse;
import data.respositories.DiaryRepository;
import data.respositories.mocks.DiaryDuplicateRepo;
import data.respositories.mocks.DiaryMockRepoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;


class DiaryServiceImplTest {


    DiaryService diaryService;


    DiaryRepository diaryRepository;

    @Test public void createDiaryTest () {
        diaryRepository = new DiaryMockRepoImpl();
        RegisterRequest request = new RegisterRequest();
        request.setEmail("timileyin@gmail.com");
        request.setPassword("Timi");
        request.setUsername("Timile");
        diaryService = new DiaryServiceImpl(diaryRepository);
        diaryService.register(request);
        assertEquals(1, diaryRepository.count());
    }
    @Test public void createDiaryTAndDuplicateUserCannotRegisterTest () {
        diaryRepository = new DiaryDuplicateRepo();
        RegisterRequest request = new RegisterRequest();
        request.setEmail("timileyin@gmail.com");
        request.setPassword("Timi");
        request.setUsername("Timile");
        diaryService = new DiaryServiceImpl(diaryRepository);
        diaryService.register(request);
        assertEquals(1, diaryRepository.count());
        assertThrows(IllegalArgumentException.class, ()->diaryService.register(request));
    }

    @Test public void changePasswordTest () {
        diaryRepository = new DiaryMockRepoImpl();
        RegisterRequest request = new RegisterRequest();
        request.setEmail("timileyin@gmail.com");
        request.setPassword("Timi");
        request.setUsername("Timile");
        diaryService = new DiaryServiceImpl(diaryRepository);
        diaryService.register(request);
        assertEquals(1, diaryRepository.count());
        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
        changePasswordRequest.setEmail("timileyin@gmail.com");
        changePasswordRequest.setOldPassword("Timile");
        changePasswordRequest.setNewPassword("Esther");
        diaryService.changePassword(changePasswordRequest);
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail("timileyin@gmail.com");
        loginRequest.setPassword("Esther");
        diaryService.unlock(loginRequest);
        assertFalse(diaryService.isLocked("timileyin@gmail.com"));

    }

}