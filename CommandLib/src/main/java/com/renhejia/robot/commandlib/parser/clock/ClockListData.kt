package com.renhejia.robot.commandlib.parser.clock

class ClockListData {
    var total: Int = 0
    var current_page: Int = 0
    var page_count: Int = 0
    var isHas_more: Boolean = false
    var clock_list: Array<ClockInfo> = emptyArray()

    override fun toString(): String {
        return "ClockListData{" +
                "total=" + total +
                ", current_page=" + current_page +
                ", page_count=" + page_count +
                ", has_more=" + isHas_more +
                ", clock_list=" + clock_list.contentToString() +
                '}'
    }
}
