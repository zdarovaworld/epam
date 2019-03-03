package homework5interface.travelagency_v4.user.service;

import homework5interface.travelagency_v4.common.business.service.BaseService;
import homework5interface.travelagency_v4.user.domain.User;

public interface UserService extends BaseService {
    void add(User user);

    User findById(Long id);

    void delete(User user);
}
