package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.EmailMapper;
import com.qf.entity.Email;
import com.qf.service.IEmailservice;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

/**
 * @version 1.0
 * @user cgc
 * @date 2019/6/30 23:16
 */
@Service
public class EmailServiceImpl implements IEmailservice {
    @Autowired
    private EmailMapper emailMapper;
    @Override
    public List<Email> queryAll() {
        return emailMapper.selectList(null);
    }
}
