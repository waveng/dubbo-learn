package xis.learn.spring.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;

import xis.learn.spring.dome.DemoService;

/**
 * 
 * 类DemoServiceImpl.java的实现描述：
 * 使用 @Service 标注要发布的服务， 暴露服务
 * @author wangbo 2018年2月9日 下午3:59:31
 * @date 2018年2月9日 下午3:59:31
 * @version V1.0
 */
@Service(interfaceClass=DemoService.class)
public class DemoServiceImpl implements DemoService {
    private static final Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);

    public String sayHello(String name) {
        log.info("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}
