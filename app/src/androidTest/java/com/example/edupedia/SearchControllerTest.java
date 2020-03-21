package com.example.edupedia;

import com.example.edupedia.model.School;
import com.example.edupedia.model.SchoolReader;
import com.example.edupedia.controller.SearchController;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.HashMap;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class SearchControllerTest {
    @Test
    public void setEdLevel() throws IOException {
        SchoolReader schoolReader = SchoolReader.getInstance(InstrumentationRegistry.getInstrumentation().getTargetContext());
        HashMap<String, School> schools = schoolReader.retrieveSchools();
        SearchController searchController = new SearchController();
        searchController.setTextFilterEdLevel("JUNIOR COLLEGE");
        assertEquals("JUNIOR COLLEGE", searchController.getTextFilterEdLevel().getValue());
//        searchController.setTextFilterLocation();
//        searchController.setTextFilterPrefStream();
        assertEquals(344, schools.size());
        HashMap<String, School> results = searchController.onBasicSearch(schools);
        assertEquals(10, results.size());
    }
}
