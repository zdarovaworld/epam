package homework6collectionlist.travelagency_v5.user.service;

import homework6collectionlist.travelagency_v5.common.business.application.StorageType;
import homework6collectionlist.travelagency_v5.user.repo.impl.UserMemoryArrayRepo;
import homework6collectionlist.travelagency_v5.user.service.impl.UserDefaultService;

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
