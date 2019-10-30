package ru.pereudin.hw7.mockito.presenter;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.Observable;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.schedulers.Schedulers;
import ru.pereudin.hw7.app.DaggerTestComponent;
import ru.pereudin.hw7.app.TestComponent;
import ru.pereudin.hw7.app.TestModule;
import ru.pereudin.hw7.mockito.model.RetrofitApi;
import ru.pereudin.hw7.mockito.model.User;
import ru.pereudin.hw7.mockito.view.RetrofitView;

@RunWith(MockitoJUnitRunner.class)
public class RetrofitPresenterTest {

    private RetrofitPresenter retrofitPresenter;

    @Mock
    RetrofitView retrofitView;

    @BeforeClass
    public static void setupClass() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(
                ___ -> Schedulers.trampoline());
    }

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
        retrofitPresenter = Mockito.spy(new RetrofitPresenter());
    }

    @Test
    public void getString_isCorrect() {
        TestComponent component = DaggerTestComponent.builder()
                .testModule(new TestModule() {

                    @Override
                    public RetrofitApi provideRetrofitApi() {
                        RetrofitApi retrofitApi = super.provideRetrofitApi();
                        User user = new User();
                        user.login = "Jack";
                        Mockito.when(retrofitApi.requestServer()).thenReturn(Observable.just(user));
                        return retrofitApi;
                    }
                }).build();

        component.inject(retrofitPresenter);
        retrofitPresenter.attachView(retrofitView);
        retrofitPresenter.getString();
        Mockito.verify(retrofitView).showName("Jack");
    }

}
