package dgtic.unam.serviciowebdogapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ServicesAPI {
    @GET
    suspend fun getBreedbyDogs(@Url url:String):Response<ModeloDog>
}