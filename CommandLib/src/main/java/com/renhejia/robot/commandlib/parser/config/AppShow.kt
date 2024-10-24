package com.renhejia.robot.commandlib.parser.config

import com.google.gson.annotations.SerializedName

data class AppShow (
    @SerializedName("app_tag")
    var appTag: String? = null,

    @SerializedName("open_path")
    var openPath: String? = null,

    @SerializedName("package_name")
    var packageName: String? = null
)
