package com.haoran.mapper;

import com.haoran.pojo.Headline;
import com.haoran.pojo.vo.PortalVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author Jackiechan
* @description 针对表【news_headline】的数据库操作Mapper
* @createDate 2023-08-04 15:31:10
* @Entity com.haoran.pojo.Headline
*/
public interface HeadlineMapper extends BaseMapper<Headline> {

    IPage<Map> selectMyPage(IPage<Map> page, @Param("portalVo") PortalVo portalVo);

    Map queryDetailMap(Integer hid);
}




