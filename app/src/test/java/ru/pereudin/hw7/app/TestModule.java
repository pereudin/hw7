package ru.pereudin.hw7.app;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;
import ru.pereudin.hw7.mockito.model.RetrofitApi;

@Module
public class TestModule {
    @Provides
    public RetrofitApi provideRetrofitApi() {
        return Mockito.mock(RetrofitApi.class);
    }
}
