package com.haoran.service.impl;

import com.haoran.utils.Result;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haoran.pojo.Type;
import com.haoran.service.TypeService;
import com.haoran.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Jackiechan
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2023-08-04 15:31:10
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

    @Autowired
    private TypeMapper typeMapper;

    /**
     * 查询所有类别数据
     * @return
     */
    @Override
    public Result findAllTypes() {

        List<Type> types = typeMapper.selectList(null);

        return Result.ok(types);
    }
}




