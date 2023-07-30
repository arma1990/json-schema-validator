package model


import com.fasterxml.jackson.annotation.JsonProperty

data class AddPlaceResponse(
    @JsonProperty("accuracy")
    val accuracy: String,
    @JsonProperty("address")
    val address: Int,
    @JsonProperty("language")
    val language: String,
    @JsonProperty("location")
    val location: Location,
    @JsonProperty("name")
    val name: String,
    @JsonProperty("phone_number")
    val phoneNumber: String,
    @JsonProperty("types")
    val types: String,
    @JsonProperty("website")
    val website: String
)
{
    data class Location(
            @JsonProperty("latitude")
            val latitude: String,
            @JsonProperty("longitude")
            val longitude: String
    )
}