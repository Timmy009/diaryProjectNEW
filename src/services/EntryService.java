package services;

import Dtos.request.CreateEntryRequest;
import Dtos.request.UpdateEntryRequest;
import Dtos.response.CreateEntryResponse;
import data.model.Entry;

import java.util.List;

public interface EntryService {
    CreateEntryResponse createEntry(CreateEntryRequest createEntryRequest);
    void deleteEntry(String EntryID);
    Entry getEntryByID(String ID);
    List<Entry> findEntriesByDiaryID(String ID);
     Entry updateEntry(UpdateEntryRequest updateEntryRequest);
     List<Entry> findEntryByTitleAndDiaryID(String title, String DiaryID);


}
