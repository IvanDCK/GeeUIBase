package com.renhejia.robot.commandlib.consts

/**
 * @author liujunbin
 */
object MCUCommandConsts {
    /**
     * ======================================== 命令类型 ========================================
     */
    /**
     * 2. 动作控制
     */
    const val COMMAND_TYPE_MOTION: String = "controlMotion"

    /**
     * 3. 天线控制
     */
    const val COMMAND_TYPE_ANTENNA_MOTION: String = "controlAntennaMotion"


    /**
     * 4. 天线光控制
     */
    const val COMMAND_TYPE_ANTENNA_LIGHT: String = "controlAntennaLight"


    //
    //
    //    /**
    //     *  5. 表情
    //     */
    //    public static final String COMMAND_TYPE_FACE = "controlFace";
    //
    //
    //    /**
    //     *  6. 声音控制
    //     */
    //    public static final String COMMAND_TYPE_SOUND = "controlSound";
    //
    //    /**
    //     *  7.人脸特征提取完成
    //     */
    //    public static final  String COMMAND_TYPE_ADD_FACE_FEATURE = "addFaceFeature";
    //
    //    /**
    //     * 8. 更新wifi配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_WIFI_CONFIG = "updateWifiConfig";
    //
    //    /**
    //     * 9. 更新ble配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_BLE_CONFIG = "updateBleConfig";
    //
    //    /**
    //     * 10. 更新显示模式配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_SHOW_MODE_CONFIG = "updateShowModeConfig";
    //
    //    /**
    //     * 11. 更新睡眠模式配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_SLEEP_MODE_CONFIG = "updateSleepModeConfig";
    //
    //    /**
    //     * 12/25. 更新唤醒配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_AWAKE_CONFIG = "updateAwakeConfig";
    //
    //    /**
    //     * 13. 更新通用配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_GENERAL_CONFIG = "updateGeneralConfig";
    //
    //    /**
    //     * 14. 更新日期配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_DATE_CONFIG = "updateDateConfig";
    //
    //    /**
    //     * 15. OTA升级配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_OTA_CONFIG = "updateOtaConfig";
    //
    //    /**
    //     * 16. OTA升级配置
    //     */
    //    public final static String COMMAND_TYPE_OTA_UPGRADE = "otaUpgrade";
    //
    //    /**
    //     * 17. 重置机器
    //     */
    //    public static final  String COMMAND_TYPE_RESET_DEVICE_INFO = "resetDeviceInfo";
    //
    //    /**
    //     * 19. 控制音量
    //     */
    //    public static final  String COMMAND_TYPE_CONTROL_SOUND_VOLUME = "controlSoundVolume";
    //
    //
    //    /**
    //     * 20. 演示模式显示切换
    //     */
    //    public static final  String COMMAND_TYPE_CONTROL_DISPLAY_MODE = "controlDisplayMode";
    //
    //    /**
    //     * 21. 演示模式自动动作
    //     */
    //    public static final  String COMMAND_TYPE_CONTROL_AUTO_MODE = "controlAutoMode";
    //    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_FOLLOW = "follow";
    //    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_EXT_FOLLOW = "exitFollow";
    //    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_RANDOM = "random";
    //
    //    /**
    //     * 22. 演示模式自动动作
    //     * (TODO 暂未使用)
    //     */
    //    public static final  String COMMAND_TYPE_CONTROL_UPDATE_GESTURE = "updateGesture";
    //
    //    /**
    //     * 23. 闹钟信息
    //     */
    //    public static final  String COMMAND_TYPE_UPDATE_CLOCK_DATA = "updateClockData";
    //
    //    /**
    //     * 24. 更新粉丝配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_FANS_CONFIG = "updateFansConfig";
    //
    //    /**
    //     * 26. 更换显示模块
    //     */
    //    public final static String COMMAND_TYPE_CHANGE_SHOW_MODULE = "changeShowModule";
    //
    //    /**
    //     * 27. 更新事件倒计时
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_EVENT_DATA = "updateEventData";
    //
    //    /**
    //     * 27. 开始绑定米家
    //     */
    //    public final static String COMMAND_TYPE_START_BIND_MIJIA= "startBindMijia";
    /**
     * 电源控制
     */
    const val COMMAND_TYPE_POWER_CONTROL: String = "powerControl"

    /**
     * 重启MCU
     */
    const val COMMAND_TYPE_RESET_MCU: String = "resetMcu"

    /**
     * 控制陀螺仪
     */
    const val COMMAND_TYPE_GYROSCOPE: String = "controllGyroscope"

    /**
     * 启动陀螺仪
     */
    const val COMMAND_TYPE_START_GYROSCOPE: String = "start_gyroscope"

