//package services;
//
//import Dtos.request.CreateEntryRequest;
//import data.model.Entry;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class EntryServiceImplTest {
//    private EntryService entryService;
//
//    @BeforeEach public void setUp () {
//        entryService = new EntryServiceImpl();
//    }
//    @Test public void registerTest () {
//        CreateEntryRequest createEntryRequest = new CreateEntryRequest();
//        createEntryRequest.setBody("I miss mum");
//        createEntryRequest.setTitle("mum");
//        entryService.createEntry(createEntryRequest);
//        assertEquals(1, entryService.numberOfUsers());
//    }
//
//    @Test public void registerTwoUsers_CountIsTwo() {
//        CreateEntryRequest createEntryRequest = new CreateEntryRequest();
//        createEntryRequest.setBody("I miss mum");
//        createEntryRequest.setTitle("mum");
//        entryService.createEntry(createEntryRequest);
//        CreateEntryRequest createEntryRequest1 = new CreateEntryRequest();
//        createEntryRequest.setBody("I miss mum2");
//        createEntryRequest.setTitle("mum2");
//        entryService.createEntry(createEntryRequest1);
//        assertEquals(2, entryService.numberOfUsers());
//    }
//
//    @Test public void registerTwoUsers_DeleteOne_CountIsOneTest() {
//        CreateEntryRequest createEntryRequest = new CreateEntryRequest();
//        createEntryRequest.setBody("I miss mum");
//        createEntryRequest.setTitle("mum");
//       Entry entry = entryService.createEntry(createEntryRequest);
//        CreateEntryRequest createEntryRequest1 = new CreateEntryRequest();
//        createEntryRequest.setBody("I miss mum2");
//        createEntryRequest.setTitle("mum2");
//        entryService.createEntry(createEntryRequest1);
//        entryService.deleteEntry("1");
//        assertEquals(1, entryService.numberOfUsers());
//    }
//
//}