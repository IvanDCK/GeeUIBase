package com.renhejia.robot.commandlib.parser.motion

import com.google.gson.annotations.SerializedName

class Motion {
    constructor(number: Int) {
        this.number = number
    }

    constructor(motion: String?, number: Int) {
        this.motion = motion
        this.number = number
    }

    constructor(motion: String?, number: Int, stepNum: Int) {
        this.motion = motion
        this.number = number
        this.stepNum = stepNum
    }

    constructor(number: Int, stepNum: Int, speed: Int) {
        this.number = number
        this.speed = speed
        this.stepNum = stepNum
    }

    constructor()

    var motion: String? = null
    /**
     * 发给MCU 的值
     */
    /**
     * 发给MCU 的值
     */
    /**
     * 发给MCU 的值
     */
    var number: Int = 0

    @SerializedName(value = "speed", alternate = ["delay"])
    var speed: Int = 0
    var desc: String? = null
    var id: Int = 0

    @SerializedName(value = "stepNum", alternate = ["step"])
    var stepNum: Int = 0

    fun showLog(): String {
        return " $number"
    }

    override fun toString(): String {
        return "{" +
                "motion:'" + motion + '\'' +
                ", number:" + number +
                ", speed:" + speed +
                ", desc:'" + desc + '\'' +
                ", id:" + id +
                ", stepNum:" + stepNum +
                '}'
    }
}
