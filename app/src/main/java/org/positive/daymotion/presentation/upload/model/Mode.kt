package org.positive.daymotion.presentation.upload.model

import androidx.fragment.app.Fragment
import org.positive.daymotion.presentation.upload.fragment.CameraFragment
import org.positive.daymotion.presentation.upload.fragment.UploadFeedConfirmFragment

enum class Mode(val fragmentClazz: Class<out Fragment>) {
    CAMERA(CameraFragment::class.java),
    CONFIRM(UploadFeedConfirmFragment::class.java)
}