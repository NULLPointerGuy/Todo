package com.karthik.corecommon.Modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by karthikrk on 08/08/17.
 */

@Module
public class TodoAppModule {
    private Application application;

    public TodoAppModule(Application application){
        this.application = application;
    }

    @Provides @Singleton
    public Context providesContext(){
        return application;
    }

    @Provides @Singleton
    public SharedPreferences providesSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    public Picasso providesPicasso(Context context){
        return Picasso.with(context);
    }
}
