package by.michael;

import java.util.Optional;

public class UserDao {
    public Optional<User> findById(Long id) {
        User user = new User();
        user.setName("HAHAHAHA");
        return Optional.of(user);
    }
}
