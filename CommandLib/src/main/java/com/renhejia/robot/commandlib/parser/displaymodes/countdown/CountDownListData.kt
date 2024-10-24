package com.renhejia.robot.commandlib.parser.displaymodes.countdown

/**
 * @author liujunbin
 */
class CountDownListData {
    var event_total: Int = 0
    var isHas_more: Boolean = false
    var event_list: Array<CountDownEventItem> = emptyArray()

    override fun toString(): String {
        return "{" +
                "event_total=" + event_total +
                ", has_more=" + isHas_more +
                ", event_list=" + event_list.contentToString() +
                '}'
    }
}
