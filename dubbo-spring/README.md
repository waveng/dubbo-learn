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

### dubbo 配置服务动检查

dubbo.reference.check=false，强制改变所有 reference 的 check 值，就算配置中有声明，也会被覆盖。  
dubbo.consumer.check=false，是设置 check 的缺省值，如果配置中有显式的声明，如：<dubbo:reference check="true"/>，不会受影响。  
dubbo.registry.check=false，前面两个都是指订阅成功，但提供者列表是否为空是否报错，如果注册订阅失败时，也允许启动，需使用此选项，将在后台定时重试  

#### 通过 dubbo.properties

```properties
#关闭指定服务启动检查
dubbo.reference.xis.learn.spring.dome.DemoService.check=false
#关闭所有服务的启动时检查
dubbo.reference.check=false
#关闭所有服务的启动时检查
dubbo.consumer.check=false
#关闭注册中心启动时检查
#dubbo.registry.check=false
```

#### 通过 JAVA_OPS -D 参数
```properties
java -Ddubbo.reference.xis.learn.spring.dome.DemoService=false
java -Ddubbo.reference.check=false
java -Ddubbo.consumer.check=false 
java -Ddubbo.registry.check=false
```