    /**
     * 关闭陀螺仪
     */
    const val COMMAND_TYPE_STOP_GYROSCOPE: String = "stop_gyroscope"

    /**
     * 天线光控制
     */
    const val COMMAND_TYPE_ANTENNA_LIGHT_VALUE_ON: String = "on"
    const val COMMAND_TYPE_ANTENNA_LIGHT_VALUE_OFF: String = "off"

    /**
     * Video call
     */
    const val COMMAND_TYPE_TRTC: String = "trtc"
    const val COMMAND_TYPE_EXIT_TRTC: String = "exitTrtc"

    const val COMMAND_TYPE_UPDATE_WAKEUP_CONFIG: String = "updateAwakeConfig"

    const val COMMAND_TYPE_TRTC_MONITOR: String = "trtcMonitor"
    const val COMMAND_TYPE_EXIT_TRTC_MONITOR: String = "exitTrtcMonitor"

    const val COMMAND_TYPE_TRTC_TRANSFORM: String = "trtcTransform"
    const val COMMAND_TYPE_EXIT_TRTC_TRANSFORM: String = "exitTrtcTransform"


    /**
     * 天线光控制
     */
    const val COMMAND_TYPE_OPEN_MCU: String = "open_mcu"

    const val COMMAND_TYPE_CLOSE_MCU: String = "close_mcu"

    /**
     * 进入工厂模式
     */
    const val COMMAND_TYPE_ENTER_FACTORY: String = "enter_factory"

    /**
     * 退出工厂模式
     */
    const val COMMAND_TYPE_EXIT_FACTORY: String = "exit_factory"

    /**
     *
     */
    const val COMMAND_VALUE_ANTENNA_MOTION: String = "turn"
    const val COMMAND_VALUE_ANTENNA_MOTION_TURN: String = "turn"
    const val COMMAND_VALUE_ANTENNA_MOTION_MTURN: String = "mturn"
    const val COMMAND_VALUE_ANTENNA_MOTION_STURN: String = "sturn"
    const val COMMAND_VALUE_ANTENNA_MOTION_SETSTRAIGHT: String = "setStraight"


    /**
     *
     */
    const val COMMAND_VALUE_ANTENNA_MOTION_DIY: String = "diy"


    /**
     * ======================================== 声音类型 ================ start ========================
     */
    /**
     * 失落
     */
    const val COMMAND_VALUE_SOUND_LOSE: String = "lose"

    /**
     * 生气
     */
    const val COMMAND_VALUE_SOUND_ANGRY: String = "angry"

    /**
     * 搞怪
     */
    const val COMMAND_VALUE_SOUND_FUNNY: String = "funny"

    /**
     * 愤怒
     */
    const val COMMAND_VALUE_SOUND_ANGER: String = "anger"

    /**
     * 哭泣
     */
    const val COMMAND_VALUE_SOUND_CRY: String = "cry"

    /**
     * 撒娇
     */
    const val COMMAND_VALUE_SOUND_SPOILED: String = "spoiledChild"

    /**
     * 开心
     */
    const val COMMAND_VALUE_SOUND_HAPPY: String = "happy"

    /**
     * 苦笑
     */
    const val COMMAND_VALUE_SOUND_WRY_SMILE: String = "wrySmile"

    /**
     * 伤心
     */
    const val COMMAND_VALUE_SOUND_SAD: String = "sad"


    const val COMMAND_VALUE_SOUND_AVOIDANCE: String = "avoidance"
    const val COMMAND_VALUE_SOUND_CLICK: String = "click"
    const val COMMAND_VALUE_SOUND_MISTAKE: String = "mistake"
    const val COMMAND_VALUE_SOUND_FINISH: String = "finish"
    const val COMMAND_VALUE_SOUND_FIND_PEOPLE: String = "findPerson"
    const val COMMAND_VALUE_SOUND_CLOCK: String = "clock"
    const val COMMAND_VALUE_SOUND_SHUT_DOWN: String = "shutdown"
    const val COMMAND_VALUE_SOUND_STARTUP: String = "startUp"
    const val COMMAND_VALUE_SOUND_LOW_POWER: String = "lowPower"
    const val COMMAND_VALUE_SOUND_CHARGE: String = "charge"
    const val COMMAND_VALUE_SOUND_MAINTOFACE: String = "mainToFace"
    const val COMMAND_VALUE_SOUND_DIZZINESS: String = "dizziness"
    const val COMMAND_VALUE_SOUND_WAKE: String = "wake"
    const val COMMAND_VALUE_SOUND_SLEEP: String = "sleep"
    const val COMMAND_VALUE_SOUND_PANT: String = "pant"
    const val COMMAND_VALUE_SOUND_TIRED: String = "tired"
    const val COMMAND_VALUE_SOUND_FATIGUE: String = "fatigue"
    const val COMMAND_VALUE_SOUND_SHY: String = "shy"
    const val COMMAND_VALUE_SOUND_SURPRISE: String = "surprise"
    const val COMMAND_VALUE_SOUND_FEAR: String = "fear"
    const val COMMAND_VALUE_SOUND_PANIC: String = "panic"
    const val COMMAND_VALUE_SOUND_CONFUSE: String = "confuse"
    const val COMMAND_VALUE_SOUND_DISGUSTED: String = "disgusted"
    const val COMMAND_VALUE_SOUND_HATE: String = "hate"
    const val COMMAND_VALUE_SOUND_COMFORTABLE: String = "comfortable"
    const val COMMAND_VALUE_SOUND_SNEAKPEEK: String = "sneakPeek"
    const val COMMAND_VALUE_SOUND_RESPOND: String = "respond"


