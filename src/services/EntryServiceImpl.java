package services;

import Dtos.request.CreateEntryRequest;
import Dtos.request.UpdateEntryRequest;
import Dtos.response.CreateEntryResponse;
import data.model.Entry;
import data.respositories.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static utils.Mappers.map;

@Service
@Component
public class EntryServiceImpl implements EntryService{

    @Autowired  
  private EntryRepository entryRepository;



    @Override
    public CreateEntryResponse createEntry(CreateEntryRequest createEntryRequest) {
        Entry entry = new Entry();
        map (entry, createEntryRequest);
        entryRepository.save(entry);
        CreateEntryResponse createEntryResponse = new CreateEntryResponse();
        createEntryResponse.setTitle(entry.getTitle());
        createEntryResponse.setBody(entry.getBody());
        createEntryResponse.setDateCreated(entry.getDateCreated());
        return createEntryResponse;
    }

    @Override
    public void deleteEntry(String EntryID) {
       Optional<Entry> foundEntry = entryRepository.findById(EntryID);
        entryRepository.delete(foundEntry.get());

    }


    @Override
    public Entry getEntryByID(String ID) {
        return entryRepository.findById(ID).get();
    }

    @Override
    public List<Entry> findEntriesByDiaryID(String ID) {
        return null;
    }

    @Override
    public Entry updateEntry(UpdateEntryRequest updateEntryRequest) {
        Entry foundEntry = entryRepository.findById(updateEntryRequest.getEntryID()).get();
        return entryRepository.save(foundEntry);
    }

    @Override
    public List<Entry> findEntryByTitleAndDiaryID(String title, String DiaryID) {
        return null;
    }




}
