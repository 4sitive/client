package org.positive.daymotion.data.repository

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import org.positive.daymotion.domain.Feed

interface FeedRepository {

    fun getFeed(feedId: String): Single<Feed>

    fun getFeedWithUserId(userId: String): Single<List<Feed>>

    fun getFeedWithCategoryId(categoryId: String): Single<List<Feed>>

    fun getFeedWithMissionId(missionId: String): Single<List<Feed>>

    fun postFeed(feedImage: String, missionId: String): Completable

    fun updateEmoji(
        emojis: List<String>,
        feedId: String
    ): Completable
}