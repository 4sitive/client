package org.befour.sms.data.model

import com.google.gson.annotations.SerializedName

data class ServerTimeResponse(
    @SerializedName("unixtime") val unixTime: Long
)