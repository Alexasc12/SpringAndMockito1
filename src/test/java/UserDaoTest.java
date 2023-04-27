import org.example.User;
import org.example.UserDao;
import org.example.UserDaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserDaoTest {
    private final UserDaoImpl out = new UserDaoImpl();

    @Test
    public void checkGetUserByName(){
        User user = out.getUserByName("Misha");

        Assertions.assertNotNull(user);
        Assertions.assertEquals( user.getName(), "Misha");
    }

    @Test
    public void checkForNullGetUserByName(){
        Assertions.assertNull( out.getUserByName("Bobo"));
    }



}