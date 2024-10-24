package com.renhejia.robot.commandlib.consts

object SpeechConst {
    const val ROBOT_STATUS_SILENCE: String = "avatar.silence"
    const val ROBOT_STATUS_LISTENING: String = "avatar.listening"
    const val ROBOT_STATUS_UNDERSTANDING: String = "avatar.understanding"
    const val ROBOT_STATUS_SPEAKING: String = "avatar.speaking"
    const val ROBOT_STATUS_DEFAULT: String = "avatar.silence"

    const val COMMAND_WAKE_UP_STATUS: String = "wakeup_status"
    const val COMMAND_WAKE_UP_DOA: String = "wakeup_doa"
    const val COMMAND_ENTER_CHAT_GPT: String = "enter_chat_gpt"
    const val COMMAND_QUIT_CHAT_GPT: String = "quit_chat_gpt"
    const val COMMAND_CHAT_GPT_SPEAKING: String = "chat_gpt_speaking"
    const val COMMAND_CHAT_GPT_LISTENING: String = "chat_gpt_listening"
    const val COMMAND_ADD_CLOCK: String = "add_clock"
    const val COMMAND_REMOVE_CLOCK: String = "remove_clock"
    const val COMMAND_ADD_REMINDER: String = "add_reminder"
    const val COMMAND_ADD_NOTICE: String = "add_notice"
    const val COMMAND_MOVE: String = "rhj.controller.navigation" //Const.RhjController.move
    const val COMMAND_TURN: String = "rhj.controller.turn"

    //    public static final String congraturationBirthday = "rhj.controller.congraturation";
    const val ShutDown: String = "DUI.System.Shutdown"
    const val Reboot: String = "DUI.System.Reboot"

    /**
     * 声音调整
     */
    const val SetVolume: String = "DUI.MediaController.SetVolume"

    /**
     * 声音调整
     */
    const val VOLUME_UP: String = "+"
    const val VOLUME_DOWN: String = "-"
    const val VOLUME_PERCENTAGE: String = "%"
    const val VOLUME_MAX: String = "max"
    const val VOLUME_MIN: String = "min"

    /**
     * 进入手势控制
     */
    const val COMMAND_HAND_ENTER: String = "hand_enter"

    /**
     * 退出手势控制
     */
    const val COMMAND_HAND_EXIT: String = "hand_exit"

    /**
     * 进入猜拳
     */
    const val COMMAND_FINGER_GUEESS_ENTER: String = "finger_guess_enter"

    /**
     * 退出猜拳
     */
    const val COMMAND_FINGER_GUEESS_EXIT: String = "finger_guess_exit"

    /**
     * 人体识别
     */
    const val COMMAND_BODY_ENTER: String = "rhj.controller.body.enter"
    const val COMMAND_BODY_EXIT: String = "rhj.controller.body.exit"

    /**
     * 找人
     */
    const val COMMAND_SEARCH_PEOPLE: String = "rhj.controller.searchPeople"

    const val COMMAND_SAD: String = "motion_sad"
    const val COMMAND_HAPPY: String = "motion_happy"

    //    public static final String move = "rhj.controller.navigation";//?direction=#方向#&number=#数值#
    //    public static final String turn = "rhj.controller.turn";//?direction=#方向#&number=#数值#
    // public static final String COMMAND_BIRTHDAY = "rhj.controller.congraturation";
    const val COMMAND_OPEN_APP: String = "rhj.controller.open" //打开应用
    const val COMMAND_CLOSE_APP: String = "rhj.controller.close" //打开应用


    const val COMMAND_OPEN_WEATHER: String = "rhj.controller.openweather" //打开天气
    const val COMMAND_OPEN_THINGS: String = "rhj.controller.openthings" //打开事件倒计时
    const val COMMAND_OPEN_STOCK: String = "rhj.controller.openstock" //打开股票
    const val COMMAND_OPEN_FANS: String = "rhj.controller.openmyFans" //打开我的粉丝
    const val COMMAND_OPEN_INFORMATION: String = "rhj.controller.openinformation" //打开实时资讯
    const val COMMAND_OPEN_TIME: String = "rhj.controller.opentime" //打开时间
    const val COMMAND_OPEN_MESSAGE: String = "rhj.controller.openmessage" //打开消息提醒
    const val COMMAND_OPEN_BOT: String = "rhj.controller.openBot" //机器人模式
    const val COMMAND_OPEN_SLEEPSTATE: String = "rhj.controller.openSleep" //睡眠状态
    const val COMMAND_TAKE_PHOTO: String = "rhj.controller.takephoto" //拍照
    const val COMMAND_OPEN_FOLLOW_ME: String = "rhj.controller.followme" //人体跟踪

    const val COMMAND_CLOSE_SPEECH_AUDIO: String = "close_speech_audio" //关闭思必驰正在播放的一切声音
    const val COMMAND_CLOSE_SPEECH_AUDIO_AND_LISTENING: String =
        "close_speech_audio_and_listen" //关闭思必驰正在播放的一切声音

    const val COMMAND_SPEECH_SPLIT: String = "_===_"
    const val EXTRA_SPEECH_ALARM: String = "speech_alarm"
    const val EXTRA_ALARM: String = "alarm"
    const val SHUT_DOWN_AUDIO_SERVICE: String = "shut_down_audio_service"
    const val START_ALARM_ACTION: String = "start_alarm_action"
    const val STOP_ALARM_ACTION: String = "stop_alarm_action"
}
