package com.renhejia.robot.commandlib.parser.config

import com.google.gson.annotations.SerializedName

class UserAppsConfig {
    @SerializedName("id")
    var id: Int = 0

    @SerializedName("app_name")
    var appName: String? = null

    @SerializedName("app_icon")
    var appIcon: String? = null

    //1 用户上传,0 系统应用，
    @SerializedName("app_type")
    var appType: String? = null

    @SerializedName("is_system")
    var isSystem: String? = null

    @SerializedName("notes")
    var notes: String? = null

    @SerializedName("app_package_name")
    var appPackageName: String? = null

    @SerializedName("open_content")
    var openContent: String? = null

    @SerializedName("app_version")
    var appVersion: String? = null

    @SerializedName("upgrade_version")
    var upgradeVersion: String? = null

    @SerializedName("open_type")
    var openType: Int = 0

    @SerializedName("is_restart")
    var isRestart: Int = 0

    @SerializedName("is_show_battery")
    var isShowBattery: Int = 0

    @SerializedName("is_show_text")
    var isShowText: Int = 0

    //0：不上报；1：上报
    @SerializedName("is_show_report")
    var isShowReport: Int = 0
}
