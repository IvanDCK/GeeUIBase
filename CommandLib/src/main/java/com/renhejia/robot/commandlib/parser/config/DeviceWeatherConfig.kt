package com.renhejia.robot.commandlib.parser.config

/**
 * @author liujunbin
 */
class DeviceWeatherConfig {
    var display_switch: Int = 0
    var default_city_id: String? = null
    var default_city_name: String? = null
    var default_province_id: String? = null
    var default_province_name: String? = null
    var default_district_id: String? = null
    var default_district_name: String? = null

    override fun toString(): String {
        return "{" +
                "display_switch=" + display_switch +
                ", default_city_id='" + default_city_id + '\'' +
                ", default_city_name='" + default_city_name + '\'' +
                ", default_province_id='" + default_province_id + '\'' +
                ", default_province_name='" + default_province_name + '\'' +
                ", default_district_id='" + default_district_id + '\'' +
                ", default_district_name='" + default_district_name + '\'' +
                '}'
    }
}
