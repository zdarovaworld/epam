package homework6collectionlist.travelagency_v5.user.repo;

import homework6collectionlist.travelagency_v5.common.business.repo.BaseRepo;
import homework6collectionlist.travelagency_v5.user.domain.User;
import homework6collectionlist.travelagency_v5.user.search.UserSearchCondition;

public interface UserRepo extends BaseRepo {

    void add(User user);

    User findById(long id);

    User[] search(UserSearchCondition searchCondition);
}
