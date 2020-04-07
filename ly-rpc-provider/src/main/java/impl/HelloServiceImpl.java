package impl;

import service.IHelloService;

public class HelloServiceImpl implements IHelloService {
    public String sayHello(String text) {
        System.out.println("request data : "+text);
        return "hello : "+text;
    }
}
