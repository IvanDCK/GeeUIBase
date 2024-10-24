package com.renhejia.robot.commandlib.utils

import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.net.NetworkInterface
import java.net.SocketException

/**
 * @author liujunbin
 */
object SystemUtil {
    private var sysPropGet: Method? = null
    private var sysPropGetInt: Method? = null
    private var sysPropSet: Method? = null
    private const val SN = "ro.serialno"
    const val REGION_LANGUAGE: String = "persist.sys.region.language"
    const val MCU_VERSION: String = "persist.sys.mcu.version"
    const val HARD_CODE: String = "persist.sys.hardcode"
    const val DEVICE_SIGN: String = "persist.sys.device.sign"
    private const val ROBOT_STATUS = "persist.sys.robot.status"
    private const val ROBOT_STATUS_TRUE = "true"
    const val REGION_LANGUAGE_ZH: String = "zh"
    const val REGION_LANGUAGE_EN: String = "en"


    init {
        try {
            val S = Class.forName("android.os.SystemProperties")
            val M = S.methods
            for (m in M) {
                val n = m.name
                if (n == "get") {
                    sysPropGet = m
                } else if (n == "getInt") {
                    sysPropGetInt = m
                } else if (n == "set") {
                    sysPropSet = m
                }
            }
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }

    fun get(name: String?, default_value: String?): String? {
        try {
            return sysPropGet!!.invoke(null, name, default_value) as String
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        } catch (e: InvocationTargetException) {
            e.printStackTrace()
        }
        return default_value
    }

    fun set(name: String?, value: String?) {
        try {
            sysPropSet!!.invoke(null, name, value)
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        } catch (e: InvocationTargetException) {
            e.printStackTrace()
        }
    }

    val ltpSn: String?
        get() = get(SN, null)

    var hardCode: String?
        get() = get(HARD_CODE, null)
        set(hardCode) {
            set(HARD_CODE, hardCode)
        }

    var deviceSign: String?
        get() = get(DEVICE_SIGN, null)
        set(deviceSign) {
            set(DEVICE_SIGN, deviceSign)
        }


    val wlanMacAddress: String?
        //    public static String getLtpLastSn(){
        get() {
            try {
                val networkInterfaces =
                    NetworkInterface.getNetworkInterfaces()
                while (networkInterfaces.hasMoreElements()) {
                    val networkInterface =
                        networkInterfaces.nextElement()
                    if (networkInterface.name == "wlan0") {
                        val mac = StringBuilder()
                        val hardwareAddress = networkInterface.hardwareAddress
                        var hex =
                            Integer.toHexString(hardwareAddress[0].toInt() and 0xff)
                        if (hex.length == 1) {
                            mac.append('0')
                        }
                        mac.append(hex)
                        for (i in 1 until hardwareAddress.size) {
                            mac.append(':')
                            hex = Integer.toHexString(
                                hardwareAddress[i].toInt() and 0xff
                            )
                            if (hex.length == 1) {
                                mac.append('0')
                            }
                            mac.append(hex)
                        }
                        return mac.toString()
                    }
                }
            } catch (ex: SocketException) {
                ex.printStackTrace()
            }
            return null
        }

    val language: String?
        get() = get(REGION_LANGUAGE, null)

    val isChinese: Boolean
        get() = if (language == REGION_LANGUAGE_ZH) {
            true
        } else {
            false
        }
}
