package ru.pereudin.hw7.app;

import javax.inject.Singleton;

import dagger.Component;
import ru.pereudin.hw7.mockito.presenter.RetrofitPresenter;

@Singleton
@Component(modules = {TestModule.class})
public interface TestComponent {
    void inject(RetrofitPresenter retrofitPresenter);
}
