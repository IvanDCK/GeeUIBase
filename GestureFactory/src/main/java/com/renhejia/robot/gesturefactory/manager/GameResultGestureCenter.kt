package com.renhejia.robot.gesturefactory.manager

import com.renhejia.robot.commandlib.consts.MCUCommandConsts
import com.renhejia.robot.commandlib.parser.antennalight.AntennaLight
import com.renhejia.robot.commandlib.parser.antennamotion.AntennaMotion
import com.renhejia.robot.commandlib.parser.face.Face
import com.renhejia.robot.commandlib.parser.motion.Motion
import com.renhejia.robot.commandlib.parser.sound.Sound
import com.renhejia.robot.gesturefactory.parser.GestureData
import java.util.Random

object GameResultGestureCenter {
    val drawGesture: ArrayList<GestureData>
        /**
         * 平局的表情
         *
         * @return
         */
        get() {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face(
                getRandomString(
                    arrayOf(
                        "h0003",
                        "h0052"
                    )
                )
            )
            val motion =
                Motion()
            motion.number = 28
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0008")
            gestureData.antennalight = randomAntennaLight
            gestureData.interval = 8000
            list.add(gestureData)
            return list
        }

    val noListDrawGesture: GestureData
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0201")
            val motion =
                Motion()
            motion.number = 18
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0008")
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 8000
            return gestureData
        }

    val moveLeftGesture: GestureData
        /**
         * 向左移动
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face("h0042"));
            val motion =
                Motion()
            motion.number = 5
            motion.stepNum = 4
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0008")
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000
            return gestureData
        }

    val gunMoveLeftGesture: GestureData
        /**
         * 向左移动
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face("h0298"));
            val motion =
                Motion()
            motion.number = 5
            motion.stepNum = 4
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0008")
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000
            return gestureData
        }

    val moveRightGesture: GestureData
        /**
         * 向右移动
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face("h0044"));
            val motion =
                Motion()
            motion.number = 6
            motion.stepNum = 4
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0008")
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000
            return gestureData
        }

    val gunMoveRightGesture: GestureData
        /**
         * 向右移动
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face("h0298"));
            val motion =
                Motion()
            motion.number = 6
            motion.stepNum = 4
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0008")
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000
            return gestureData
        }

    val moveFrontGesture: GestureData
        /**
         * 向前移动
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face("h0208"));
            val motion =
                Motion()
            motion.number = 63
            motion.stepNum = 4
            gestureData.footAction = motion
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000
            return gestureData
        }


    val gunMoveFrontGesture: GestureData
        get() {
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face("h0298"));
            val motion =
                Motion()
            motion.number = 63
            motion.stepNum = 4
            gestureData.footAction = motion
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000
            return gestureData
        }

    val moveBackGesture: GestureData
        /**
         * 向后移动
         *
         * @return
         */
        get() {
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face("h0209"));
            val motion =
                Motion()
            motion.number = 64
            motion.stepNum = 4
            gestureData.footAction = motion
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000
            return gestureData
        }

    val gunMoveBackGesture: GestureData
        get() {
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face("h0298"));
            val motion =
                Motion()
            motion.number = 64
            motion.stepNum = 4
            gestureData.footAction = motion
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000
            return gestureData
        }

    val shiBieFistGesture: GestureData
        get() {
            val gestureData = GestureData()
            val motion =
                Motion()
            motion.number = 67
            motion.stepNum = 3
            gestureData.footAction = motion
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 2000
            return gestureData
        }

    fun quitGame(): GestureData {
        val gestureData = GestureData()
        //        gestureData.setExpression(new Face("h0291"));
        val motion = Motion()
        motion.number = 0
        gestureData.footAction = motion
        gestureData.antennalight = AntennaLight(
            MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
            MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
        )
        return gestureData
    }

    //
    fun getgameOverGesture(): GestureData {
        val gestureData = GestureData()
        val motion = Motion()
        //        gestureData.setExpression(new Face("h0299"));
        motion.number = 67
        motion.stepNum = 3
        gestureData.footAction = motion
        gestureData.soundEffects = Sound("a0089")
        gestureData.interval = 1000
        return gestureData
    }

    val fistGameOverGesture: ArrayList<GestureData>
        //猜拳结束
        get() {
            val list = ArrayList<GestureData>()

            val gestureData = GestureData()
            val motion =
                Motion()
            gestureData.expression = Face("h0299")
            motion.number = 2
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0067")
            gestureData.interval = 5000

            val gestureData1 = GestureData()
            val motion1 =
                Motion()
            gestureData1.expression = Face("h0299")
            motion1.number = 121
            motion1.stepNum = 1
            gestureData1.footAction = motion1
            gestureData1.soundEffects = Sound("a0067")
            gestureData1.interval = 5000
            list.add(gestureData1)

            return list
        }

    val palmGameOverGesture: ArrayList<GestureData>
        //猜拳结束
        get() {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            val motion =
                Motion()
            gestureData.expression = Face("h0302")
            motion.number = 2
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0067")
            gestureData.interval = 5000
            list.add(gestureData)
            val gestureData1 = GestureData()
            val motion1 =
                Motion()
            gestureData1.expression = Face("h0302")
            motion1.number = 121
            motion1.stepNum = 1
            gestureData1.footAction = motion1
            gestureData1.soundEffects = Sound("a0067")
            gestureData1.interval = 5000
            list.add(gestureData1)
            return list
        }

    val gunGameOverGesture: ArrayList<GestureData>
        get() {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            val motion =
                Motion()
            gestureData.expression = Face("h0297")
            motion.number = 2
            motion.stepNum = 1
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0067")
            gestureData.interval = 5000
            list.add(gestureData)

            val gestureData1 = GestureData()
            val motion1 =
                Motion()
            gestureData1.expression = Face("h0297")
            motion1.number = 121
            motion1.stepNum = 1
            gestureData1.footAction = motion1
            gestureData1.soundEffects = Sound("a0067")
            gestureData1.interval = 5000
            list.add(gestureData1)
            return list
        }

    val fistGesture: GestureData
        //识别到拳头
        get() {
            val gestureData = GestureData()
            val motion =
                Motion()
            //        gestureData.setExpression(new Face("h0300"));
            motion.number = 67
            motion.stepNum = 3
            gestureData.footAction = motion
            gestureData.soundEffects = Sound("a0089")
            gestureData.interval = 1000
            return gestureData
        }

    val winGesture: ArrayList<GestureData>
        /**
         * 赢的表情
         */
        get() {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face(
                getRandomString(
                    arrayOf(
                        "h0006",
                        "h0001",
                        "h0027"
                    )
                )
            )
            val motion =
                Motion()
            motion.number = getRandomMotion(
                intArrayOf(
                    17,
                    52,
                    65,
                    66
                )
            )
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.antennalight = randomAntennaLight
            gestureData.earAction = AntennaMotion(3)
            gestureData.soundEffects = Sound(
                getRandomString(
                    arrayOf(
                        "a0004",
                        "a0048"
                    )
                )
            )
            gestureData.interval = 8000
            list.add(gestureData)
            return list
        }

    val noListWinGesture: GestureData
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0002")
            val motion =
                Motion()
            motion.number = 11
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN
            )
            gestureData.earAction = AntennaMotion(3)
            gestureData.soundEffects = Sound(
                getRandomString(
                    arrayOf(
                        "a0004",
                        "a0048"
                    )
                )
            )
            gestureData.interval = 8000
            return gestureData
        }

    val lossGesture: ArrayList<GestureData>
        /**
         * 输的表情
         */
        get() {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face(
                getRandomString(
                    arrayOf(
                        "h0011",
                        "h0010"
                    )
                )
            )
            val motion =
                Motion()
            motion.number = getRandomMotion(
                intArrayOf(
                    44,
                    45,
                    15,
                    16
                )
            )
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.antennalight = randomAntennaLight
            gestureData.interval = 8000
            list.add(gestureData)
            return list
        }

    val nolistLossGesture: GestureData
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0023")
            val motion =
                Motion()
            motion.number = 16
            motion.stepNum = 2
            gestureData.footAction = motion
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 8000
            return gestureData
        }

    val noHandGesture: ArrayList<GestureData>
        /**
         * 没看到手势的表情
         */
        get() {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face("h0047")
            gestureData.footAction = Motion(
                getRandomMotion(intArrayOf(21, 22))
            )
            gestureData.antennalight = randomAntennaLight
            gestureData.interval = 2000
            list.add(gestureData)
            return list
        }

    val noListNoHandGesture: GestureData
        get() {
            val gestureData = GestureData()
            gestureData.expression = Face("h0047")
            gestureData.footAction = Motion(
                getRandomMotion(intArrayOf(21, 22))
            )
            gestureData.antennalight = randomAntennaLight
            gestureData.interval = 2000
            return gestureData
        }

    private fun getRandomIndex(length: Int): Int {
        val r = Random()
        return r.nextInt(length)
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
