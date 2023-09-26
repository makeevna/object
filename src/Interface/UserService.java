package Interface;

import Model.User;

import java.util.List;

public interface UserService {
    User createUser(String firstName, String lastName, String email);

    List<User> getAllUsers();

    User getUserById(int userId);

    boolean updateUser(int userId, String firstName, String lastName, String email);

    boolean deleteUser(int userId);
}
