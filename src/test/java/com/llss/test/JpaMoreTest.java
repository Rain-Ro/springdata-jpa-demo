package com.llss.test;

import com.llss.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class JpaMoreTest {

    @Autowired
    private SysUserRepository  sysUserRepository;

    public void testDelete(List<Long> ids) {

    }
}
