package my.vee.template.service.impl;

import my.vee.template.service.MessageProvider;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "HelloWorld";
    }
}
