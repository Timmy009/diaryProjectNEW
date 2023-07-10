package data.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Diary {
    private User user;
    @Id
    private String diaryID;
    private boolean isLocked = true;

}
