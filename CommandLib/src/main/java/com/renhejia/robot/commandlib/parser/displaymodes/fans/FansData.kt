package com.renhejia.robot.commandlib.parser.displaymodes.fans

class FansData {
    var platform: String? = null
    var avatar: String? = null
    var nick_name: String? = null
    var fans_count: String? = null

    override fun toString(): String {
        return "{" +
                "platform='" + platform + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", fans_count='" + fans_count + '\'' +
                '}'
    }
}
