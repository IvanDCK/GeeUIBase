package com.renhejia.robot.commandlib.consts

object RobotRemoteConsts {
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

    /**
     * 5. 表情
     */
    const val COMMAND_TYPE_FACE: String = "controlFace"

    /**
     * 5. 表情
     */
    const val COMMAND_TYPE_SHOW_TIME: String = "showTIme"

    /**
     * 6. 声音控制
     */
    const val COMMAND_TYPE_SOUND: String = "controlSound"

    /**
     * 7.人脸特征提取完成
     */
    const val COMMAND_TYPE_ADD_FACE_FEATURE: String = "addFaceFeature"

    /**
     * 8. 更新wifi配置
     */
    const val COMMAND_TYPE_UPDATE_WIFI_CONFIG: String = "updateWifiConfig"

    /**
     * 9. 更新ble配置
     */
    const val COMMAND_TYPE_UPDATE_BLE_CONFIG: String = "updateBleConfig"

    /**
     * 10. 更新显示模式配置
     */
    const val COMMAND_TYPE_UPDATE_SHOW_MODE_CONFIG: String = "updateShowModeConfig"

    /**
     * 11. 更新睡眠模式配置
     */
    const val COMMAND_TYPE_UPDATE_SLEEP_MODE_CONFIG: String = "updateSleepModeConfig"

    /**
     * 12/25. 更新唤醒配置
     */
    const val COMMAND_TYPE_UPDATE_AWAKE_CONFIG: String = "updateAwakeConfig"

    /**
     * 13. 更新通用配置
     */
    const val COMMAND_TYPE_UPDATE_GENERAL_CONFIG: String = "updateGeneralConfig"

    /**
     * 14. 更新日期配置
     */
    const val COMMAND_TYPE_UPDATE_DATE_CONFIG: String = "updateDateConfig"

    /**
     * 15. OTA升级配置
     */
    const val COMMAND_TYPE_UPDATE_OTA_CONFIG: String = "updateOtaConfig"

    /**
     * 16. OTA升级配置
     */
    const val COMMAND_TYPE_OTA_UPGRADE: String = "otaUpgrade"

    /**
     * 17. 重置机器
     */
    const val COMMAND_TYPE_RESET_DEVICE_INFO: String = "resetDeviceInfo"

    /**
     * 19. 控制音量
     */
    const val COMMAND_TYPE_CONTROL_SOUND_VOLUME: String = "controlSoundVolume"


    /**
     * 20. 演示模式显示切换
     */
    const val COMMAND_TYPE_CONTROL_DISPLAY_MODE: String = "controlDisplayMode"

    /**
     * 21. 演示模式自动动作
     */
    const val COMMAND_TYPE_CONTROL_AUTO_MODE: String = "controlAutoMode"
    const val COMMAND_VALUE_CONTROL_AUTO_MODE_FOLLOW: String = "follow"
    const val COMMAND_VALUE_CONTROL_AUTO_MODE_EXT_FOLLOW: String = "exitFollow"
    const val COMMAND_VALUE_CONTROL_AUTO_MODE_RANDOM: String = "random"

    /**
     * 22. 演示模式自动动作
     * (TODO 暂未使用)
     */
    const val COMMAND_TYPE_CONTROL_UPDATE_GESTURE: String = "updateGesture"

    /**
     * 23. 闹钟信息
     */
    const val COMMAND_TYPE_UPDATE_CLOCK_DATA: String = "updateClockData"

    /**
     * 24. 更新粉丝配置
     */
    const val COMMAND_TYPE_UPDATE_FANS_CONFIG: String = "updateFansConfig"

    /**
     * 26. 更换显示模块
     */
    const val COMMAND_TYPE_CHANGE_SHOW_MODULE: String = "changeShowModule"

    /**
     * 27. 更新事件倒计时
     */
    const val COMMAND_TYPE_UPDATE_EVENT_DATA: String = "updateEventData"

    /**
     * 27. 开始绑定米家
     */
    const val COMMAND_TYPE_START_BIND_MIJIA: String = "startBindMijia"

    /**
     * 28. 更新电池模式
     */
    const val COMMAND_TYPE_UPDATE_BATTERY_MODE_CONFIG: String = "updateBatteryModeConfig"

    /**
     * 28. 更新亮度
     */
    const val COMMAND_TYPE_CONTROL_BRIGHTNESS: String = "controlBrightnessVolume"

    /**
     * 28. 重启
     */
    const val COMMAND_TYPE_REBOOT: String = "reboot"

    /**
     * 28. 关机
     */
    const val COMMAND_TYPE_SHUTDOWN: String = "shutdown"

