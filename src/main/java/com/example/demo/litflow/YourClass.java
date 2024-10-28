package com.example.demo.litflow;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author lizhenhua
 * @Date 2024/10/28 16:49
 */
@Component
public class YourClass {


    @Resource
    private FlowExecutor flowExecutor;

    public void testConfig(){
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");
        System.out.println(response);
    }

}
