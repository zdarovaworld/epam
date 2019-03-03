package homework6collectionlist.travelagency_v5.user.service;

import homework6collectionlist.travelagency_v5.common.business.service.BaseService;
import homework6collectionlist.travelagency_v5.user.domain.User;

public interface UserService extends BaseService {
    void add(User user);

    User findById(Long id);

    void delete(User user);
}
