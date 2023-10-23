package de.schmidtdennis.popupchinese.quarkus.service;

import de.schmidtdennis.popupchinese.quarkus.converter.UserConverter;
import de.schmidtdennis.popupchinese.quarkus.model.dataobject.UserDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.UserAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.UserVO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserService {

    @Inject
    private UserConverter userConverter;

    @Transactional
    public UserVO add(UserAddReq user){
        UserDO userDO = userConverter.toDO(user);
        userDO.persist();
        return userConverter.toVO(userDO);
    }

    public UserVO getById(Integer id){
        UserDO userDO = UserDO.findById(id);

        if(userDO == null){
            throw new NotFoundException();
        }

        return userConverter.toVO(userDO);
    }

    public List<UserVO> getAll(){
        List<UserDO> userDOs = UserDO.listAll();
        return userDOs.stream()
                .map(userDO -> userConverter.toVO(userDO))
                .collect(Collectors.toList());
    }

    @Transactional
    public boolean delete(Integer id) {
        return UserDO.deleteById(id);
    }

}
