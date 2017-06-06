package com.ctrip.ibu.flight.internalws.service;

import com.ctrip.ibu.flight.internalws.service.InternalWSServiceImpl;
import com.ctriposs.baiji.rpc.server.BaijiListener;
import com.ctriposs.baiji.rpc.server.HostConfig;

import javax.servlet.annotation.WebListener;

/**
 * 国际网站机票产线公共服务
 */
@WebListener
public class BaijiWebListener extends BaijiListener {
    public BaijiWebListener(){
        super(InternalWSServiceImpl.class);
    }

    @Override
    protected void configure(final HostConfig hostConfig) {

    }
}