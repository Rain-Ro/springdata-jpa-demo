package com.llss.test;

import com.llss.entity.SysUser;
import com.llss.repository.SysUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class JpaCrudTest {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Test
    public void loadContext() {

    }

    /**
     * 添加
     */
    @Test
    public void testInsert() {
        for (int i = 'a'; i < 'z'; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setName(i + i + "");
            sysUser.setEmail(i + "@123.com");
            sysUserRepository.save(sysUser);
        }
    }

    /**
     * 修改
     */
    @Test
    public void testUpdate() {
        SysUser sysUser = new SysUser(1l, "rosen", "rosen@1321.com");
        sysUserRepository.save(sysUser);
    }

    /**
     * 删除
     */
    @Test
    public void testDelete() {
        sysUserRepository.deleteById(2l);
    }

    /**
     * 查询单个
     */
    @Test
    public void findOne() {
        Optional<SysUser> opt = sysUserRepository.findById(1l);
        SysUser sysUser = opt.get();
        System.out.println(sysUser);
    }

    /**
     * 查询所有
     */
    @Test
    public void findAll() {
        List<SysUser> list = sysUserRepository.findAll();
        System.out.println(list);
    }

    /**
     * 通过email查询
     */
    @Test
    public void testFindWithCondition() {
        SysUser sysUser = sysUserRepository.findByEmail("rosen@1321.com");
        System.out.println(sysUser);
    }
}
