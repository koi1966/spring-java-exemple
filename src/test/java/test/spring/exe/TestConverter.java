package test.spring.exe;

import org.junit.jupiter.api.Test;
import test.spring.exe.jsonLessen.ObjectToJson;
import test.spring.exe.jsonLessen.User;

import java.util.stream.Stream;

public class TestConverter {
    @Test
    void test(){
        User user = new User("Олег", "56","КОІ");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.convertToJson(user));

        Stream.of("10", "11")
                .map(x -> Integer.parseInt(x, 18))
                .forEach(System.out::println);
    }
}

