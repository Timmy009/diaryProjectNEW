package Dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateEntryRequest {
    private String entryID;
    private String newTitle;
    private String newBody;



}
