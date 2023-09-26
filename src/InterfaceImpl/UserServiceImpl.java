package InterfaceImpl;

import Interface.UserService;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private List<User> users = new ArrayList<>();

    @Override
    public User createUser(String firstName, String lastName, String email) {
        int nextId = generateNextUserId();
        User user = new User(nextId, firstName, lastName, email);
        users.add(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int userId) {
        return users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean updateUser(int userId, String firstName, String lastName, String email) {
        for (User user : users) {
            if (user.getId() == userId) {
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setEmail(email);
                return true; // User updated successfully.
            }
        }
        return false;
    }

    @Override
    public boolean deleteUser(int userId) {
        return users.removeIf(user -> user.getId() == userId);
    }



    private int generateNextUserId() {

        return users.size() + 1;
    }
}
