package com.haoran.service;

import com.haoran.pojo.Type;
import com.haoran.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Jackiechan
* @description 针对表【news_type】的数据库操作Service
* @createDate 2023-08-04 15:31:10
*/
public interface TypeService extends IService<Type> {

    /**
     * 查询所有类别数据
     * @return
     */
    Result findAllTypes();
}
