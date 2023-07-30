package model

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPlaylistResponse(
    @JsonProperty("collaborative")
    val collaborative: Boolean?,
    @JsonProperty("description")
    val description: String?,
    @JsonProperty("external_urls")
    val externalUrls: ExternalUrls?,
    @JsonProperty("followers")
    val followers: Followers?,
    @JsonProperty("href")
    val href: String?,
    @JsonProperty("id")
    val id: String?,
    @JsonProperty("images")
    val images: List<Any>?,
    @JsonProperty("name")
    val name: String?,
    @JsonProperty("owner")
    val owner: Owner?,
    @JsonProperty("primary_color")
    val primaryColor: Any? = null,
    @JsonProperty("public")
    val `public`: Boolean?,
    @JsonProperty("snapshot_id")
    val snapshotId: String?,
    @JsonProperty("tracks")
    val tracks: Tracks?,
    @JsonProperty("type")
    val type: String?,
    @JsonProperty("uri")
    val uri: String?
)
{
    data class ExternalUrls(
        @JsonProperty("spotify")
        val spotify: String?
    )

    data class Followers(
        @JsonProperty("href")
        val href: Any? = null,
        @JsonProperty("total")
        val total: Int?
    )

    data class Owner(
        @JsonProperty("display_name")
        val displayName: String?,
        @JsonProperty("external_urls")
        val externalUrls: ExternalUrls?,
        @JsonProperty("href")
        val href: String?,
        @JsonProperty("id")
        val id: String?,
        @JsonProperty("type")
        val type: String?,
        @JsonProperty("uri")
        val uri: String?
    )

    data class Tracks(
        @JsonProperty("href")
        val href: String?,
        @JsonProperty("items")
        val items: List<Any?>?,
        @JsonProperty("limit")
        val limit: Int?,
        @JsonProperty("next")
        val next: Any? = null,
        @JsonProperty("offset")
        val offset: Int?,
        @JsonProperty("previous")
        val previous: Any? = null,
        @JsonProperty("total")
        val total: Int?
    )
}