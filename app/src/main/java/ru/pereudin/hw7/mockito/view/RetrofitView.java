package ru.pereudin.hw7.mockito.view;

import moxy.MvpView;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface RetrofitView extends MvpView {
    @StateStrategyType(value = SkipStrategy.class)
    void showName(String name);
}
