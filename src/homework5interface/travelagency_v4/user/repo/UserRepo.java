package homework5interface.travelagency_v4.user.repo;

import homework5interface.travelagency_v4.common.business.repo.BaseRepo;
import homework5interface.travelagency_v4.user.domain.User;
import homework5interface.travelagency_v4.user.search.UserSearchCondition;

public interface UserRepo extends BaseRepo {

    void add(User user);

    User findById(long id);

    User[] search(UserSearchCondition searchCondition);
}
