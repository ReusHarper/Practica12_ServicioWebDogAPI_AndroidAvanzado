package dgtic.unam.serviciowebdogapi

import com.google.gson.annotations.SerializedName

data class ModeloDog(
    @SerializedName("message") var images:List<String>)