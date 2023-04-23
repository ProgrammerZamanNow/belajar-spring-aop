package programmerzamannow.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloService {

    public String hello(String name) {
        log.info("Call HelloService.hello()");
        return "Hello " + name;
    }

    public String hello(String firstName, String lastName) {
        log.info("Call HelloService.hello()");
        return "Hello " + firstName + " " + lastName;
    }

    public String bye(String name) {
        log.info("Call HelloService.bye()");
        return "Bye " + name;
    }

    public void test(){
        log.info("Call HelloService.test()");
    }

}
