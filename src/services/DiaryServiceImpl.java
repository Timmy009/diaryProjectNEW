package services;

import Dtos.request.ChangePasswordRequest;
import Dtos.request.LoginRequest;
import Dtos.request.RegisterRequest;
import Dtos.response.RegisterUserResponse;
import data.model.Diary;
import data.model.User;
import data.respositories.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.Optional;



@Service
@Component
public class DiaryServiceImpl implements DiaryService{
    @Autowired
    DiaryRepository diaryRepository;



    @Autowired
    public DiaryServiceImpl(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    @Override
    public RegisterUserResponse register(RegisterRequest request) {
  Optional<Diary> foundDiary = diaryRepository.findDiaryByUserEmail(request.getEmail());
        if (foundDiary.isPresent()) {throw new IllegalArgumentException("User already exist");}
        Diary diary = new Diary();
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setUsername(request.getUsername());
        diary.setUser(user);
        diary.setUser(user);
        Optional<Diary> savedDiary = Optional.of(diaryRepository.save(diary));
        RegisterUserResponse response = new RegisterUserResponse();
       response.setEmail(savedDiary.get().getUser().getEmail());
       return response;}

    @Override
    public void changePassword(ChangePasswordRequest changePasswordRequest) {
        Optional<Diary> savedDiary = diaryRepository.findDiaryByUserEmail(changePasswordRequest.getEmail());
        System.out.println(savedDiary.isEmpty());
        if (savedDiary.isEmpty()) {

            throw new IllegalArgumentException("User does not exist");

        }
        else {
            if (savedDiary.get().getUser().getPassword().equals(changePasswordRequest.getNewPassword())) {

                savedDiary.get().getUser().setPassword(changePasswordRequest.getNewPassword());
            }
            else {
                throw new IllegalArgumentException("Invalid password");
            }
        }

    }

    @Override
    public void unlock(LoginRequest loginRequest) {
        Optional<Diary> foundDiary = diaryRepository.findDiaryByUserEmail(loginRequest.getEmail());
        if (foundDiary.isEmpty()) {
            throw new IllegalArgumentException("User not found");
        }
        else {
            if (foundDiary.get().getUser().getPassword().equals(loginRequest.getPassword())) {
                foundDiary.get().setLocked(false);
            }
            else {
                throw new IllegalArgumentException("Invalid Password");
            }
        }


    }


    @Override
    public void lock(String email) {
        Optional<Diary> foundDiary = diaryRepository.findDiaryByUserEmail(email);
        if (foundDiary.isEmpty()) {
            throw new IllegalArgumentException("User not found");
        }
        else {
            foundDiary.get().setLocked(true);
        }

    }
    @Override
    public void numberOfUsers() {
        diaryRepository.count();

    }

    @Override
    public boolean isLocked(String email) {
        Optional<Diary> foundDiary = diaryRepository.findDiaryByUserEmail(email);

       return foundDiary.get().isLocked();
    }


}