    /**
     * ======================================== 声音类型 ================ end ========================
     */
    /**
     * ======================================== 音效类型 ================ start ========================
     */
    /**
     * 生日
     */
    const val COMMAND_VALUE_SOUND_BIRTHDAY: String = "birthday"

    const val COMMAND_AUDIO_TURN_AROUND: String = "audio_turn_around"


    /**
     * ======================================== 音效类型 ================ end ========================
     */
    /**
     * ======================================== 表情类型 ========================================
     */
    /**
     * 苦笑
     */
    const val COMMAND_VALUE_FACE_WRY_SMILE: String = "wrySmile"

    /**
     * 生气
     */
    const val COMMAND_VALUE_FACE_ANGRY: String = "angry"

    /**
     * 伤心
     */
    const val COMMAND_VALUE_FACE_SAD: String = "sad"

    /**
     * 愤怒
     */
    const val COMMAND_VALUE_FACE_ANGER: String = "anger"

    /**
     * 无聊
     */
    const val COMMAND_VALUE_FACE_BORED: String = "bored"

    /**
     * 兴奋
     */
    const val COMMAND_VALUE_FACE_EXCITING: String = "exciting"

    /**
     * 哭泣
     */
    const val COMMAND_VALUE_FACE_CRY: String = "cry"

    /**
     * 失落
     */
    const val COMMAND_VALUE_FACE_LOSE: String = "lose"

    /**
     * 高兴
     */
    const val COMMAND_VALUE_FACE_HAPPY: String = "happy"

    /**
     * 高兴
     */
    const val COMMAND_VALUE_FACE_STAND: String = "stand_yellow"

    /**
     * 生日
     */
    const val COMMAND_VALUE_BIRTHDAY: String = "HappyBirthday_Loop"

    /**
     * 生日
     */
    const val COMMAND_VALUE_BIRTHDAY2: String = "birthday2"

    const val COMMAND_VALUE_COMMONWINK: String = "commonWink"
    const val COMMAND_VALUE_BIG_SMALL_EYE: String = "BigSmallEye"
    const val COMMAND_VALUE_SINGLE_BLINK: String = "singleBlink"
    const val COMMAND_VALUE_PEEP: String = "peep"
    const val COMMAND_VALUE_SQUINT: String = "squint"
    const val COMMAND_VALUE_SINGLE_EXPECT: String = "expect"
    const val COMMAND_VALUE_GLANCE_LEFT_RIGHT: String = "glanceLeftRight"
    const val COMMAND_VALUE_SQUINT_RIGHT_UP: String = "squintRightUp"
    const val COMMAND_VALUE_SQUINT_LEFT_UP: String = "squintLfetUp"
    const val COMMAND_VALUE_SQUINT_RIGHT_DOWN: String = "squintRightDown"
    const val COMMAND_VALUE_SQUINT_LEFT_DOWN: String = "squintLeftDown"
    const val COMMAND_VALUE_SQUINT_LOOK_DOWN: String = "lookDown"
    const val COMMAND_VALUE_CONFUSE: String = "confuse"
    const val COMMAND_VALUE_SHAKE_HEAD: String = "shakeHead"

    const val COMMAND_VALUE_THINK: String = "think"
    const val COMMAND_VALUE_BORED: String = "bored"
    const val COMMAND_VALUE_LISTEN_LEFT: String = "listenLeft"
    const val COMMAND_VALUE_LISTEN_RIGHT: String = "listenRight"
    const val COMMAND_VALUE_LISTEN_HAPPY: String = "happy"
    const val COMMAND_VALUE_BIG_LAUGH: String = "bigLaugh"
    const val COMMAND_VALUE_EXCITING: String = "exciting"
    const val COMMAND_VALUE_LOVE: String = "h0027"
    const val COMMAND_VALUE_WRONGED: String = "wronged"
    const val COMMAND_VALUE_FROWN: String = "frown"
    const val COMMAND_VALUE_LOSE: String = "lose"
    const val COMMAND_VALUE_SAD: String = "sad"
    const val COMMAND_VALUE_CRY: String = "cry"
    const val COMMAND_VALUE_ASHAMED: String = "ashamed"
    const val COMMAND_VALUE_UNWEL: String = "unwell"

