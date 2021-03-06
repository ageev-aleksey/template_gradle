/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package my.vee.template;

import my.vee.template.service.MessageRenderer;
import my.vee.template.service.config.HelloWorldConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
