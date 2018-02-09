package xis.learn.spring.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring.xml")
public class DemoServiceConsumerTest {
    private static final Logger log = LoggerFactory.getLogger(DemoServiceConsumerTest.class);

    @Autowired
    DemoServiceConsumer         demoServiceConsumer;

    @Test
    public void sayHello() {
        String hi = demoServiceConsumer.sayHello("wangbo");
        log.info(hi);
    }
}
