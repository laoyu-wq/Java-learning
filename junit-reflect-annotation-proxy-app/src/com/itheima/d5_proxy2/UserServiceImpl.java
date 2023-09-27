package com.itheima.d5_proxy2;

public class UserServiceImpl implements UserService{
    @Override
    public void login(String loginName, String passWord) throws Exception {
//        long startTime = System.currentTimeMillis();

        if ("admin".equals(loginName) && "123456".equals(passWord)){
            System.out.println("您登陆成功，欢迎光临本系统~");
        }else {
            System.out.println("您登陆失败，用户名或密码错误~");
        }
        Thread.sleep(1000);

//        long endTime = System.currentTimeMillis();
//        System.out.println("login方法执行耗时：" + (endTime - startTime)/1000.0 + "s");
    }

    @Override
    public void deleteUsers() throws Exception {
//        long startTime = System.currentTimeMillis();

        System.out.println("成功删除了1万个用户");
        Thread.sleep(1500);

//        long endTime = System.currentTimeMillis();
//        System.out.println("deleteUsers方法执行耗时：" + (endTime - startTime)/1000.0 + "s");
    }

    @Override
    public String[] selectUsers() throws Exception {
//        long startTime = System.currentTimeMillis();

        System.out.println("查询出了3个用户");
        String[] names = {"张","李","牛"};
        Thread.sleep(500);

//        long endTime = System.currentTimeMillis();
//        System.out.println("deleteUsers方法执行耗时：" + (endTime - startTime)/1000.0 + "s");
        return names;
    }
}
