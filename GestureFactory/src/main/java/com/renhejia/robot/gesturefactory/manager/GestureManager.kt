package com.renhejia.robot.gesturefactory.manager

import android.content.Context
import android.text.TextUtils
import com.renhejia.robot.gesturefactory.parser.GestureData
import com.renhejia.robot.gesturefactory.util.GestureConsts
import java.util.Random

/**
 * 姿态管理
 *
 * @author liujunbin
 */
class GestureManager(private val mContext: Context) {
    private var gestureList: ArrayList<ArrayList<GestureData>>? = null
    private var blockList: ArrayList<ArrayList<GestureData>>? = null
    private var mixList: ArrayList<ArrayList<GestureData>>? = null
    private var index = 0

    init {
        initGestureList()
        initBlockList()
        fillMixList()
    }

    private fun fillMixList() {
        mixList = ArrayList()
        for (i in gestureList!!.indices) {
            mixList!!.add(gestureList!![i])
            mixList!!.add(blockList!![0])
        }
    }

    private fun initBlockList() {
        blockList = ArrayList()
        blockList!!.add(GestureCenter.test_GestureData0())
    }

    private fun initGestureList() {
        gestureList = ArrayList()
        gestureList!!.add(GestureCenter.test_GestureData1())
        gestureList!!.add(GestureCenter.test_GestureData2())
        gestureList!!.add(GestureCenter.test_GestureData3())
        gestureList!!.add(GestureCenter.test_GestureData4())
        gestureList!!.add(GestureCenter.test_GestureData5())
        gestureList!!.add(GestureCenter.test_GestureData6())
        gestureList!!.add(GestureCenter.test_GestureData7())
        gestureList!!.add(GestureCenter.test_GestureData8())
    }


