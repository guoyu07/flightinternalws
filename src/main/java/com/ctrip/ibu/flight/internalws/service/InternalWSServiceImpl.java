package com.ctrip.ibu.flight.internalws.service;

import com.ctrip.ibu.flight.internalws.autogenservice.InternalWSService;
import com.ctrip.ibu.flight.internalws.autogenservice.SendMessageRequestType;
import com.ctrip.ibu.flight.internalws.autogenservice.SendMessageResponseType;
import com.ctriposs.baiji.rpc.common.types.*;

/**
 * 国际网站机票产线公共服务
 */
public class InternalWSServiceImpl implements InternalWSService {
    public SendMessageResponseType sendMessage(SendMessageRequestType request) throws Exception {
        return new SendMessageResponseType();
    }

    public CheckHealthResponseType checkHealth(CheckHealthRequestType request) throws Exception {
        return new CheckHealthResponseType();
    }
}