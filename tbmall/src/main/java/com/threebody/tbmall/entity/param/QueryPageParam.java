package com.threebody.tbmall.entity.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QueryPageParam {
    @ApiModelProperty(value = "每页数据大小", name = "pageSize")
    private int pageSize;
    @ApiModelProperty(value = "查询的页码", name = "pageSize")
    private int pageNum;
}
