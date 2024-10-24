package com.renhejia.robot.commandlib.parser.face

class Face {
    var face: String
    private val filePrefix: String? = null
    private val times: String? = null
    var desc: String? = null
    var id: Int = 0
    var isIs24HourGesture: Boolean = false
        private set


    fun showLog(): String {
        return " $face"
    }

    override fun toString(): String {
        return "{" +
                "face:'" + face + '\'' +
                ", filePrefix:'" + filePrefix + '\'' +
                ", times:'" + times + '\'' +
                ", desc:'" + desc + '\'' +
                ", id:" + id +
                ", is24HourGesture:" + isIs24HourGesture +
                '}'
    }

    constructor(face: String) {
        this.face = face
    }

    constructor(face: String, desc: String?) {
        this.face = face
        this.desc = desc
    }


    fun setIs24HourGesture(is24HourGesture: Boolean) {
        this.isIs24HourGesture = is24HourGesture
    }
}
