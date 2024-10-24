package com.renhejia.robot.commandlib.consts

object AppCmdConsts {
    const val COMMAND_TYPE_SET_ROBOT_MODE: String = "setRobotMode"
    const val COMMAND_VALUE_FACTORY_MODE_IN: String = "factory_in"
    const val COMMAND_VALUE_FACTORY_MODE_OUT: String = "factory_out"
    const val COMMAND_VALUE_UPDATE_MODE_IN: String = "ota_in"
    const val COMMAND_VALUE_UPDATE_MODE_OUT: String = "ota_out"

    const val COMMAND_VALUE_TO_PREVIOUS_MODE: String = "previous_mode"
    const val COMMAND_VALUE_CLOCK_START: String = "clock_start"
    const val COMMAND_VALUE_CLOCK_STOP: String = "clock_stop"

    const val COMMAND_VALUE_TO_SLEEP_MODE: String = "go_sleep"

    const val COMMAND_TYPE_HAND_REG: String = "identHandResult"
    const val COMMAND_TYPE_HAND_REG_IN: String = "10101"
    const val COMMAND_TYPE_HAND_REG_OUT: String = "10102"

    const val COMMAND_VALUE_EXIT: String = "exit"


    const val COMMAND_TYPE_HAND_ID: Int = 10001
    const val COMMAND_ID_WAKE_UP: Int = 10002

    const val COMMAND_TYPE_START_AUDIO_SERVICE: String = "start_audio_service"
    const val COMMAND_TYPE_STOP_AUDIO_SERVICE: String = "stop_audio_service"
    const val COMMAND_TYPE_SHUT_DOWN_AUDIO_SERVICE: String = "shut_down_audio_service"
    const val COMMAND_CLIFF_TRIGGER: String = "cliff_trigger"


    //拍照：1 开始；0退出
    const val COMMAND_TYPE_TAKE_PHOTO: String = "take_photo"
    const val COMMAND_VALUE_EXIT_TAKE_PHOTO: Int = 0

    const val COMMAND_STOP_APP: String = "stop_app"

    const val VALUE_COMMAND_STOP_VIDEO_CALL: String = "stop_video_call"

    const val COMMAND_TYPE_OPEN_ROBOT_REMINDER: String = "openRobotReminder"
    const val COMMAND_TYPE_OPEN_PREVIEW_ROBOT_REMINDER: String = "openPreviewRobotReminder"

    const val COMMAND_TYPE_CLOSE_ROBOT_REMINDER: String = "closeRobotReminder"
    const val COMMAND_VALUE_REMINDER_WATER: String = "water"
    const val COMMAND_VALUE_REMINDER_SED: String = "sed"
    const val COMMAND_VALUE_REMINDER_SITE: String = "site"
    const val COMMAND_VALUE_REMINDER_KEEP: String = "keep"
    const val COMMAND_VALUE_REMINDER_OPEN_FACE_SEARCH: String = "open_search"
    const val COMMAND_VALUE_REMINDER_CLOSE_FACE_SEARCH: String = "close_search"
}
