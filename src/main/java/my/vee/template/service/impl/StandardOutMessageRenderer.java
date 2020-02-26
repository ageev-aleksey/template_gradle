package my.vee.template.service.impl;

import my.vee.template.service.MessageProvider;
import my.vee.template.service.MessageRenderer;
import org.springframework.stereotype.Service;

@Service
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("messageProvider is Null");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
