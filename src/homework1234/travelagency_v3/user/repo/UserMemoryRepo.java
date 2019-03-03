package homework1234.travelagency_v3.user.repo;

import homework1234.travelagency_v3.common.ArrayUtils;
import homework1234.travelagency_v3.user.User;

import static homework1234.travelagency_v3.storage.Storage.users;

public class UserMemoryRepo {
    private int userIndex = 0;

    public void addUser(User user) {
        if (userIndex == users.length - 1) {
            User[] newArrUsers = new User[users.length * 2];
            System.arraycopy(users, 0, newArrUsers, 0, users.length);
            users = newArrUsers;
        }
        users[userIndex] = user;
        userIndex++;
    }

    public void deleteUser(Long id) {
        Integer userIndex = findUserIndexById(id);
        if (userIndex != null) {
            deleteUserByIndex(userIndex);
        }
    }

    public void deleteUser(User user) {
        Integer foundIndex = findUserIndexByEntity(user);
        if (foundIndex != null) {
            deleteUserByIndex(foundIndex);
        }
    }

    public User findUserById(long id) {
        Integer userIndex = findUserIndexById(id);
        if (userIndex != null) {
            return users[userIndex];
        }
        return null;
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    private void deleteUserByIndex(int index) {
        User[] newArrUsers = new User[users.length - 1];
        ArrayUtils.removeElement(users, index);
        userIndex--;
    }

    private Integer findUserIndexByEntity(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                return i;
            }
        }
        return null;
    }

    private Integer findUserIndexById(Long userId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId().equals(userId)) {
                return i;
            }
        }
        return null;
    }

    private User[] getNotNullUsers(){
        User[] newArrUsers = new User[userIndex];
        int i = 0;
        for (User user : users) {
            if (user != null) {
                newArrUsers[i] = user;
                i++;
            }
        }
        userIndex = users.length - 1;
        return newArrUsers;
    }
}
