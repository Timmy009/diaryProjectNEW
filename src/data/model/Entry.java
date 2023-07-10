package data.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@Document
public class Entry {
private String title;
private String body;
@CreatedDate
private String dateCreated;
private LocalDateTime timeCreated;
@Id
private String entryID;
private String diaryID;



@Override
public boolean equals (Object o) {
        if (o instanceof Entry casted)
            return casted.getEntryID() ==this.entryID;


        return false;
    }
}
