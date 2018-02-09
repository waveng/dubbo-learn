package xis.learn.spring.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

/**
 * 
 * 类DubboConfiguration.java的实现描述：
 * 这里启用 @DubboComponentScan 扫描 Dubbo 服务 
 * @author wangbo 2018年2月9日 下午4:10:36
 * @date 2018年2月9日 下午4:10:36
 * @version V1.0
 */
@Configuration
@DubboComponentScan(basePackages = "xis.learn.spring.consumer")
public class DubboConfiguration {
    private static final Logger log = LoggerFactory.getLogger(DubboConfiguration.class);
}
