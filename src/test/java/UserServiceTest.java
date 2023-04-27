import org.example.User;
import org.example.UserDaoImpl;
import org.example.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    //    private final UserDaoImpl userDaoMock = mock(UserDaoImpl.class);
    @Mock
    private UserDaoImpl userDaoMock;

    @InjectMocks
    private UserService userService;

    @Test
    public void shouldCalUserExistTrue(){
        when(userDaoMock.getUserByName("Misha"))
                .thenReturn(new User("Misha") );

        Assertions.assertTrue(userService.checkUserExist(new User("Misha")));
    }

    @Test
    public void shouldCalUserExistFalse(){
        when(userDaoMock.getUserByName("test"))
                .thenReturn(null);

        Assertions.assertFalse(userService.checkUserExist(new User("test")));
    }

}