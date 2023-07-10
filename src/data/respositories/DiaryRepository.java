package data.respositories;

import data.model.Diary;
import data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DiaryRepository extends MongoRepository<Diary, String> {
    Optional<Diary> findDiaryByUserEmail (String email);
}

