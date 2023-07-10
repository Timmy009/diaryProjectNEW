package data.respositories.mocks;

import data.model.Diary;
import data.respositories.DiaryRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class DiaryDuplicateRepo extends DiaryMockRepoImpl {
    

    @Override
    public Optional <Diary> findDiaryByUserEmail(String email) {
        if (count() >= 1) {
            return Optional.of(new Diary());
        }
       
        return Optional.empty();
    }

}
