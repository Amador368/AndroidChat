package me.asantiago.android.androidchat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Amador on 24/06/2016.
 */
public class AndroidChatApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
    }

    private void setupFirebase() {
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}
