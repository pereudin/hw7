package ru.pereudin.hw7.app;

import javax.inject.Singleton;

import dagger.Component;
import ru.pereudin.hw7.mockito.presenter.RetrofitPresenter;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(RetrofitPresenter retrofitPresenter);

}
