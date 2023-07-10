//package data.respositories;
//
//import data.model.Entry;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class EntryRepositoryImplTest {
//    private  EntryRepository entryRepository;
//
//    @BeforeEach public void setUp () {
//        entryRepository = new EntryRepositoryImpl();
//    }
//    @Test public void testThatICanSaveUser () {
//        Entry newEntry = new Entry();
//        entryRepository.save(newEntry);
//        assertEquals(1, entryRepository.count());
//    }
//    @Test public void testThatICanTwoSaveUsers () {
//        Entry newEntry = new Entry();
//        Entry newEntry1 = new Entry();
//        System.out.println(newEntry.getEntryID());
//        System.out.println(newEntry1.getEntryID());
//        entryRepository.save(newEntry);
//        entryRepository.save(newEntry1);
//        assertEquals(2, entryRepository.count());
//    }
//    @Test public void testThatICanTwoSaveUsersAndDeleteOne () {
//        Entry newEntry = new Entry();
//        Entry newEntry1 = new Entry();
//        entryRepository.save(newEntry);
//        entryRepository.save(newEntry1);
//        assertEquals(2, entryRepository.count());
//       entryRepository.delete(newEntry);
//        assertEquals(1, entryRepository.count());
//    }
//
//    @Test public void testThatICanTwoSaveUsersAndDeleteOneByID () {
//        Entry newEntry = new Entry();
//        Entry newEntry1 = new Entry();
//        entryRepository.save(newEntry);
//        entryRepository.save(newEntry1);
//        assertEquals(2, entryRepository.count());
//        entryRepository.delete(1);
//        assertEquals(1, entryRepository.count());
//    }
//    @Test public void testThatICanTwoSaveUsersAndDeleteALL () {
//        Entry newEntry = new Entry();
//        Entry newEntry1 = new Entry();
//        entryRepository.save(newEntry);
//        entryRepository.save(newEntry1);
//        assertEquals(2, entryRepository.count());
//        entryRepository.delete(newEntry);
//        entryRepository.deleteAll();
//        assertEquals(0, entryRepository.count());
//    }
//
//    @Test public void testThatICanTFindEntryByID () {
//        Entry newEntry = new Entry();
//        Entry newEntry1 = new Entry();
//        entryRepository.save(newEntry);
//        entryRepository.save(newEntry1);
//        assertSame (newEntry, entryRepository.findEntry(1));
//    }
//
//}