//package services;
//
//import Dtos.request.ChangePasswordRequest;
//import Dtos.request.LoginRequest;
//import Dtos.request.RegisterRequest;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//import static com.mongodb.assertions.Assertions.assertFalse;
//import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//
//
//
//@SpringBootTest
//class UserServiceImplTest {
//
//    private UserService userService;
//
//
//    @Test
//    public void testForRegister () {
//        RegisterRequest request = new RegisterRequest();
//        request.setUsername("Timi");
//        request.setPassword("1234");
//        request.setEmail("timi@gmail.com");
//        userService.register(request);
//        assertEquals (1, userService.getNumberOfUsers());
//    }
//
//    @Test
//    public void testForRegisterTwoUsers () {
//        RegisterRequest request = new RegisterRequest();
//        request.setUsername("Timi");
//        request.setPassword("1234");
//        request.setEmail("timi@gmail.com");
//        userService.register(request);
//        RegisterRequest request1 = new RegisterRequest();
//        request.setUsername("Sam");
//        request.setPassword("2345");
//        request.setEmail("timi@gmail1.com");
//        userService.register(request1);
//        assertEquals (2, userService.getNumberOfUsers());
//    }
//
//    @Test
//    public void testForDuplicatesUserCannotRegister () {
//        RegisterRequest request = new RegisterRequest();
//        request.setUsername("Timi");
//        request.setPassword("1234");
//        request.setEmail("timi@gmail.com");
//        userService.register(request);
//        RegisterRequest request1 = new RegisterRequest();
//        request1.setUsername("Timi");
//        request1.setPassword("1234");
//        request1.setEmail("timi@gmail.com");
////        userService.register(request1);
//        assertThrows(IllegalArgumentException.class, () -> userService.register(request1));
//
//        try {
//            userService.register(request);
//        } catch (IllegalArgumentException ex) {
//            assertEquals("User Exists", ex.getMessage());
//            assertEquals(IllegalArgumentException.class, ex.getClass());
//        }
//    }
//    @Test public void testThatICanLogin () {
//        RegisterRequest request = new RegisterRequest();
//        request.setUsername("Timi");
//        request.setPassword("1234");
//        request.setEmail("timi@gmail.com");
//        userService.register(request);
//        RegisterRequest request1 = new RegisterRequest();
//        request1.setUsername("Timi1");
//        request1.setPassword("12341");
//        request1.setEmail("timi@gmail1.com");
//       userService.register(request1);
//        assertEquals (2, userService.getNumberOfUsers());
//        LoginRequest loginRequest = new LoginRequest();
//        loginRequest.setEmail("timi@gmail.com");
//        loginRequest.setPassword("1234");
//        userService.logIn(loginRequest);
//        assertTrue(userService.isLoggedIn("timi@gmail.com"));
//    }
//
//    @Test public void testThatICanChangePassword () {
//        RegisterRequest request = new RegisterRequest();
//        request.setUsername("Timi");
//        request.setPassword("1234");
//        request.setEmail("timi@gmail.com");
//        userService.register(request);
//        RegisterRequest request1 = new RegisterRequest();
//        request1.setUsername("Timi1");
//        request1.setPassword("12341");
//        request1.setEmail("timi@gmail1.com");
//        userService.register(request1);
//        assertEquals (2, userService.getNumberOfUsers());
//        assertFalse(userService.isLoggedIn("timi@gmail.com"));
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
//        changePasswordRequest.setOldPassword("1234");
//        changePasswordRequest.setEmail("timi@gmail.com");
//        changePasswordRequest.setNewPassword("7890");
//        userService.changePassword(changePasswordRequest);
//        LoginRequest loginRequest = new LoginRequest();
//        loginRequest.setEmail("timi@gmail.com");
//        loginRequest.setPassword("7890");
//        userService.logIn(loginRequest);
//        assertTrue(userService.isLoggedIn("timi@gmail.com"));
//    }
//
//}