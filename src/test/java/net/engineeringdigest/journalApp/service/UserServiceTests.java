package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entities.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @BeforeEach
    void setUp(){
        // Executing Before Each Test

    }


//    @ParameterizedTest
//    @ValueSource(strings = {
//            "ram",
//            "shyam",
//            "vipul"
//    })
//    public void testFindByUserName(String name){
//       User user = userRepository.findByUsername(name);
//        assertNotNull(user, "failed for "+ name);
//    }

    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    @Disabled
    public void testSaveNewUser(User user) {
       // calling saveNewUser func. of userService to save new user and if it returns true then test will pass(assertTrue)
        // code coverage with java plugin helps to monitor how much lines of code got tested in each component.
    }


    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,3,9"
    })
    public void test(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }
}
