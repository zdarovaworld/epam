package homework5interface.travelagency_v4.user.service;

import homework5interface.travelagency_v4.common.business.application.StorageType;
import homework5interface.travelagency_v4.user.repo.impl.UserMemoryArrayRepo;
import homework5interface.travelagency_v4.user.service.impl.UserDefaultService;

public class UserServiceCreator {

    private UserServiceCreator() {

    }

    public static UserService getUserService(StorageType storageType) {
        switch (storageType) {

            case MEMORY_ARRAY:
                return new UserDefaultService(new UserMemoryArrayRepo());

            case MEMORY_COLLECTION:{
                return null;
            }

            default: {
                return null;
            }
        }
    }
}
