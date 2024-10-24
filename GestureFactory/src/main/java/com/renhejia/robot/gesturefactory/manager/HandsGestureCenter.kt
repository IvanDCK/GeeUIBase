package com.renhejia.robot.gesturefactory.manager

import com.renhejia.robot.commandlib.parser.antennalight.AntennaLight
import com.renhejia.robot.commandlib.parser.antennamotion.AntennaMotion
import com.renhejia.robot.commandlib.parser.face.Face
import com.renhejia.robot.commandlib.parser.motion.Motion
import com.renhejia.robot.commandlib.parser.sound.Sound
import com.renhejia.robot.gesturefactory.parser.GestureData
import java.util.Random

/**
 * 手势识别的
 */
object HandsGestureCenter {
    val okGesture: GestureData
        /**
         * 比ok的手势
         * 0
         *
         * @retur
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0130")
            gestureData.footAction = Motion(17)
            gestureData.interval = 5000L
            return gestureData
        }


    /**
     * 第一次进入的表情
     * 0
     *
     * @retur
     */
    fun firstEnter(): GestureData {
        val gestureData = GestureData()
        gestureData.expression = Face("h0187")
        gestureData.footAction = Motion(17)
        gestureData.interval = 2000L
        return gestureData
    }

    val zanGesture: GestureData
        /**
         * 比赞的手势
         * 1
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0117")
            gestureData.footAction = Motion(
                getRandomMotion(intArrayOf(15, 16, 18, 25, 26, 27))
            )
            gestureData.interval = 4000L
            return gestureData
        }

    val fistGesture: GestureData
        /**
         * 比拳头的手势
         * 2
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0121")
            gestureData.footAction = Motion(
                null,
                1,
                2
            )
            gestureData.interval = 8000L
            return gestureData
        }


    val yeahGesture: GestureData
        /**
         * 比yeah和剪刀的手势
         * 3
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0131")
            val motion =
                Motion()
            motion.number = 64
            motion.speed = 1
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.interval = 7000L
            return gestureData
        }

    val gunGesture: GestureData
        /**
         * 比枪的手势
         * 5
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0133")
            val motion =
                Motion()
            motion.speed = 2
            motion.number = 2
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }

    internal val buGesture: GestureData
        /**
         * 比布的手势
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face(
                getRandomString(
                    arrayOf(
                        "h0027",
                        "h0037",
                        "h0038"
                    )
                )
            )
            gestureData.footAction = Motion(
                getRandomMotion(intArrayOf(15, 16, 18, 25, 26, 27))
            )
            gestureData.interval = 8000L
            return gestureData
        }


    val threeGesture: GestureData
        /**
         * 比数字三的手势
         * 6
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0123")
            val motion =
                Motion()
            motion.number = 63
            motion.speed = 5
            gestureData.footAction = motion
            gestureData.earAction = AntennaMotion(3)
            gestureData.antennalight = AntennaLight("on", 7)
            gestureData.interval = 12000L
            return gestureData
        }

    val fourGesture: GestureData
        /**
         * 比数字四的手势
         * 7
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0127")
            gestureData.footAction = Motion(
                getRandomMotion(intArrayOf(15, 16, 18, 25, 26, 27))
            )
            gestureData.earAction = AntennaMotion(1)
            gestureData.interval = 7000L
            return gestureData
        }

    val sixGesture: GestureData
        /**
         * 比数字六的手势
         * 8
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0115")
            val motion =
                Motion()
            motion.number = 65
            motion.stepNum = 3
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }

    val upGesture: GestureData
        /**
         * 比上的手势
         * 9.1
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0120")
            val motion =
                Motion()
            motion.number = 64
            motion.stepNum = 2
            motion.speed = 2
            gestureData.footAction = motion
            gestureData.earAction = AntennaMotion(3)
            gestureData.antennalight = AntennaLight("on", 7)
            gestureData.interval = 11000L
            return gestureData
        }

    val downGesture: GestureData
        /**
         * 比下的手势
         * 9.2
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0124")
            val motion =
                Motion()
            motion.number = 45
            motion.speed = 1
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }

    val leftGesture: GestureData
        /**
         * 比左边的手势
         * 9.3
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h00125")
            val motion =
                Motion()
            motion.number = 5
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }

    val rightGesture: GestureData
        /**
         * 比右边的手势
         * 9.4
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h00126")
            val motion =
                Motion()
            motion.number = 6
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }

    val loveGesture: GestureData
        /**
         * 比爱意的手势
         * 10
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0118")
            val motion =
                Motion()
            motion.number = 17
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }

    val rockGesture: GestureData
        /**
         * 比摇滚的手势
         * 11
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0128")
            val motion =
                Motion()
            motion.number = 17
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.interval = 9000L
            return gestureData
        }

    val handHeartGesture: GestureData
        /**
         * 比心
         * 12
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0116")
            val motion =
                Motion()
            motion.number = 13
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }
    val shuZi1Gesture: GestureData
        /**
         * 数字1
         * 13
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0311")
            val motion =
                Motion()
            motion.number = 59
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }

    val shuZi5Gesture: GestureData
        /**
         * 数字1
         * 13
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0312")
            val motion =
                Motion()
            motion.number = 91
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 5000L
            return gestureData
        }
    val qiDaoGesture: GestureData
        /**
         * 祈祷
         * 14
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0313")
            val motion =
                Motion()
            motion.number = 17
            motion.stepNum = 3
            gestureData.footAction = motion
            gestureData.interval = 4000L
            return gestureData
        }

    val zuoBieGesture: GestureData
        /**
         * 作别
         * 12
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0309")
            val motion =
                Motion()
            motion.number = 0
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }


    val zuoYiGesture: GestureData
        /**
         * 作别
         * 12
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0316")
            val motion =
                Motion()
            motion.number = 0
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }
    val shuZi8Gesture: GestureData
        /**
         * 数字8
         * 23
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0305")
            val motion =
                Motion()
            motion.number = 121
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }
    val shuZi9Gesture: GestureData
        /**
         * 数字9
         * 24
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0304")
            val motion =
                Motion()
            motion.number = 59
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 9000L
            return gestureData
        }

    val shuZi7Gesture: GestureData
        /**
         * 数字7
         * 22
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0315")
            val motion =
                Motion()
            motion.number = 60
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }

    val dissGesture: GestureData
        /**
         * Diss
         * 12
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0314")
            val motion =
                Motion()
            motion.number = 63
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }

    internal val palmUpGesture: GestureData
        /**
         * 掌心向上
         * 12
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0314")
            val motion =
                Motion()
            motion.number = 13
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }

    val shuangShouHeart1Gesture: GestureData
        /**
         * 双手比心1
         * 19
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0308")
            val motion =
                Motion()
            motion.number = 63
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }


    val shuangShouHeart2Gesture: GestureData
        /**
         * 双手比心2
         * 20
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0306")
            val motion =
                Motion()
            motion.number = 63
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }
    val shuangShouHeart3Gesture: GestureData
        /**
         * 双手比心3
         * 21
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0307")
            val motion =
                Motion()
            motion.number = 63
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.interval = 6000L
            return gestureData
        }

    val increaseGesture: GestureData
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0129")
            val motion =
                Motion()
            motion.number = 63
            motion.stepNum = 3
            motion.speed = 2
            gestureData.footAction = motion
            gestureData.interval = 8000L
            return gestureData
        }


    val decreaseGesture: GestureData
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0119")
            val motion =
                Motion()
            motion.number = 64
            motion.stepNum = 3
            motion.speed = 4
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0098")
            gestureData.interval = 4000L
            return gestureData
        }

    private fun getRandomIndex(length: Int): Int {
        val r = Random()
        return r.nextInt(length - 1)
    }

    private fun getRandomString(group: Array<String>): String {
        val r = Random()
        return group[r.nextInt(group.size)]
    }

    private fun getRandomMotion(group: IntArray): Int {
        val r = Random()
        return group[r.nextInt(group.size)]
    }

    private val randomAntennaLight: AntennaLight
        get() {
            val r = Random()
            val antennaLight =
                AntennaLight("on", getRandomIndex(9))
            return antennaLight
        }
}
