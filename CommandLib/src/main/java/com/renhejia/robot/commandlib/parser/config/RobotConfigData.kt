package com.renhejia.robot.commandlib.parser.config

import com.renhejia.robot.commandlib.parser.sleepmode.SleepModeConfig

data class RobotConfigData (
    var client_id: String? = null,
    var user_id: Int = 0,
    var upload_interval: Int = 0,
    var device_weather_config: DeviceWeatherConfig? = null,
    var device_calendar_config: DeviceCalendarConfig? = null,
    var device_ble_config: DeviceBleConfig? = null,
    var device_wifi_config: DeviceWifiConfig? = null,
    var device_sound_config: DeviceSoundConfig? = null,
    var device_brightness_config: DeviceBrightnessConfig? = null,
    var device_date_config: DeviceDateConfig? = null,
    var device_show_mode_config: DeviceShowModeConfig? = null,
    var sleep_mode_config: SleepModeConfig? = null,
    var device_general_config: DeviceGeneralConfig? = null,
    var device_awake_config: DeviceAwakeConfig? = null,
    var default_mode: String? = null
)
