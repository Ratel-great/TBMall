package com.threebody.tbmall.base;

import com.threebody.tbmall.entity.param.QueryPageParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface BaseCRUDMapper<Entity, Param extends QueryPageParam, Result> {

    /**
     * 根据ID查询返回单个对象
     * @param id
     * @return
     */
    Result selectSingleById(String id);

    /**
     * 根据对象查询返回单条记录
     * @param entity
     * @return
     */
    Result selectSingleByEntity(Entity entity);

    /**
     * 新增单条记录
     * @param entity
     * @return
     */
    Boolean insert(Entity entity);

    /**
     * 修改单条记录根据ID
     * @param entity
     * @return
     */
    Boolean updateById(Entity entity);

    /**
     * 删除单条记录根据ID
     * @param id
     * @return
     */
    Boolean delete(String id);

    /**
     * 查询多条记录根据单个对象
     * @param entity
     * @return
     */
    List<Result> selectAllByEntity(Entity entity);

    /**
     * 分页查询根据单个分页条件对象
     * @param param
     * @return
     */
    List<Result> queryPageByParam(Param param);
}
