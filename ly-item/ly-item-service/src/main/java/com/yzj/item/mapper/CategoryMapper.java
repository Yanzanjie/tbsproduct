package com.yzj.item.mapper;

import com.yzj.item.po.Category;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category, Long> {
}