    const val COMMAND_VALUE_PAIN: String = "pain"
    const val COMMAND_VALUE_SORRY: String = "sorry"
    const val COMMAND_VALUE_FURIOUS: String = "furious"
    const val COMMAND_VALUE_RESIST: String = "resist"
    const val COMMAND_VALUE_SHUT_UP: String = "shutUp"
    const val COMMAND_VALUE_ENVY: String = "envy"
    const val COMMAND_VALUE_ARROGNT: String = "arrogant"
    const val COMMAND_VALUE_ANGER: String = "anger"
    const val COMMAND_VALUE_SUPRISE: String = "surprise"
    const val COMMAND_VALUE_BARBIQ: String = "barbieQ"
    const val COMMAND_VALUE_SUSPECT: String = "suspect"
    const val COMMAND_VALUE_FEAR: String = "fear"
    const val COMMAND_VALUE_PANTING: String = "panting"
    const val COMMAND_VALUE_YAWN: String = "yawn"
    const val COMMAND_VALUE_WEAK_UP: String = "wakeUp"
    const val COMMAND_VALUE_SLEEP: String = "sleep"
    const val COMMAND_VALUE_SLEEP_OPEN_EYE: String = "sleepOpenEye"
    const val COMMAND_VALUE_DIZZINESS: String = "dizziness"
    const val COMMAND_VALUE_TREMBINE: String = "trembline"
    const val COMMAND_VALUE_CLOCK: String = "clock"
    const val COMMAND_VALUE_PHOTO: String = "photo"
    const val COMMAND_VALUE_WUNAI: String = "haveNoChoice"


    /**
     * ======================================== 动作类型 ========================================
     */
    /**
     * 向前
     */
    const val COMMAND_VALUE_MOTION_FORWARD: String = "forward"

    /**
     * 向后
     */
    const val COMMAND_VALUE_MOTION_BACKEND: String = "backend"

    /**
     * 向左
     */
    const val COMMAND_VALUE_MOTION_LEFT: String = "left"

    /**
     * 向右
     */
    const val COMMAND_VALUE_MOTION_RIGHT: String = "right"

    /**
     * 向左转
     */
    const val COMMAND_VALUE_MOTION_LEFT_ROUND: String = "leftRound"

    /**
     * 向右转
     */
    const val COMMAND_VALUE_MOTION_RIGHT_ROUND: String = "rightRound"

    /**
     * 回正
     */
    const val COMMAND_VALUE_MOTION_SET_STRAIGHT: String = "setStraight"

    /**
     * 转圈
     */
    const val COMMAND_VALUE_MOTION_TURN_ROUND: String = "turnRound"

    /**
     * 撒娇
     */
    const val COMMAND_VALUE_MOTION_PETTISH: String = "pettish"

    /**
     * 生气
     */
    const val COMMAND_VALUE_MOTION_ANGRY: String = "angry"

    /**
     * 奔跑
     */
    const val COMMAND_VALUE_MOTION_RUN: String = "run"

    /**
     * 奔跑
     */
    const val COMMAND_VALUE_MOTION_CHEERS: String = "cheers"

    /**
     * 疲惫
     */
    const val COMMAND_VALUE_MOTION_TRIED: String = "tried"

    /**
     * 抖腿
     */
    const val COMMAND_VALUE_MOTION_SHAKE_LEG: String = "shakeLeg"

    /**
     * ======================================== 动作类型 ========================================
     */
    /**
     * 天线灯开
     */
    const val COMMAND_VALUE_ANTENNA_LIGHT_ON: String = "on"

    /**
     * 天线灯关
     */
    const val COMMAND_VALUE_ANTENNA_LIGHT_OFF: String = "off"

    /**
     * 天线闪烁
     */
    const val COMMAND_VALUE_ANTENNA_LIGHT_TWINKLE: String = "twinkle"

    /**
     * 天线闪烁
     */
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED: Int = 1
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN: Int = 2
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE: Int = 3
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_ORANGE: Int = 4
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_WHITE: Int = 5
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_YELLOW: Int = 6
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_PURPLE: Int = 7
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_CYAN: Int = 8
    const val COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK: Int = 9


    /**
     * 天线旋转
     */
    const val COMMAND_VALUE_ANTENNA_MOTION_3: Int = 3
}
