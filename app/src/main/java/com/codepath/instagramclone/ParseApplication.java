package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YHFHmECzCcMbwZ1dvavXNFICpFTWrOqQKZLUr8ZN")
                .clientKey("FKBDDozyDlFO4AA31lYWd4O74wPTt07nyZMpiQlP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
