package cn.viktor.user.service.impl;

import cn.viktor.user.entity.User;
import cn.viktor.user.mapper.UserMapper;
import cn.viktor.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Viktor
 * @since 2020-08-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
