package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@EnableAutoConfiguration
class DiaryServiceImplTest1 {
    @Autowired
    DiaryService diaryService;

    @Autowired
    public DiaryServiceImplTest1 (DiaryService diaryService) {
        this.diaryService = diaryService;
    }
}