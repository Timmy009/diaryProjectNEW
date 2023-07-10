package data.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
public class User {
    private String username;
    private String password;
    private String email;
    private String name;

}
