package com.example.demo.litflow;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

/**
 * @Author lizhenhua
 * @Date 2024/10/28 16:47
 */
@Component("c")
public class CCmp extends NodeComponent {

    @Override
    public void process() {
        //do your business
        System.out.println("c");
    }

}
