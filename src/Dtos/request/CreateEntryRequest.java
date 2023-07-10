package Dtos.request;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateEntryRequest {
    private String title;
    private String body;


}
