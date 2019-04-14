package com.threebody.tbmall.base;

import com.github.pagehelper.PageInfo;
import com.threebody.tbmall.entity.param.QueryPageParam;

import java.util.List;

public interface BaseCRUDService<Crete, Update, Retrieve extends QueryPageParam, Result> {
    /** 删除 */
    public Boolean delete(String id);
    /** 增加*/
    public Boolean insert(Crete record);
    /** 更新*/
    public Boolean update(Update record);
    /** 查询单个根据<T>*/
    public Result selectByT(Retrieve record);
    /** 查询全部列表*/
    public List<Result> selectAll(int pageNum, int pageSize);
    /** 查询全部列表分页*/
    public PageInfo<Result> selectAllPage(Retrieve t);
}
