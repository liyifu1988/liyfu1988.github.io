package org.example.liyifucloudcenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.liyifucloudcenter.entity.User;
import org.example.liyifucloudcenter.mapper.UserMapper;
import org.example.liyifucloudcenter.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
