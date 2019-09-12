package com.yzj.item.service;

import com.yzj.item.mapper.SpecGroupMapper;
import com.yzj.item.mapper.SpecParamMapper;
import com.yzj.item.po.SpecGroup;
import com.yzj.item.po.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/8/29
 */
@Service
public class SpecificationService {
    @Autowired
    private SpecGroupMapper groupMapper;

    @Autowired
    private SpecParamMapper paramMapper;

    //根据分类id查参数组分组
    public List<SpecGroup> queryGroupsByCid(Long cid) {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        return this.groupMapper.select(specGroup);
    }

    //根据条件查询规格,商品添加时获取规格
    public List<SpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching) {
        SpecParam record = new SpecParam();
        record.setGroupId(gid);
        record.setCid(cid);
        record.setGeneric(generic);
        record.setSearching(searching);
        return this.paramMapper.select(record);
    }
}
