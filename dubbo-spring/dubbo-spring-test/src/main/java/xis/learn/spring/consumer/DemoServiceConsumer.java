package xis.learn.spring.consumer;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import xis.learn.spring.dome.DemoService;

@Component
public class DemoServiceConsumer {
    
    /**
     * 使用 @Reference 注入dubbu 服务（引用服务）
     */
    @Reference()
    DemoService demoService;
    
    public String sayHello(String name){
        return demoService.sayHello(name);
    }
    
    
}
