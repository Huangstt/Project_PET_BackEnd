package project_pet_backEnd.manager.service;

import project_pet_backEnd.manager.dao.ManagerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project_pet_backEnd.manager.dto.CreateManagerRequest;
import project_pet_backEnd.user.dto.loginResponse;

@Service
public class ManagerService {
    @Autowired
    private ManagerDao managerDao;
    public loginResponse createManager(CreateManagerRequest createManagerRequest){

        return  null;
    }
}
