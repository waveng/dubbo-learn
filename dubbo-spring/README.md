## 注解配置

需要 2.5.7 及以上版本支持

### 服务提供方

#### Service注解暴露服务

```java
@Service(interfaceClass=DemoService.class)
public class DemoServiceImpl implements DemoService {
	...
}
```

#### 指定dubbo扫描路径

```java
@DubboComponentScan(basePackages = "xis.learn.spring.provider")
@Configuration
public class DubboConfiguration {
	...
}

```


### 服务消费方

#### Reference注解引用服务

```java
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
```
#### 指定dubbo扫描路径

```java
@DubboComponentScan(basePackages = "xis.learn.spring.provider")
@Configuration
public class DubboConfiguration {
	...
}

```
