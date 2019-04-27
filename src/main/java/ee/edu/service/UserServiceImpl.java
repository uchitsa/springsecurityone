package ee.edu.service;

import ee.edu.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("6b283bb060c269432d08ac33b47a337c0a40035d");

        return user;
    }
}