package my.vee.template.service.config;

import my.vee.template.service.MessageProvider;
import my.vee.template.service.MessageRenderer;
import my.vee.template.service.impl.HelloWorldMessageProvider;
import my.vee.template.service.impl.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(provider());
        return messageRenderer;
    }
}
