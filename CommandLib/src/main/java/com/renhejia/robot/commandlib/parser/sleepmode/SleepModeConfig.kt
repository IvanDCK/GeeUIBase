package com.renhejia.robot.commandlib.parser.sleepmode

/**
 * @author liujunbin
 */
class SleepModeConfig {
    var sleep_mode_switch: Int = 0
    var close_screen_mode_switch: Int = 0

    var sleep_sound_mode_switch: Int = 0
    var sleep_time_status_mode_switch: Int = 0
    var start_time: String? = null
    var end_time: String? = null


    //    @Override
    //    public String toString() {
    //        return "{" +
    //                "sleep_mode_switch=" + sleep_mode_switch +
    //                ", start_time='" + start_time + '\'' +
    //                ", end_time='" + end_time + '\'' +
    //                '}';
    //    }
    override fun toString(): String {
        return "{" +
                "sleep_mode_switch:" + sleep_mode_switch +
                ", close_screen_mode_switch:" + close_screen_mode_switch +
                ", sleep_sound_mode_switch:" + sleep_sound_mode_switch +
                ", sleep_time_status_mode_switch:" + sleep_time_status_mode_switch +
                ", start_time:'" + start_time + '\'' +
                ", end_time:'" + end_time + '\'' +
                '}'
    }
}