    /**
     * 关闭舵机引擎
     */
    const val COMMAND_TYPE_SHUTDOWN_STEERING_ENGINE: String = "ShutDownSteeringEngine"

    /**
     * 99. 关闭应用
     */
    const val COMMAND_TYPE_CLOSE_APP: String = "closeApp"

    const val COMMAND_VALUE_CLOSE_REMINDER: String = "closeReminder"

    /**
     * 99. 关闭目标应用
     */
    const val COMMAND_TYPE_CLOSE_TARGET_APP: String = "close_target_app"


    /**
     * OTA升级
     */
    const val COMMAND_TYPE_OTA: String = "otaUpgrade"

    /**
     *
     */
    const val COMMAND_SET_APP_MODE: String = "set_app_mode"

    /**
     *
     */
    const val COMMAND_SHOW_TEXT: String = "show_text"

    /**
     *
     */
    const val COMMAND_HIDE_TEXT: String = "hide_text"

    /**
     *
     */
    const val COMMAND_SHOW_CHARGING: String = "show_charging"

    /**
     *
     */
    const val COMMAND_HIDE_CHARGING: String = "hide_charging"

    /**
     *
     */
    const val COMMAND_SHOW_ALL: String = "show_all"

    /**
     *
     */
    const val COMMAND_HIDE_ALL: String = "hide_all"


    /**
     * 锁定全局状态栏文字控制
     */
    const val COMMAND_LOCK_CONTROL_TEXT: String = "lock_control_text"

    /**
     * 全局状态栏文字
     */
    const val COMMAND_LOCK_CONTROL_FULL_TEXT: String = "lock_control_full_text"

    /**
     * 全局状态栏文字
     */
    const val COMMAND_LOCK_CONTROL_SPLIT: String = "--"

    /**
     * 全局状态栏文字
     */
    const val COMMAND_LOCK_CONTROL_NULL: String = "null"

    /**
     * 开启音效
     */
    const val COMMAND_OPEN_AE: String = "ltp123"

    /**
     * 关闭音效
     */
    const val COMMAND_CLOSE_AE: String = "ltp456"

    /**
     *
     */
    const val COMMAND_SHOW_CHARGING_ICON: String = "showChargeIcon"

    /**
     *
     */
    const val COMMAND_HIDE_CHARGING_ICON: String = "hideChargeIcon"

    /**
     * 拍照
     */
    const val COMMAND_CONTROL_TAKE_PHOTO: String = "controlTakePhoto"

    /**
     * 打开开发者选项
     */
    const val COMMAND_CONTROL_OPEN_DEVELOP_OPTIONS: String = "openDevelopOptions"

    /**
     * 关闭开发者选项
     */
    const val COMMAND_CONTROL_CLOSE_DEVELOP_OPTIONS: String = "closeDevelopOptions"

    /**
     * 应用中心安装更新
     */
    const val COMMAND_TYPE_UPDATE_DEVICE_APP_MODE: String = "updateDeviceAppMode"

    /**
     * 陀螺仪初始化
     */
    const val COMMAND_TYPE_CONTROL_GYROSCOPE: String = "controllGyroscope"

    /**
     * 更新提醒，喝水，坐姿
     */
    const val COMMAND_TYPE_UPDATE_REMIND_INFO_DATA: String = "updateRemindInfoData"

    /**
     * 更新番茄钟
     */
    const val COMMAND_TYPE_UPDATE_TOMATO_CLOCK: String = "updateTomatoClockConfig"

    /**
     * 更新冥想
     */
    const val COMMAND_TYPE_UPDATE_MEDITATION_CONFIG: String = "updateMeditationConfig"

    const val COMMAND_UPDATE_DEVICE_TIME_ZONE: String = "updateDeviceTimeZone"

    /**
     *
     */
    const val COMMAND_UPDATE_REAL_BATTERY: String = "updateRealBattery"

    /**
     *
     */
    const val COMMAND_UPDATE_AUTOMATIC_RECHARGE_CONFIG: String = "updateAutomaticRechargeConfig"


