package objectmapper.test;

import Object.ObjectMapperApplication;
import Object.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ObjectMapperApplication.class)
public class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-----");

        var objectMapper = new ObjectMapper();

        // object -> text
        // object mapper get method 를 활용해서 데이터를 가져온다.
        // get 이 붙은 메소드에서 모두 데이터를 가져오기 때문에, get 메소드가 아닌 다른 메소드는 get을 붙이지 않음
        var user = new User("Steve", 10, "010-123-4124");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);


        // text -> object
        // objeect mapper 는 default 생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }
}
