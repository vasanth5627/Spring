package org.spring.core.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/SpEL/SpEl_config.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression =  parser.parseExpression("2+2");
        System.out.println(expression.getValue());


    }

}
