package org.positive.daymotion.data.api

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import org.positive.daymotion.data.model.GetFeedsResponse
import org.positive.daymotion.data.model.PostFeedRequest
import retrofit2.http.*

interface FeedApi {

    @GET("/feeds")
    fun getFeeds(
        @Query("userId") userId: String? = null,
        @Query("categoryId") categoryId: String? = null
    ): Single<GetFeedsResponse>

    @POST("/feeds")
    fun postFeeds(
        @Body request: PostFeedRequest
    ): Completable
}