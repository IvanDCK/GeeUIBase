package com.renhejia.robot.commandlib.consts

object SensorConsts {
    const val GEEUI_SENSOR_TYPE_LIGHT: String = "light"
    const val GEEUI_SENSOR_TYPE_TOUCH: String = "touch"
    const val GEEUI_SENSOR_TYPE_CLIFF: String = "cliff"
    const val GEEUI_SENSOR_TYPE_SUSPEND: String = "suspend"
    const val GEEUI_SENSOR_TYPE_WAGGLE: String = "waggle"
    const val GEEUI_SENSOR_TYPE_DOWN: String = "down"

    //红外灯，上桩用
    const val GEEUI_SENSOR_TYPE_IR: String = "IR"

    //红外，测距用
    const val GEEUI_SENSOR_TYPE_TOF: String = "tof"
    const val GEEUI_SENSOR_TYPE_WRITE_RES: String = "write_res"

    const val GEEUI_SENSOR_TYPE_TOUCH_TAP: Int = 1
    const val GEEUI_SENSOR_TYPE_TOUCH_DOUBLE_TAP: Int = 2
    const val GEEUI_SENSOR_TYPE_TOUCH_LONG_PRESS: Int = 3
}
