package de.schmidtdennis.popupchinese.quarkus.converter;

import de.schmidtdennis.popupchinese.quarkus.model.dataobject.UserDO;
import de.schmidtdennis.popupchinese.quarkus.model.request.UserAddReq;
import de.schmidtdennis.popupchinese.quarkus.model.valueobject.UserVO;
import io.quarkus.elytron.security.common.BcryptUtil;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserConverter {

    public UserDO toDO(UserAddReq user) {
        UserDO newUser = new UserDO();
        newUser.setLastName(user.getLastName());
        newUser.setFirstName(user.getFirstName());
        newUser.setEmail(user.getEmail());
        newUser.setPasswordHash(BcryptUtil.bcryptHash(user.getPassword()));
        newUser.setRoles(user.getRoles());
        return newUser;
    }

    public UserVO toVO(UserDO userDO) {
        UserVO userVO = new UserVO();

        userVO.setId(userDO.getId());
        userVO.setLastName(userDO.getLastName());
        userVO.setFirstName(userDO.getFirstName());
        userVO.setEmail(userDO.getEmail());
        userVO.setRoles(userDO.getRoles());
        userVO.setPasswordHash(userDO.getPasswordHash());

        return userVO;
    }
}