    //    /**
    //     * 更新wifi配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_WIFI_CONFIG = "updateWifiConfig";
    //
    //    /**
    //     * 更新ble配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_BLE_CONFIG = "updateBleConfig";
    //
    //    /**
    //     * 更新显示模式配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_SHOW_MODE_CONFIG = "updateShowModeConfig";
    //    /**
    //     * 绑定到米家
    //     */
    //    public final static String COMMAND_TYPE_BIND_MIIOT = "startBindMijia";
    //    /**
    //     * 更新睡眠模式配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_SLEEP_MODE_CONFIG = "updateSleepModeConfig";
    //
    //    /**
    //     * 更新睡眠模式配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_AWAKE_CONFIG = "updateAwakeConfig";
    //
    //    /**
    //     * 更新通用配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_GENERAL_CONFIG = "updateGeneralConfig";
    //
    //    /**
    //     * 更新日期配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_DATE_CONFIG = "updateDateConfig";
    /**
     * 更新日历配置
     */
    const val COMMAND_TYPE_UPDATE_CALENDAR_CONFIG: String = "updateCalendarConfig"

    //    /**
    //     * 更新粉丝配置
    //     */
    //    public final static String COMMAND_TYPE_UPDATE_FANS_CONFIG = "updateFansConfig";
    /**
     * 更新倒计时配置
     */
    const val COMMAND_TYPE_UPDATE_COUNT_DOWN_CONFIG: String = "updateCountDownConfig"

    /**
     * 更新股票事件信息
     */
    const val COMMAND_TYPE_UPDATE_STOCK_EVENT_DATA: String = "updateStockEventData"

    /**
     * 更新显示模式
     */
    const val COMMAND_TYPE_APP_DISPLAY_SWITCH_CONFIG: String = "updateDisplaySwitchConfig"

    /**
     * 更新显示模式 --天气页面
     */
    const val COMMAND_TYPE_UPDATE_WEATHER_CONFIG: String = "updateWeatherConfig"

    //    /**
    //     * 更换显示模块
    //     */
    //    public final static String COMMAND_TYPE_CHANGE_SHOW_MODULE = "changeShowModule";
    /**
     * 更换显示模块
     */
    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_EVENT: String = "event"

    /**
     * 更换显示模块
     */
    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_WEATHER: String = "weather"

    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_TIME: String = "time"

    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_FANS: String = "fans"

    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_MESSAGE: String = "message"

    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_NEWS: String = "news"

    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_COMMEMORATION: String = "commemoration"

    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_STOCK: String = "stock"

    const val COMMAND_VALUE_CHANGE_SHOW_MODULE_WORD: String = "word"

    const val COMMAND_VALUE_CHANGE_SLEEP: String = "sleep"

    const val COMMAND_VALUE_CHANGE_ROBOT: String = "robot"

    const val COMMAND_VALUE_CHANGE_CUSTOM: String = "custom"

    const val COMMAND_VALUE_CHANGE_LAMP: String = "lamp"

    //关闭应用的指令
    const val COMMAND_VALUE_CLOSE_APP: String = "closeApp"


    //
    //    /**
    //     * 闹钟信息
    //     */
    //    public static final  String COMMAND_TYPE_UPDATE_CLOCK_DATA = "updateClockData";
    /**
     * 悬空开始
     */
    const val COMMAND_TYPE_CONTROL_PRECIPICE_START_DATA: String = "controlStartPrecipice"

    /**
     * 悬空结束
     */
    const val COMMAND_TYPE_CONTROL_PRECIPICE_STOP_DATA: String = "controlStopPrecipice"

    /**
     * 倒下开始
     */
    const val COMMAND_TYPE_CONTROL_FALL_DOWN_START_DATA: String = "controlStartFallDown"

    /**
     * 倒下结束
     */
    const val COMMAND_TYPE_CONTROL_FALL_DOWN_STOP_DATA: String = "controlStopFallDown"

    /**
     * 单击
     */
    const val COMMAND_TYPE_CONTROL_TAP_DATA: String = "controlTap"

    /**
     * 双击
     */
    const val COMMAND_TYPE_CONTROL_DOUBLE_TAP_DATA: String = "controlDoubleTap"

    /**
     * 长按
     */
    const val COMMAND_TYPE_CONTROL_LONG_PRESS_DATA: String = "controlLongPressTap"

    /**
     * 防跌落，往后退
     */
    const val COMMAND_TYPE_CONTROL_FALL_BACKEND: String = "fallBackend"

    /**
     * 防跌落，往前走
     */
    const val COMMAND_TYPE_CONTROL_FALL_FORWARD: String = "fallForward"
    const val COMMAND_TYPE_CONTROL_FALL_LEFT: String = "fallLeft"
    const val COMMAND_TYPE_CONTROL_FALL_RIGHT: String = "fallRight"

    /**
     * 摇晃
     */
    const val COMMAND_TYPE_CONTROL_WAGGLE: String = "waggle"

    /**
     * 避障
     */
    const val COMMAND_TYPE_CONTROL_TOF: String = "tof"


