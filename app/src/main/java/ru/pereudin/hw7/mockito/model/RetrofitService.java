package ru.pereudin.hw7.mockito.model;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitService {
    @GET("/users/{user}")
    Observable<User> getUser(@Path("user") String user);
}
