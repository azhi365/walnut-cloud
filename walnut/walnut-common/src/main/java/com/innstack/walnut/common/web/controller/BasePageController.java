package com.innstack.walnut.common.web.controller;

import com.alibaba.fastjson.JSON;
import com.innstack.walnut.common.model.PageInfo;
import com.innstack.walnut.common.model.PageRestResultBuilder;
import com.innstack.walnut.common.model.RestResult;
import com.innstack.walnut.common.web.dto.PageInfoDto;
import org.springframework.web.bind.annotation.RequestMapping;


public abstract class BasePageController<T> extends BaseController {

    @RequestMapping("/list")
    public RestResult listPage(PageInfoDto pageInfoDto) {
        logger.debug("listPage pageInfoDto: {}", pageInfoDto);
        PageInfo<T> pageInfo = this.listPageInfo(PageInfo.<T>build(pageInfoDto));
        logger.debug("listPage {}", JSON.toJSONString(pageInfo));
        return PageRestResultBuilder.builder().success(pageInfo).build();
    }

    public abstract PageInfo<T> listPageInfo(PageInfo<T> pageInfo);
}
