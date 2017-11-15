package com.lcc.drinkwater.api;

import com.lcc.drinkwater.request.SetUserRequest;
import com.lcc.drinkwater.request.UserListRequest;
import com.lcc.drinkwater.request.UserSaveRequest;
import com.lcc.drinkwater.response.UserListResponse;
import com.lcc.drinkwater.response.WorkTeamersResponse;
import com.lcc.drinkwater.vo.User;
import com.lcc.water.common.base.BaseService;
import java.util.List;
import java.util.Map;


public interface UserApi extends BaseService<User, String> {

    //根据用户名查找用户
    User getUserByName(String userName);

    //用户登录
    User findUserbyUserName(String username);

    //新增用户
    boolean saveUser(UserSaveRequest userSaveRequest);

    //删除用户
    boolean deleteUser(String[] ids);

    //启用用户
    boolean enable(String id);

    //禁用用户
    boolean disable(String id);

    //获取用户列表
    List<UserListResponse> getUserList(UserListRequest userListRequest);

    //修改密码
    boolean modfiyPassword(Map<String, Object> map);

    //设置用户
    boolean setUser(SetUserRequest setUserRequest);

    //获取分组参与人
    List<WorkTeamersResponse> getWorkTeamers(String ids);

    User findById(String id);

}
