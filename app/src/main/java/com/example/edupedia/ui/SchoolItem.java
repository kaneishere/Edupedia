package com.example.edupedia.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.edupedia.controller.WatchlistController;
import com.example.edupedia.ui.StartUI;
import com.example.edupedia.ui.home.HomeFragment;
import com.example.edupedia.model.School;
public class SchoolItem {
    private int mImageResource;
    private String schoolName;
    private String distaceInfo;
    private String gradeCutOff;
    private WatchlistController watchlistController = WatchlistController.getInstance();


    public SchoolItem(int ImageResource, String SchoolName, String GradecutOff, String Distance_Calculated){
        mImageResource = ImageResource;
        schoolName = SchoolName;
        distaceInfo = Distance_Calculated;
        gradeCutOff = GradecutOff;

    }
    public void openSchoolInfo(){
        //technically should open up the schoolInformation Page;
        schoolName = "clicked";
        //search through school hashmap based on the schoolName.
        //pass that school into the schoolInfoUIClass
        //creates layout dynamically and goes to that activity
    }





    public void removeWatchList(){
        //watchlistController.removeSchool(0);
        //school should be removed from watchList
        //search through school hashmap based on schoolName
        //call the watchlist add method by passing that school into the class
    }

    public void addToCompare(){
        gradeCutOff = "added to compare";
        //school should be added to compare class
        //search through school hashmap based on schoolName
        //add to the compare array and write a toast if compare array is full!
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getGradeCutOff() {
        return gradeCutOff;
    }

    public String getDistaceInfo() {
        return distaceInfo;
    }
}
