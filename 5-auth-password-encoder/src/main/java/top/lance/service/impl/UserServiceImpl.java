package top.lance.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.lance.entity.User;
import top.lance.mapper.UserMapper;
import top.lance.service.IUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author oranges
 * @since 2024-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
