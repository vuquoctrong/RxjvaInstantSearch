package com.rikkei.rxjvainstantsearch.network;

import com.rikkei.rxjvainstantsearch.network.model.Contact;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("contacts.php")
    Observable<List<Contact>> getContacts(@Query("source") String source, @Query("search") String query);
}