    /**
     * 获取姿态
     *
     * @param gesture
     * @return
     */
    fun getRobotGesture(gesture: String): ArrayList<GestureData>? {
        if (TextUtils.isEmpty(gesture)) {
            return null
        } else if (gesture == GestureConsts.GESTURE_STAND_RESET) {
            return GestureCenter.resetStandGestureData()
        } else if (gesture == GestureConsts.GESTURE_RANDOM) {
            return randomGesture
            //
        } else if (gesture == GestureConsts.GESTURE_DEFAULT) {
            return GestureCenter.commonStandGestureData()
            //
        } else if (gesture == GestureConsts.GESTURE_ORDER) {
//            if (index >= 0 && index < gestureList.size() - 1) {
            if (index >= 0 && index < mixList!!.size - 1) {
                index += 1
            } else {
                index = 1
            }
            if (index >= mixList!!.size) {
                index = 0
            }
            return mixList!![index]
        } else if (gesture == GestureConsts.GESTURE_COMMON_00) {
            return GestureCenter.commonGestureData()
        } else if (gesture == GestureConsts.GESTURE_ROBOT_RANDOM) {
            return GestureCenter.randomGesture
        } else if (gesture == GestureConsts.GESTURE_ROBOT_FOUND_PEOPLE) {
            return GestureCenter.robotFoundPeoGestureData()
        } else if (gesture == GestureConsts.GESTURE_ROBOT_STAND) {
            return GestureCenter.robotStandGestureData()
        } else if (gesture == GestureConsts.GESTURE_COMMON_01) {
            return GestureCenter.common01GestureData()
        } else if (gesture == GestureConsts.GESTURE_PAIR) {
            return GestureCenter.pairGestureData()
        } else if (gesture == GestureConsts.GESTURE_STARTUP) {
            return GestureCenter.startupGestureData2()
        } else if (gesture == GestureConsts.GESTURE_SHUTDOWN) {
            return GestureCenter.shutdownGestureData()
        } else if (gesture == GestureConsts.GESTURE_BATLOWER) {
            return GestureCenter.batteryLowerGestureData()
        } else if (gesture == GestureConsts.GESTURE_START_CHARGE) {
            return GestureCenter.startChargingGestureData()
        } else if (gesture == GestureConsts.GESTURE_SCAN) {
            return GestureCenter.scanGestureData()
        } else if (gesture == GestureConsts.GESTURE_FOUND_OWNER) {
            return GestureCenter.foundOwnerGestureData()
        } else if (gesture == GestureConsts.GESTURE_FOUND_PEO) {
            return GestureCenter.foundPeoGestureData()
        } else if (gesture == GestureConsts.GESTURE_FOUND_NO) {
            return GestureCenter.foundNoPeoGestureData()
        } else if (gesture == GestureConsts.GESTURE_STANDBY) {
            return GestureCenter.standByGestureData()
        } else if (gesture == GestureConsts.GESTURE_ASSISTANT) {
            return GestureCenter.assistantGestureData()
        } else if (gesture == GestureConsts.GESTURE_DANGLING) {
            return GestureCenter.danglingGestureData()
        } else if (gesture == GestureConsts.GESTURE_FALL_PREVENTION) {
            return GestureCenter.fallPreventionGestureData()
        } else if (gesture == GestureConsts.GESTURE_WHERE_ABOUT) {
            return GestureCenter.whereaboutsGestureData()
        } else if (gesture == GestureConsts.GESTURE_BIRTHDAY) {
            return GestureCenter.birthdayGestureData()
        } else if (gesture == GestureConsts.GESTURE_RANDOM) {
            return GestureCenter.birthdayGestureData()
        } else if (gesture == GestureConsts.GESTURE_CLOCK) {
            return GestureCenter.clockGestureData()
        } else if (gesture == GestureConsts.GESTURE_CLOSE_CLOCK) {
            return GestureCenter.closeClockGestureData()
        } else if (gesture == GestureConsts.GESTURE_COUNT_DOWN) {
            return GestureCenter.countdownGestureData()
        } else if (gesture == GestureConsts.GESTURE_WAKEUP) {
            return GestureCenter.wakeupGesture
        } else if (gesture == GestureConsts.GESTURE_HAND_RECOGNITION) {
            return null

            //            return GestureCenter.getHandGestureWithID("0");
        } else if (gesture == GestureConsts.GESTURE_MOTION_SAD) {
            return GestureCenter.sadGesture
        } else if (gesture == GestureConsts.GESTURE_MOTION_HAPPY) {
            return GestureCenter.happyGesture
        } else if (gesture == GestureConsts.GESTURE_DEMO) {
            return GestureCenter.autoDisplayGestureData()
        } else if (gesture == GestureConsts.GESTURE_TEST1) {
            return GestureCenter.test_GestureData1()
        } else if (gesture == GestureConsts.GESTURE_TEST2) {
            return GestureCenter.test_GestureData2()
        } else if (gesture == GestureConsts.GESTURE_TEST3) {
            return GestureCenter.test_GestureData3()
        } else if (gesture == GestureConsts.GESTURE_TEST4) {
            return GestureCenter.test_GestureData4()
        } else if (gesture == GestureConsts.GESTURE_TEST5) {
            return GestureCenter.test_GestureData5()
        } else if (gesture == GestureConsts.GESTURE_TEST6) {
            return GestureCenter.test_GestureData6()
        } else if (gesture == GestureConsts.GESTURE_TEST7) {
            return GestureCenter.test_GestureData7()
        } else if (gesture == GestureConsts.GESTURE_TEST8) {
            return GestureCenter.test_GestureData8()
        } else if (gesture == GestureConsts.GESTURE_TEST0) {
            return GestureCenter.test_GestureData0()
        } else if (gesture == GestureConsts.GESTURE_PRECIPICE_START) {
            return GestureCenter.danglingGestureData()
        } else if (gesture == GestureConsts.GESTURE_PRECIPICE_STOP) {
            return GestureCenter.danglingStopGestureData()
        } else {
            return null
        }
    }

    private val randomGesture: ArrayList<GestureData>
        get() {
            val gestureData: ArrayList<GestureData>
            val rand = Random()
            val randNum = rand.nextInt(gestureList!!.size)
            gestureData = gestureList!![randNum]
            return gestureData ?: GestureCenter.foundOwnerGestureData()
        }


    companion object {
        private var gestureManager: GestureManager? = null
        fun getInstance(context: Context): GestureManager {
            if (gestureManager == null) {
                synchronized(ParserManager::class.java) {
                    if (gestureManager == null) {
                        gestureManager = GestureManager(context)
                    }
                }
            }
            return gestureManager!!
        }
    }
}
