package ru.otus.spring;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.otus.spring.domain.Person;
import ru.otus.spring.service.PersonService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // TODO: создайте здесь класс контекста

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        // TODO: Получите Person Service

        PersonService service = context.getBean(PersonService.class);

        Person ivan = service.getByName("Ivan");

        System.out.println("Sex: " + ivan.getSex() + ", Name: " + ivan.getName() + ", Age: " + ivan.getAge() + ";");

        // Данная операция, в принципе не нужна.
        // Мы не работаем пока что с БД, а Spring Boot сделает закрытие за нас
        // Подробности - через пару занятий
        context.close();
    }
}
