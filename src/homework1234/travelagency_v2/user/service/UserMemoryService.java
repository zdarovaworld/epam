package homework1234.travelagency_v2.user.service;

import homework1234.travelagency_v2.user.User;
import homework1234.travelagency_v2.user.repo.UserMemoryRepo;

public class UserMemoryService {

    private UserMemoryRepo userRepo = new UserMemoryRepo();

    public void addUser(User user) {
        userRepo.addUser(user);
    }

    public User findUserById(long id) {
        return userRepo.findUserById(id);
    }

    public void deleteUser(User user) {
        userRepo.deleteUser(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteUser(id);
    }

    public void printUsers() {
        userRepo.printUsers();
    }
}
