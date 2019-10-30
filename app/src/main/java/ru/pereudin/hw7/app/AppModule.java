package ru.pereudin.hw7.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.pereudin.hw7.mockito.model.RetrofitApi;

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    RetrofitApi provideRetrofitApi() {
        return new RetrofitApi();
    }

}
