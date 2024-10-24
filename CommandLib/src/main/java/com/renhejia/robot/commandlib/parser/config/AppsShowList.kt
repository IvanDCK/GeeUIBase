package com.renhejia.robot.commandlib.parser.config

import com.google.gson.annotations.SerializedName

//自动切换APP的model
class AppsShowList {
    @SerializedName("app_show_list")
    var appShowList: List<AppShow>? = null
}
