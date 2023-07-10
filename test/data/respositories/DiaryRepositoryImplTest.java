package data.respositories;

import data.model.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryRepositoryImplTest {

    private DiaryRepository diaryRepository;


    @Test
    public void testThatICanSaveUser () {
        Diary newDiary = new Diary();
        diaryRepository.save(newDiary);
        System.out.println("jdjh");
    }
//    @Test public void testThatICanTwoSaveUsers () {
//        Diary newDiary = new Diary();
//        Diary newDiary1 = new Diary();
//        diaryRepository.save(newDiary);
//        diaryRepository.save(newDiary1);
//        assertEquals(2, diaryRepository.count());
//    }
//    @Test public void testThatICanTwoSaveUsersAndDeleteOne () {
//        Diary newDiary = new Diary();
//        Diary newDiary1 = new Diary();
//        diaryRepository.save(newDiary);
//        diaryRepository.save(newDiary1);
//        assertEquals(2, diaryRepository.count());
//        diaryRepository.delete(newDiary);
//        assertEquals(1, diaryRepository.count());
//    }
//
//    @Test public void testThatICanTwoSaveUsersAndDeleteOneByID () {
//        Diary newDiary = new Diary();
//        Diary newDiary1 = new Diary();
//        diaryRepository.save(newDiary);
//        diaryRepository.save(newDiary1);
//        assertEquals(2, diaryRepository.count());
//        diaryRepository.delete(1);
//        assertEquals(1, diaryRepository.count());
//    }
//    @Test public void testThatICanTwoSaveUsersAndDeleteALL () {
//        Diary newDiary = new Diary();
//        Diary newDiary1 = new Diary();
//        diaryRepository.save(newDiary);
//        diaryRepository.save(newDiary1);
//        assertEquals(2, diaryRepository.count());
//        diaryRepository.delete(newDiary);
//        diaryRepository.deleteAll();
//        assertEquals(0, diaryRepository.count());
//    }

}