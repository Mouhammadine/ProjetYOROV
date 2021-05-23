package com.example.projetyorov.data;

import com.example.projetyorov.presentation.model.RestPokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface PokeApi {

    @GET("/api/v2/pokemon")
    Call<RestPokemonResponse>getPokemonResponse();


}