    /**
     * 选择图片
     */
    const val COMMAND_TYPE_CONTROL_SEND_PIC: String = "controlSendPic"

    /**
     * 文字
     */
    const val COMMAND_TYPE_CONTROL_SEND_WORD: String = "controlSendWord"


    var ROBOT_UPDATE_VERSION_IS_READY: String = "latest"

    /**
     * 机器人模式状态切换
     */
    const val COMMAND_TYPE_CHANGE_MODE: String = "changeMode"

    const val COMMAND_VALUE_CHANGE_MODE_TRANSFORM: String = "transform"
    const val COMMAND_VALUE_CHANGE_MODE_REMINDER: String = "reminder"
    const val COMMAND_VALUE_CHANGE_MODE_SHOW: String = "show"
    const val COMMAND_VALUE_CHANGE_MODE_SLEEP: String = "sleep"
    const val COMMAND_VALUE_CHANGE_MODE_AUTO: String = "auto"
    const val COMMAND_VALUE_CHANGE_MODE_DEMO: String = "demo"
    const val COMMAND_VALUE_CHANGE_MODE_RESET: String = "reset" // 恢复
    const val COMMAND_VALUE_CHANGE_MODE_STATIC: String = "static" // 静止模式
    const val COMMAND_VALUE_CHANGE_MODE_ROBOT: String = "robot" // 机器人模式
    const val COMMAND_VALUE_CHANGE_MODE_SPEECH: String = "speech" // 思必驰
    const val COMMAND_VALUE_CHANGE_MODE_24HOUR: String = "24hour" // 24小时
    const val COMMAND_VALUE_CHANGE_MODE_HAND: String = "hand" // 手势识别
    const val COMMAND_VALUE_CHANGE_MODE_FACE: String = "face" // 人脸识别
    const val COMMAND_VALUE_CHANGE_MODE_BODY: String = "body" // 人体识别
    const val COMMAND_VALUE_CHANGE_MODE_TRTC_MONITOR: String = "trtc_monitor" //
    const val COMMAND_VALUE_CHANGE_MODE_TRTC_TRANSFORM: String = "trtc_transform" //
    const val COMMAND_VALUE_CHANGE_MODE_TAKE_PHOTO: String = "photo" // 拍照
    const val COMMAND_VALUE_CHANGE_MODE_SENSOR: String = "sensor" // 传感器
    const val COMMAND_VALUE_EXIT: String = "exit" // 思必驰
    const val COMMAND_VALUE_KILL_PROCESS: String = "killProcess"
    const val COMMAND_VALUE_GO_TO_SLEEP: String = "go_to_sleep"
    const val COMMAND_VALUE_ROBOT: String = "robot"
    const val COMMAND_VALUE_APP: String = "app"
    const val COMMAND_TYPE_ROBOT_STATUS: String = "robot_status"


    const val COMMAND_VALUE_CONTROL_DISPLAY_TIME: String = "time"
    const val COMMAND_VALUE_CONTROL_DISPLAY_WEATHER: String = "weather"
    const val COMMAND_VALUE_CONTROL_DISPLAY_COUNTDOWN: String = "countdown"
    const val COMMAND_VALUE_CONTROL_DISPLAY_FANS: String = "fans"
    const val COMMAND_VALUE_CONTROL_DISPLAY_SCHEDULE: String = "schedule"
    const val COMMAND_VALUE_CONTROL_DISPLAY_EMPTY: String = "empty"
    const val COMMAND_VALUE_CONTROL_DISPLAY_BLACK: String = "darkScreen"
    const val COMMAND_VALUE_CONTROL_DISPLAY_EXT_BLACK: String = "exitDarkScreen"

    const val LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_TIME: String = "display/time"
    const val LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_WEATHER: String = "display/weather"
    const val LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_COUNTDOWN: String = "display/countdown"
    const val LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_FANS: String = "display/fans"
    const val LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_SCHEDULE: String = "display/notice"
    const val LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_EMPTY: String = "display/empty"
    const val LOCAL_COMMAND_VALUE_IDENT_FACE_RESULT: String = "identFaceResult"


    /**
     * 打开工厂模式
     */
    const val COMMAND_TYPE_OPEN_FACTORY_MODE: String = "openFactoryMode"

    /**
     * 关闭工厂模式
     */
    const val COMMAND_TYPE_CLOSE_FACTORY_MODE: String = "closeFactoryMode"

    /**
     * 删除设备
     */
    const val COMMAND_VALUE_REMOVE_DEVICE: String = "removeDevice"

    /**
     * 开机充电
     */
    const val COMMAND_TYPE_POWER_ON_CHARGING: String = "power_on_charging"
}
