//package data.respositories;
//
//import data.model.User;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserRepositoryImplTest {
//    @Autowired
//    private UserRepository userRepository;
//
//    @BeforeEach
//    public void setUp () {
//        userRepository = new UserRepositoryImpl();
//    }
//    @Test public void testThatICanSaveUser () {
//        User newUser = new User();
//        userRepository.save(newUser);
//        assertEquals(1, userRepository.count());
//    }
//    @Test public void testThatICanTwoSaveUsers () {
//        User newUser = new User();
//        User newUser1 = new User();
//        userRepository.save(newUser);
//        userRepository.save(newUser1);
//        assertEquals(2, userRepository.count());
//    }
//    @Test public void testThatICanTwoSaveUsersAndDeleteOne () {
//        User newUser = new User();
//        User newUser1 = new User();
//        userRepository.save(newUser);
//        userRepository.save(newUser1);
//        userRepository.delete(newUser);
//        assertEquals(1, userRepository.count());
//    }
//
//    @Test public void testThatICanTwoSaveUsersAndDeleteOneByID () {
//        User newUser = new User();
//        User newUser1 = new User();
//        userRepository.save(newUser);
//        userRepository.save(newUser1);
//        userRepository.delete(1);
//        assertEquals(1, userRepository.count());
//    }
//    @Test public void testThatICanTwoSaveUsersAndDeleteALL () {
//        User newUser = new User();
//        User newUser1 = new User();
//        userRepository.save(newUser);
//        userRepository.save(newUser1);
//        userRepository.deleteAll();
//        assertEquals(0, userRepository.count());
//    }
//}