package com.threebody.tbmall.entity.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AdminUserRetrieveParam extends QueryPageParam {

    private String name;
}
