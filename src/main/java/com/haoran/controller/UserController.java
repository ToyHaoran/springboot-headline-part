package com.haoran.controller;

import com.haoran.pojo.User;
import com.haoran.service.UserService;
import com.haoran.utils.JwtHelper;
import com.haoran.utils.Result;
import com.haoran.utils.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: com.haoran.controller
 *
 * @author: 赵伟风
 * description:
 */

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public Result login(@RequestBody User user){
        Result result = userService.login(user);
        return result;
    }

    @GetMapping("getUserInfo")
    public Result getUserInfo(@RequestHeader String token){
        Result result = userService.getUserInfo(token);
        return result;
    }


    @PostMapping("checkUserName")
    public Result checkUserName(String username){
        Result result = userService.checkUserName(username);
        return result;
    }


    @PostMapping("regist")
    public Result regist(@RequestBody  User user){
        Result result = userService.regist(user);
        return result;
    }


    @GetMapping("checkLogin")
    public Result checkLogin(@RequestHeader String token){

        boolean expiration = jwtHelper.isExpiration(token);

        if (expiration){
            //已经过期了
            return Result.build(null, ResultCodeEnum.NOTLOGIN);
        }
        return Result.ok(null);
    }


}
