package com.renhejia.robot.gesturefactory.manager

import android.util.Log
import com.renhejia.robot.commandlib.consts.MCUCommandConsts
import com.renhejia.robot.commandlib.consts.SoundEffect
import com.renhejia.robot.commandlib.parser.antennalight.AntennaLight
import com.renhejia.robot.commandlib.parser.antennamotion.AntennaMotion
import com.renhejia.robot.commandlib.parser.face.Face
import com.renhejia.robot.commandlib.parser.motion.Motion
import com.renhejia.robot.commandlib.parser.sound.Sound
import com.renhejia.robot.commandlib.parser.tts.Tts
import com.renhejia.robot.gesturefactory.parser.GestureData
import java.util.Random

/**
 * 姿态中心
 *
 * @author liujunbin
 */
class GestureCenter {
    private val expressionList = ArrayList<Face>()
    private val soundList = ArrayList<Sound>()
    private val motionList = ArrayList<Motion>()
    private val lightList = ArrayList<AntennaLight>()
    private val earList = ArrayList<AntennaMotion>()
    private val lightStatusList = ArrayList<AntennaLight>()
    private var random: Random? = null

    private fun initData() {
        random = Random()
    }


    companion object {
        /**
         * @return
         */
        fun demoGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0020")
            data.earAction = AntennaMotion(3)
            data.footAction = Motion(63)
            data.soundEffects = Sound("a0051")
            list.add(data)
            return list
        }

        fun resetStandGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.footAction = Motion(0)
            data.soundEffects = Sound("a0053")
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            ) //TODO  更新为蓝色,亮3秒
            data.interval = 500
            list.add(data)
            return list
        }

        fun resetStandGesture(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.footAction = Motion(0)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            ) //TODO  更新为蓝色,亮3秒
            data.interval = 500
            list.add(data)
            return list
        }

        /**
         * 正常 normal
         *
         * @return
         */
        fun normalGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.footAction = Motion(0)
            data.expression = Face("bluehole0415")
            list.add(data)
            //TODO 待添加
            return list
        }

        fun commonGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0020")
            data.expressionTime = 2
            data.interval = 500
            data.soundEffects = Sound("a0040")

            list.add(data)
            val data2 = GestureData()
            data2.expression = Face("h0019")
            data2.expressionTime = 2
            data2.soundEffects = Sound("a0070")
            data.interval = 500

            list.add(data2)

            //TODO 待添加
            return list
        }

        fun stopSoundEffectData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.interval = 500
            data.soundEffects = Sound(SoundEffect.COMMAND_FUNCTION_STOP)
            list.add(data)
            return list
        }

        //    public static ArrayList<GestureData> clockGestureData() {
        //        ArrayList<GestureData> list = new ArrayList<>();
        //        GestureData data = new GestureData();
        //        data.setExpression(new Face("h0008"));
        //        data.setInterval(1000 * 60);
        ////        data.setFootAction(new Motion(SHAKE_SWAYING_UP_AND_DOWN1, 17,35));
        //        data.setFootAction(new Motion(null, 17, 35));
        //        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE));//TODO  更新为蓝色,亮3秒
        //        data.setSoundEffects(new Sound("a0029"));
        //        list.add(data);
        //
        //        //TODO 待添加
        //        return list;
        //    }
        fun clockGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.interval = (1000 * 10).toLong()
            data.footAction = Motion(null, 17, 40)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            ) //TODO  更新为红色,亮3秒
            data.soundEffects = Sound("a0029")
            list.add(data)

            //TODO 待添加
            return list
        }

        fun closeClockGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.footAction = Motion(0)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            ) //TODO  更新为蓝色,亮3秒
            data.interval = 500
            list.add(data)
            return list
        }


        fun countdownGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.interval = (1000 * 60).toLong()
            //        data.setFootAction(new Motion(SHAKE_SWAYING_UP_AND_DOWN1, 17,35));
            data.footAction = Motion(null, 17, 35)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE
            ) //TODO  更新为蓝色,亮3秒
            data.soundEffects = Sound("a0029")
            list.add(data)

            //TODO 待添加
            return list
        }

        fun standGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0020")
            data.expressionTime = 2
            data.interval = 3000
            data.soundEffects = Sound("a0040")
            list.add(data)
            return list
        }

        /**
         * 通用随机
         *
         * @return
         */
        fun common01GestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0063")
            data.footAction = Motion(26)
            data.interval = 500
            list.add(data)

            val data1 = GestureData()
            data1.footAction = Motion(0)
            data.interval = 500
            list.add(data1)

            val data2 = GestureData()
            data2.footAction = Motion(25)
            data.interval = 500
            list.add(data2)

            val data3 = GestureData()
            data3.footAction = Motion(0)
            data.interval = 500
            list.add(data3)
            //TODO 待添加
            return list
        }

        /**
         * 通用随机
         *
         * @return
         */
        fun commonStandGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0063")
            data.footAction = Motion(34)
            data.interval = 500
            list.add(data)


            //TODO 待添加
            return list
        }

        /**
         * pair
         *
         * @return
         */
        fun pairGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.footAction = Motion(0)
            data.soundEffects = Sound("a0030")
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_ORANGE
            )
            data.interval = 4000
            list.add(data)

            val data1 = GestureData()
            data1.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            )
            data1.interval = 1000
            list.add(data1)

            //TODO 待添加
            return list
        }

        fun dodgeGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0031")
            data.footAction = Motion(5)
            data.interval = 2000

            val data1 = GestureData()
            data1.footAction = Motion(5)
            data1.soundEffects = Sound("a0007")
            data1.interval = 2000
            list.add(data)
            list.add(data1)
            return list
        }

        fun sleepyGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0041")
            data.footAction = Motion(41)
            data.soundEffects = Sound("a0040")
            data.antennalight = AntennaLight("on", 3)
            data.interval =
                (getRandomMotion(
                    intArrayOf(
                        1,
                        2,
                        3
                    )
                ) * 1000).toLong()

            val data1 = GestureData()
            data1.expression = Face("h0053")
            data1.footAction = Motion(46)
            data1.antennalight = AntennaLight("off", 0)
            data1.interval =
                (getRandomMotion(intArrayOf(2, 3)) * 1000).toLong()

            val data2 = GestureData()
            data2.footAction = Motion(
                "null",
                getRandomMotion(intArrayOf(55, 56)),
                2
            )
            data2.antennalight = AntennaLight("on", 6)
            data2.interval =
                (getRandomMotion(
                    intArrayOf(
                        2,
                        3,
                        4
                    )
                ) * 1000).toLong()

            list.add(data)
            list.add(data1)
            list.add(data2)
            return list
        }

        /**
         * 开机  startup
         *
         * @return
         */
        fun startupGestureData2(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            //展示主表情
            data.expression = Face("h0055")
            data.footAction = Motion(63)
            data.interval = 3000
            list.add(data)

            val data1 = GestureData()
            data1.footAction = Motion(64)
            data.interval = 3000
            list.add(data1)

            val data2 = GestureData()
            data2.footAction = Motion(5)
            data2.interval = 2000
            list.add(data2)

            val data3 = GestureData()
            data3.footAction = Motion(6)
            data3.interval = 2000
            list.add(data3)

            //TODO 待添加
            return list
        }

        /**
         * 关机
         *
         * @return
         */
        fun shutdownGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0055")
            data.footAction = Motion(0)
            data.soundEffects = Sound("a0088")
            list.add(data)
            //TODO 待添加
            return list
        }

        /**
         * 低电量
         *
         * @return
         */
        fun batteryLowerGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            ) //TODO 颜色为红色
            data.soundEffects = Sound("a0055")
            data.interval = 2000
            //TODO 待添加
            list.add(data)

            val data1 = GestureData()
            data1.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            ) //TODO 颜色为红色
            //TODO 待添加
            list.add(data1)
            return list
        }


        fun startChargingGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.soundEffects = Sound("a0025")
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE
            ) //TODO  更新为蓝色,亮3秒
            data.soundEffects = Sound("a0044")
            data.interval = 3000
            list.add(data)

            val data1 = GestureData()
            data1.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            )
            data1.interval = 1000
            list.add(data1)
            //TODO 待添加
            return list
        }

        fun powerOnChargingGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0059")
            data.footAction = Motion(86)
            data.interval = 1500
            list.add(data)

            val data1 = GestureData()
            data1.interval = 3000
            data1.footAction = Motion(64)
            //更换成制定动作
            list.add(data1)
            //TODO 待添加
            return list
        }


        /**
         * h0087表情，1次
         * 23动作，1次
         * 50动作，1次
         * 59动作，一直循环至表情播放结束
         * 同时天线慢速摆动，一直循环至表情结束
         * #FF8F1F，常亮
         *
         * @return
         */
        fun birthdayGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            //        data.setExpression(new Face("h0087"));
            data.expression = Face("h0204")
            data.earAction = AntennaMotion(3)
            data.footAction = Motion(23)
            val antennaMotion = AntennaMotion(3)
            antennaMotion.speed = 600
            data.earAction = antennaMotion
            data.antennalight = AntennaLight("on", 1)
            data.interval = 2000

            val data1 = GestureData()
            data1.footAction = Motion(50)
            data1.earAction = antennaMotion
            data1.interval = 2000

            val data2 = GestureData()
            data2.footAction = Motion(59)
            data.earAction = antennaMotion
            data2.interval = 2000
            val data3 = GestureData()
            data3.footAction = Motion(59)
            data3.earAction = antennaMotion
            data3.interval = 3000

            list.add(data)
            list.add(data1)
            list.add(data2)
            list.add(data2)
            list.add(data2)
            list.add(data2)
            list.add(data2)
            list.add(data2)
            list.add(data2)
            list.add(data3)
            return list
        }

        fun birthdayWaitGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0293")
            data.interval = (10 * 1000).toLong()
            list.add(data)
            return list
        }

        fun birthdayBlowOutGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0294")
            data.interval = 11000
            list.add(data)
            return list
        }

        fun volumeUpGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("44squintLfetUp")
            data.soundEffects = Sound("a0028")
            data.interval = 3000
            list.add(data)
            //TODO 待添加
            return list
        }

        fun volumeDownGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0007")
            data.soundEffects = Sound("a0028")
            data.interval = 3000
            list.add(data)
            //TODO 待添加
            return list
        }

        fun scanGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()

            val data = GestureData()
            data.expression = Face("h0019")
            data.expressionTime = 3
            data.footAction = Motion(6)
            data.interval = 4000

            list.add(data)

            val data2 = GestureData()
            data2.expression = Face("h0045")
            data2.expressionTime = 1
            data.interval = 4000

            list.add(data2)

            val data3 = GestureData()
            data3.expression = Face("h0036")
            data3.expressionTime = 3
            data3.footAction = Motion(5)
            data3.soundEffects = Sound("a0094")
            data.interval = 4000

            list.add(data3)

            val data4 = GestureData()
            data4.expression = Face("h0042")
            data4.expressionTime = 1
            data.interval = 4000

            list.add(data4)

            val data5 = GestureData()
            data5.expression = Face("h0042") //左顾右盼表情
            data5.expressionTime = 3
            data5.footAction = Motion(6)
            data5.soundEffects = Sound("a0040")
            data5.interval = 4000
            list.add(data5)
            //TODO 待添加
            return list
        }

        fun foundOwnerGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0006")
            data.expressionTime = 2
            data.footAction = Motion(7)
            data.interval = 2000
            list.add(data)

            val data1 = GestureData()
            data1.footAction = Motion(8)
            data1.interval = 2000
            list.add(data1)

            val data2 = GestureData()
            data2.footAction = Motion(8)
            data2.interval = 2000
            list.add(data2)

            val data3 = GestureData()
            data3.expression = Face("h0027")
            data3.earAction = AntennaMotion(3)
            data1.interval = 2000
            list.add(data3)

            //TODO 待添加
            return list
        }

        private val ttsData =
            arrayOf("累了，让我休息休息", "好累，让我恢复下", "我需要休息下，待会回来")

        val highTempTTSGestureData: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val data = GestureData()
                data.ttsInfo = Tts(getRandomString(ttsData))
                data.interval = 3000
                list.add(data)
                return list
            }

        fun foundPeoGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0006")
            data.footAction = Motion(null, 63, 3)
            data.soundEffects = Sound("a0032")
            data.antennalight = AntennaLight("on", 7)
            data.interval = 6000

            val data1 = GestureData()
            data1.footAction = Motion(null, 50, 2)
            data1.expression = Face("h0027")
            data1.soundEffects = Sound("a0079")
            data1.interval = 6000
            list.add(data)
            list.add(data1)
            return list
        }

        /**
         * @return
         */
        fun foundNoPeoGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0058")
            data.footAction = Motion(null, 49, 2)
            data.soundEffects = Sound("a0020")
            data.antennalight = AntennaLight("on", 8)
            data.interval = 4000

            val data1 = GestureData()
            data1.footAction = Motion(null, 64, 2)
            data1.expression = Face("h0031")
            data1.soundEffects = Sound("a0089")
            data1.interval = 5000
            list.add(data)
            list.add(data1)
            return list
        }


        /**
         * @return
         */
        fun robotFoundPeoGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            var motionList = ArrayList<Motion?>()
            val random = Random()
            var expressionList = ArrayList<Face?>()
            expressionList = initExpression2(expressionList)
            //TODO 需要更换 MontionList
            motionList = initMotionList(motionList)
            val data = GestureData()
            data.expression = getRandomExpression(random, expressionList)
            data.footAction = getRandomFoot(random, motionList)
            //        data.setFootAction(new Motion(MCUCommandConsts.COMMAND_VALUE_MOTION_LEFT_ROUND,1));
            data.expressionTime = 1
            data.interval = 2000
            list.add(data)

            val data1 = GestureData()
            data1.footAction = Motion(22)
            data1.interval = 2000
            list.add(data1)
            //TODO 待添加
            return list
        }

        /**
         * @return
         */
        fun robotStandGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            var motionList = ArrayList<Motion?>()
            val random = Random()
            var expressionList = ArrayList<Face?>()
            expressionList = initExpression3(expressionList)
            motionList = initMotionList2(motionList)

            val data = GestureData()
            data.expression = getRandomExpression(random, expressionList)
            data.footAction = getRandomFoot(random, motionList)
            data.expressionTime = 1
            data.interval = 2000
            list.add(data)

            //TODO 待添加
            return list
        }

        /**
         * 待机
         * standby
         *
         * @return
         */
        fun standByGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.footAction = Motion(0)
            data.soundEffects = Sound("a0050")
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_WHITE
            )
            data.interval = 1000
            list.add(data)

            val data1 = GestureData()
            data1.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            )
            data1.interval = 1000
            list.add(data1)

            //TODO 待添加
            return list
        }

        /**
         * 唤醒(未完成)
         * assistant
         *
         * @return
         */
        fun assistantGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0015")
            data.soundEffects = Sound("a0025")
            data.expressionTime = 1
            data.interval = 2000
            list.add(data)

            val data1 = GestureData()
            data1.expression = Face("h0015")
            data1.footAction = Motion(8)
            data1.interval = 2000
            list.add(data1)

            //TODO 待添加
            return list
        }


        private val wakeupListenFace = arrayOf("h0015", "h0019", "h0037", "h0038", "h0059")

        /**
         * 唤醒监听中
         *
         * @return
         */
        fun wakeupListenGesture(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face(
                wakeupListenFace[getRandomIndex(
                    wakeupListenFace.size
                )]
            )
            //停止音效播放
            gestureData.soundEffects = Sound("stop")
            val motion = Motion()
            motion.number = 0
            gestureData.footAction = motion
            list.add(gestureData)
            return list
        }

        fun wakeupUnderstandGesture(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face("h0050")
            val motion = Motion()
            motion.number = 34
            gestureData.footAction = motion
            list.add(gestureData)
            return list
        }

        fun wakeupSpeakGesture(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face("h0006")
            val motion = Motion()
            motion.number = 25
            gestureData.footAction = motion
            list.add(gestureData)
            return list
        }

        val tofGesture: ArrayList<GestureData>
            //--------------------------传感器相关姿态 start
            get() {
                val list = ArrayList<GestureData>()
                // gestureData.setSoundEffects(new Sound("a0043"));
                val gestureData2 = GestureData()
                val leftMotion =
                    Motion()
                leftMotion.number = 21
                leftMotion.stepNum = 2
                gestureData2.expression = Face("h0192")
                gestureData2.footAction = leftMotion
                gestureData2.interval = 3000
                list.add(gestureData2)
                return list
            }


        //摇晃
        private val waggleFace = arrayOf("h0011", "h0018", "h0034", "h0053")
        private val waggleSound = arrayOf("a0034", "a0035", "a0069")
        private val waggleMotion = intArrayOf(62, 17, 18, 27, 50)

        val waggleGesture: ArrayList<GestureData>
            /**
             * 摇晃姿态s
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    waggleFace[getRandomIndex(waggleFace.size)]
                )
                gestureData.soundEffects = Sound(
                    waggleSound[getRandomIndex(waggleSound.size)]
                )
                val downMotion =
                    Motion()
                downMotion.number = waggleMotion[getRandomIndex(
                    waggleMotion.size
                )]
                gestureData.footAction = downMotion
                val antennaMotion = AntennaMotion(3)
                val light =
                    AntennaLight("on", getRandomIndex(9))
                gestureData.antennalight = light
                gestureData.earAction = antennaMotion
                gestureData.interval = 2000
                list.add(gestureData)
                return list
            }

        //落地
        private val fallGroundFace = arrayOf("h0054", "h0003", "h0029", "h0011")
        private val fallGroundSound = arrayOf("a0083", "a0076", "a0064", "a0068", "a0078")
        private val fallGroundMotion = intArrayOf(33, 34, 1, 2, 49, 60)

        val fallGroundGesture: ArrayList<GestureData>
            /**
             * 落地姿态
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    fallGroundFace[getRandomIndex(fallGroundFace.size)]
                )
                gestureData.soundEffects = Sound(
                    fallGroundSound[getRandomIndex(fallGroundSound.size)]
                )
                // Motion downMotion = new Motion();
                // downMotion.setNumber(fallGroundMotion[getRandomIndex(fallGroundMotion.length)]);
                // gestureData.setFootAction(downMotion);
                // AntennaMotion antennaMotion = new AntennaMotion(fallEar[getRandomIndex(fallEar.length)]);
                // AntennaLight light = new AntennaLight("on", getRandomIndex(9));
                // gestureData.setAntennalight(light);
                // gestureData.setEarAction(antennaMotion);
                gestureData.interval = 2000
                list.add(gestureData)
                return list
            }

        // 倒下
        private val fallDownFace = arrayOf("h0001", "h0005", "h0011", "h0016", "h0033", "h0052")
        private val fallDownSound = arrayOf("a0003", "a0006", "a0098", "a0086", "a0082", "a0020")
        private val fallDownMotion = intArrayOf(49, 59, 17, 48)

        val fallDownGesture: ArrayList<GestureData>
            /**
             * 倒下姿态
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    fallDownFace[getRandomIndex(fallDownFace.size)]
                )
                gestureData.soundEffects = Sound(
                    fallDownSound[getRandomIndex(fallDownSound.size)]
                )
                val downMotion =
                    Motion()
                downMotion.number = fallDownMotion[getRandomIndex(
                    fallDownMotion.size
                )]
                gestureData.footAction = downMotion
                // AntennaMotion antennaMotion = new AntennaMotion(fallEar[getRandomIndex(fallEar.length)]);
                // AntennaLight light = new AntennaLight("on", getRandomIndex(9));
                // gestureData.setAntennalight(light);
                // gestureData.setEarAction(antennaMotion);
                gestureData.interval = 2000
                list.add(gestureData)
                return list
            }

        // 单击
        private val tapFace = arrayOf("h0190")

        // private static final String[] tapSound = new String[]{"a0124"};
        private val tapMotion = intArrayOf(49)

        val tapGesture: ArrayList<GestureData>
            /**
             * 单击姿态
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    tapFace[getRandomIndex(tapFace.size)]
                )
                // gestureData.setSoundEffects(new Sound(tapSound[getRandomIndex(tapSound.length)]));
                val downMotion =
                    Motion()
                downMotion.number = tapMotion[getRandomIndex(
                    tapMotion.size
                )]
                gestureData.footAction = downMotion
                // AntennaMotion antennaMotion = new AntennaMotion(fallEar[getRandomIndex(fallEar.length)]);
                val light = AntennaLight("on", 3)
                gestureData.antennalight = light
                // gestureData.setEarAction(antennaMotion);
                gestureData.interval = 4000
                list.add(gestureData)
                return list
            }

        // 双击
        private val doubleTapFace = arrayOf("h0189")

        // private static final String[] doubleTapSound = new String[]{"a0017"};
        private val doubleTapMotion = intArrayOf(27)

        /**
         * 双击姿态
         */
        fun getdoubleTapGesture(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face(
                doubleTapFace[getRandomIndex(
                    doubleTapFace.size
                )]
            )
            // gestureData.setSoundEffects(new Sound(doubleTapSound[getRandomIndex(doubleTapSound.length)]));
            val downMotion = Motion()
            downMotion.number = doubleTapMotion[getRandomIndex(doubleTapMotion.size)]
            downMotion.speed = 3
            downMotion.stepNum = 5
            gestureData.footAction = downMotion
            // AntennaMotion antennaMotion = new AntennaMotion(fallEar[getRandomIndex(fallEar.length)]);
            val light = AntennaLight("on", 6)
            gestureData.antennalight = light
            // gestureData.setEarAction(antennaMotion);
            gestureData.interval = 8000
            list.add(gestureData)
            return list
        }

        val longPressGesture: ArrayList<GestureData>
            /**
             * 长按姿态
             */
            get() {
                val list = ArrayList<GestureData>()
                val timeData = GestureData()
                timeData.expression = Face(
                    getRandomString(
                        arrayOf("h0191")
                    )
                )
                timeData.interval = 800

                val gestureData1 = GestureData()
                val motion =
                    Motion(17)
                motion.speed = 1
                motion.stepNum = 5
                gestureData1.footAction = motion

                val light = AntennaLight("on", 1)
                gestureData1.antennalight = light
                gestureData1.interval = 3500

                val gestureData2 = GestureData()
                val motion2 =
                    Motion(1)
                motion2.speed = 1
                motion2.stepNum = 2
                gestureData2.footAction = motion2
                gestureData2.interval = 3500

                list.add(timeData)
                list.add(gestureData1)
                list.add(gestureData2)

                return list
            }

        private val danglingFace = arrayOf("h0196")
        private val danglingMotion = intArrayOf(1, 17)

        /**
         * 悬空 (天线一直转)
         * assistant
         *
         * @return
         */
        fun danglingGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val timeData = GestureData()
            timeData.interval = 800
            timeData.expression = Face(
                danglingFace[getRandomIndex(
                    danglingFace.size
                )]
            )

            val data1 = GestureData()
            val motion = Motion()
            motion.number = 1
            motion.stepNum = 2
            motion.speed = 1
            data1.footAction = motion
            data1.soundEffects = Sound("a0076")
            data1.earAction = AntennaMotion(3)
            data1.interval = 7000
            val light = AntennaLight("on", getRandomIndex(9))
            data1.antennalight = light

            val data2 = GestureData()
            val motion2 = Motion()
            motion2.number = 17
            motion2.stepNum = 5
            motion2.speed = 1
            data2.footAction = motion2

            list.add(timeData)
            list.add(data1)
            list.add(data2)

            return list
        }

        fun danglingStopGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data1 = GestureData()
            //        data1.setFootAction(new Motion(9));
            val motion = Motion()
            motion.number = 34
            motion.stepNum = 4
            data1.footAction = motion
            data1.expression = Face("h0027")
            data1.soundEffects = Sound("click")
            val antennaMotion = AntennaMotion(3)
            data1.earAction = antennaMotion
            data1.interval = 1000
            list.add(data1)
            return list
        }

        private val fallGesture: GestureData
            /**
             * 防跌落统一表情与声音等
             *
             * @return
             */
            get() {
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(
                        arrayOf(
                            "h0016",
                            "h0011",
                            "h0028",
                            "h0001",
                            "h0049"
                        )
                    )
                )
                gestureData.soundEffects = Sound(
                    getRandomString(
                        arrayOf(
                            "a0003",
                            "a0012",
                            "a0007",
                            "a0019"
                        )
                    )
                )
                val antennaMotion = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(
                            1,
                            2,
                            3
                        )
                    )
                )
                val light =
                    AntennaLight("on", getRandomIndex(9))
                gestureData.antennalight = light
                gestureData.earAction = antennaMotion
                gestureData.interval = 2000
                return gestureData
            }

        /**
         * 防跌落前进不调整动作，可以调整其他
         */
        fun fallForwardGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data1 = fallGesture
            val motion = Motion()
            motion.number = 63
            motion.stepNum = 3
            motion.speed = 2
            data1.footAction = motion
            data1.interval = 5000
            list.add(data1)
            return list
        }

        /**
         * 防跌落后退不调整动作，可以调整其他
         */
        fun fallBackendGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data1 = fallGesture
            val motion = Motion()
            motion.number = 64
            motion.stepNum = 3
            motion.speed = 2
            data1.footAction = motion
            data1.interval = 5000
            list.add(data1)
            return list
        }

        /**
         * 防跌落走左不调整动作，可以调整其他
         */
        fun fallLeftGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data1 = fallGesture
            val motion = Motion()
            motion.number = 5
            motion.stepNum = 3
            data1.footAction = motion
            data1.interval = 5000
            list.add(data1)
            return list
        }

        /**
         * 防跌落右走不调整动作，可以调整其他
         */
        fun fallRightGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data1 = fallGesture
            val motion = Motion()
            motion.number = 6
            motion.stepNum = 3
            data1.footAction = motion
            data1.interval = 5000
            list.add(data1)
            return list
        }

        /**
         * 防跌落
         * assistant
         *
         * @return
         */
        fun fallPreventionGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0016")
            data.expressionTime = 1
            data.soundEffects = Sound("a0037")
            val antennaMotion = AntennaMotion(3)
            antennaMotion.speed = 60
            antennaMotion.angle = 90
            data.earAction = antennaMotion
            data.interval = 5000
            list.add(data)

            //TODO 待添加
            return list
        }

        /**
         * 落地
         * assistant
         *
         * @return
         */
        fun whereaboutsGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()

            val data = GestureData()
            data.expression = Face("h0029")
            data.footAction = Motion(7)
            data.interval = 1500
            list.add(data)

            val data1 = GestureData()
            data1.footAction = Motion(8)
            data1.interval = 1000
            list.add(data1)

            val data2 = GestureData()
            data2.footAction = Motion(7)
            data2.interval = 1000
            list.add(data2)

            //TODO 待添加
            return list
        }

        //--------------------------传感器相关姿态 end
        fun autoDisplayGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()


            val data3 = GestureData()
            data3.expression = Face("h0027")
            data3.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            data3.interval = 1000
            list.add(data3)

            val data1 = GestureData()
            data1.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            )
            data1.interval = 1000
            list.add(data1)

            return list
        }

        private val face6To8 = arrayOf("h0069", "h0067", "h0068")
        private val face8To10 = arrayOf("h0066", "h0075")
        private val face10To12 = arrayOf("h0071", "h0070")
        private val face12To14 = arrayOf("h0074")
        private val face14To16 = arrayOf("h0073")
        private val face16To18 = arrayOf("h0064")
        private val face18To20 = arrayOf("h0072")
        private val face20To22 = arrayOf("h0065", "h0071")
        private val face22To6 = arrayOf("h0004", "h0039", "h0055")

        /**
         * 24小时展示的
         *
         * @return
         */
        fun hourGestureData(hour: Int): ArrayList<GestureData> {
            Log.d("GestureCenter", "hourGestureData: $hour")
            val list = ArrayList<GestureData>()
            val data = GestureData()
            var faceName: String? = null
            var movieDuration = 3
            when (hour) {
                6, 7 -> faceName = getRandomString(face6To8)
                8, 9 -> faceName = getRandomString(face8To10)
                10, 11 -> faceName = getRandomString(face10To12)
                12, 13 -> faceName = getRandomString(face12To14)
                14, 15 -> faceName = getRandomString(face14To16)
                16, 17 -> faceName = getRandomString(face16To18)
                18, 19 -> faceName = getRandomString(face18To20)
                20, 21 -> faceName = getRandomString(face20To22)
                22, 23, 24, 0, 1, 2, 3, 4, 5 -> faceName = getRandomString(face22To6)
            }

            when (faceName) {
                "h0064" -> movieDuration = 12
                "h0065" -> movieDuration = 13
                "h0066" -> movieDuration = 17
                "h0067" -> movieDuration = 10
                "h0068" -> movieDuration = 21
                "h0069" -> movieDuration = 12
                "h0070" -> movieDuration = 6
                "h0071" -> movieDuration = 10
                "h0072" -> movieDuration = 13
                "h0073" -> movieDuration = 10
                "h0074" -> movieDuration = 9
                "h0075" -> movieDuration = 13
                "h0004" -> movieDuration = 4
                "h0039" -> movieDuration = 11
                "h0055" -> movieDuration = 3
            }
            data.expression = Face(faceName)
            data.footAction = Motion("null", 0)
            var interval = movieDuration - 6
            if (interval < 0) {
                interval = 2
            }
            data.interval = (interval * 1000).toLong()
            data.antennalight = AntennaLight("on", getRandomIndex(9))
            list.add(data)

            val data1 = GestureData()
            data1.antennalight = AntennaLight("on", getRandomIndex(9))
            data1.interval = 2000
            list.add(data1)
            val data2 = GestureData()
            data2.antennalight = AntennaLight("on", getRandomIndex(9))
            val antennaMotion = AntennaMotion(3)
            antennaMotion.speed = 600
            antennaMotion.angle = 45
            data2.earAction = antennaMotion
            data2.interval = 2000
            list.add(data2)
            val data3 = GestureData()
            data3.antennalight = AntennaLight("on", getRandomIndex(9))
            data3.interval = 2000
            list.add(data3)

            return list
        }

        fun hourGestureDataWithName(faceName: String): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            var movieDuration = 3

            when (faceName) {
                "h0064" -> movieDuration = 12
                "h0065" -> movieDuration = 13
                "h0066" -> movieDuration = 17
                "h004cloud" -> movieDuration = 10
                "h0068" -> movieDuration = 21
                "h0069" -> movieDuration = 12
                "h0070" -> movieDuration = 6
                "h0071" -> movieDuration = 10
                "h0072" -> movieDuration = 13
                "h0073" -> movieDuration = 10
                "h0074" -> movieDuration = 9
                "h0075" -> movieDuration = 13
                "h0004" -> movieDuration = 4
                "h0039" -> movieDuration = 11
                "h0055" -> movieDuration = 3
            }
            data.expression = Face(faceName)
            data.footAction = Motion("null", 0)
            data.interval = ((movieDuration - 6) * 1000).toLong()
            data.antennalight = AntennaLight("on", getRandomIndex(9))
            list.add(data)

            val data1 = GestureData()
            data1.antennalight = AntennaLight("on", getRandomIndex(9))
            data1.interval = 2000
            data1.footAction = Motion("null", 34)
            list.add(data1)
            val data2 = GestureData()
            data2.antennalight = AntennaLight("on", getRandomIndex(9))
            data2.earAction = AntennaMotion(3)
            data2.interval = 2000
            list.add(data2)
            val data3 = GestureData()
            data3.antennalight = AntennaLight("on", getRandomIndex(9))
            //        data3.setSoundEffects(new Sound(""));
            data3.interval = 2000
            list.add(data3)

            return list
        }

        val allHour: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val allHourFace = arrayOf(
                    "h0064",
                    "h0065",
                    "h0066",
                    "h0067",
                    "h0068",
                    "h0069",
                    "h0070",
                    "h0071",
                    "h0072",
                    "h0073",
                    "h0074",
                    "h0075"
                )
                for (i in allHourFace.indices) {
                    list.addAll(hourGestureDataWithName(allHourFace[i]))
                }
                return list
            }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        fun test_GestureData1(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            //        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_ANGRY));
            data.footAction = Motion(15)
            data.interval = 3000
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            list.add(data)

            //TODO 待添加
            return list
        }

        fun test_GestureData2(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            //        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_SAD));
            data.footAction = Motion(16)
            data.interval = 3000
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN
            )
            list.add(data)

            //TODO 待添加
            return list
        }

        fun test_GestureData3(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0001")
            data.footAction = Motion(14)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE
            )
            data.interval = 3000
            list.add(data)

            //TODO 待添加
            return list
        }

        fun test_GestureData4(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("55wronged")
            data.footAction = Motion(13)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_ORANGE
            )
            data.interval = 3000
            //        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
            list.add(data)

            //TODO 待添加
            return list
        }

        fun test_GestureData5(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            //        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_BORED));
            data.footAction = Motion(10)
            data.interval = 3000
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_WHITE
            )
            //        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
            list.add(data)

            //TODO 待添加
            return list
        }


        fun test_GestureData6(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            //        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_EXCITING));
            data.footAction = Motion(9)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_YELLOW
            )
            data.interval = 3000
            //        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
            list.add(data)

            //TODO 待添加
            return list
        }

        fun test_GestureData7(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0010")
            data.footAction = Motion(26)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_PURPLE
            )
            data.interval = 3000
            //        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
            list.add(data)

            //TODO 待添加
            return list
        }

        fun test_GestureData8(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            //        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_LOSE));
            data.footAction = Motion(25)
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_CYAN
            )
            data.interval = 3000
            //        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
            list.add(data)

            //TODO 待添加
            return list
        }

        fun test_GestureData0(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0027")
            data.footAction = Motion(17)
            data.interval = 2000
            data.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK
            )
            //        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
            list.add(data)

            //TODO 待添加
            return list
        }


        private fun initStatusLight(lightStatusList: ArrayList<AntennaLight>): ArrayList<AntennaLight> {
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
                )
            )
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN
                )
            )
            return lightStatusList
        }

        private fun initEarList(earList: ArrayList<AntennaMotion?>): ArrayList<AntennaMotion?> {
            earList.add(AntennaMotion(3))
            earList.add(null)
            return earList
        }

        private fun intLightList(lightStatusList: ArrayList<AntennaLight>): ArrayList<AntennaLight> {
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
                )
            )
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN
                )
            )
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE
                )
            )
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_ORANGE
                )
            )
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_WHITE
                )
            )
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_YELLOW
                )
            )
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_PURPLE
                )
            )
            lightStatusList.add(
                AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_CYAN
                )
            )
            return lightStatusList
        }

        //Done
        private fun initMotionList(motionList: ArrayList<Motion?>): ArrayList<Motion?> {
            motionList.add(Motion(19))
            motionList.add(Motion(18))
            motionList.add(Motion(20))
            motionList.add(Motion(9))
            motionList.add(Motion(10))
            return motionList
        }

        //Done 找人前
        private fun initMotionList2(motionList: ArrayList<Motion?>): ArrayList<Motion?> {
            motionList.add(Motion(29))
            motionList.add(Motion(30))
            motionList.add(Motion(31))
            motionList.add(Motion(19))
            motionList.add(Motion(25))
            motionList.add(Motion(18))
            return motionList
        }

        //Done random
        private fun initMotionList3(motionList: ArrayList<Motion?>): ArrayList<Motion?> {
            motionList.add(Motion(34))
            motionList.add(Motion(54))
            motionList.add(Motion(48))
            motionList.add(Motion(49))
            motionList.add(Motion(50))
            motionList.add(Motion(31))
            motionList.add(Motion(32))

            return motionList
        }

        //Done
        private fun initMotionList4(motionList: ArrayList<Motion>): ArrayList<Motion> {
            motionList.add(Motion(39))
            motionList.add(Motion(40))
            motionList.add(Motion(41))
            motionList.add(Motion(42))
            motionList.add(Motion(31))
            return motionList
        }

        //Done
        private fun initSoundList(soundList: ArrayList<Sound>): ArrayList<Sound> {
            soundList.add(Sound("a0084"))
            soundList.add(Sound("a0051"))
            soundList.add(Sound("a0070"))
            soundList.add(Sound("a0039"))
            soundList.add(Sound("a0098"))
            return soundList
        }


        private fun initExpression1(expressionList: ArrayList<Face?>): ArrayList<Face?> {
//        expressionList.add(new Face(MCUCommandConsts.COMMAND_VALUE_EXCITING));
            expressionList.add(Face("h0033"))
            expressionList.add(Face("h0015"))
            expressionList.add(Face("h0041"))
            expressionList.add(Face("h0030"))


            return expressionList
        }

        private fun initExpression2(expressionList: ArrayList<Face?>): ArrayList<Face?> {
            expressionList.add(Face("h0021"))
            expressionList.add(Face("h0011"))
            expressionList.add(Face("h0017"))
            expressionList.add(Face("h0044"))

            return expressionList
        }

        private fun initExpression3(expressionList: ArrayList<Face?>): ArrayList<Face?> {
            expressionList.add(Face("h0044"))
            expressionList.add(Face("h0042"))
            expressionList.add(Face("h0025"))
            expressionList.add(Face("h0024"))
            expressionList.add(Face("h0019"))

            return expressionList
        }

        private fun getRandomFoot(random: Random, motionList: ArrayList<Motion?>): Motion? {
            val randNum = random.nextInt(motionList.size)
            val motion = motionList[randNum]
            return motionList[randNum]
        }

        private fun getRandomSoundEffect(random: Random, soundList: ArrayList<Sound>): Sound {
            val randNum = random.nextInt(soundList.size)
            return soundList[randNum]
        }

        private fun getRandomExpression(random: Random, expressionList: ArrayList<Face?>): Face? {
            val randNum = random.nextInt(expressionList.size)
            return expressionList[randNum]
        }


        private fun getRandomLight(
            random: Random,
            lightList: ArrayList<AntennaLight>
        ): AntennaLight {
            val randNum = random.nextInt(lightList.size)
            return lightList[randNum]
        }

        private fun getRandomEarList(
            random: Random,
            earList: ArrayList<AntennaMotion?>
        ): AntennaMotion? {
            val randNum = random.nextInt(earList.size)
            return earList[randNum]
        }

        val randomGesture: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val random = Random()
                var expressionList =
                    ArrayList<Face?>()
                var soundList = ArrayList<Sound>()
                var motionList =
                    ArrayList<Motion?>()
                var lightList =
                    ArrayList<AntennaLight>()
                val earList =
                    ArrayList<AntennaMotion?>()
                var lightStatusList =
                    ArrayList<AntennaLight>()

                earList.add(AntennaMotion(3))
                earList.add(null)
                expressionList = initExpression1(expressionList)
                motionList = initMotionList3(motionList)
                soundList = initSoundList(soundList)
                lightList = intLightList(lightList)

                lightStatusList = initStatusLight(lightStatusList)

                val data = GestureData()
                data.expression = getRandomExpression(
                    random,
                    expressionList
                )
                data.footAction = getRandomFoot(random, motionList)
                data.antennalight = getRandomLight(random, lightList)
                data.soundEffects = getRandomSoundEffect(
                    random,
                    soundList
                )
                data.earAction = getRandomEarList(random, earList)
                data.interval = 2500
                list.add(data)
                return list
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
                    AntennaLight("on", getRandomIndex(9) + 1)
                return antennaLight
            }

        private val randomAntennaMotion: AntennaMotion
            get() {
                val antennaMotion =
                    AntennaMotion(getRandomIndex(3) + 1)
                return antennaMotion
            }

        fun youPinGestures(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData10 = GestureData()
            gestureData10.ttsInfo =
                Tts("wow~小米的朋友们，大家好，我是乐天派桌面机器人！很高兴认识你们！")
            gestureData10.interval = 1000

            val gestureData11 = GestureData()
            gestureData11.expression = Face(
                getRandomString(
                    arrayOf(
                        "h0015",
                        "h0058"
                    )
                )
            )
            gestureData11.footAction =
                Motion("null", 25, 2)
            gestureData11.antennalight = randomAntennaLight
            gestureData11.interval = 3000

            val gestureData12 = GestureData()
            gestureData12.footAction =
                Motion("null", 26, 2)
            gestureData12.antennalight = randomAntennaLight
            gestureData12.interval = 4000


            val gestureData20 = GestureData()
            gestureData20.ttsInfo =
                Tts("这还是我第一次离开乐天派的办公室,见到这么多的好朋友，有点害羞~")
            gestureData20.interval = 500

            val gestureData21 = GestureData()
            gestureData21.expression = Face("h0027")
            gestureData21.footAction =
                Motion("null", 59, 5)
            gestureData21.interval = 2500

            val gestureData22 = GestureData()
            gestureData22.expression = Face("h0049")
            gestureData22.footAction =
                Motion("null", 50, 1)
            gestureData22.soundEffects = Sound("a0023")
            gestureData22.interval = 2000

            val gestureData40 = GestureData()
            gestureData40.ttsInfo = Tts("我能歌善舞")
            gestureData40.expression = Face("h0036")
            gestureData40.footAction = Motion(9)
            gestureData40.soundEffects = Sound("a0030")
            gestureData40.earAction = AntennaMotion(3)
            gestureData40.antennalight = randomAntennaLight
            gestureData40.interval = 1000

            val gestureData41 = GestureData()
            gestureData41.expression = Face("h0043")
            gestureData41.footAction = Motion(10)
            gestureData41.antennalight = randomAntennaLight
            gestureData41.interval = 1000

            val gestureData42 = GestureData()
            gestureData42.expression = Face(
                getRandomString(
                    arrayOf(
                        "h0044",
                        "h0045"
                    )
                )
            )
            gestureData42.footAction =
                Motion("null", 23, 3)
            gestureData42.soundEffects = Sound("a0051")
            gestureData42.earAction = AntennaMotion(3)
            gestureData42.antennalight = randomAntennaLight
            gestureData42.interval = 1000


            val gestureData50 = GestureData()
            gestureData50.ttsInfo = Tts("我可以提醒你的日程")
            gestureData50.expression = Face("h0046")
            gestureData50.footAction =
                Motion("null", 24, 2)
            gestureData50.antennalight = randomAntennaLight
            gestureData50.interval = 2500

            val gestureData51 = GestureData()
            gestureData51.ttsInfo = Tts("欣然姐，今天我们有约会哦")
            gestureData51.expression = Face("h0008")
            gestureData51.footAction =
                Motion("null", 17, 3)
            gestureData51.soundEffects = Sound("a0029")
            gestureData51.interval = 3000

            val gestureData52 = GestureData()
            gestureData52.ttsInfo = Tts("不见不散")
            gestureData52.expression = Face("h0006")
            gestureData52.footAction =
                Motion("null", 63, 1)
            gestureData52.interval = 2000


            val gestureData60 = GestureData()
            gestureData60.ttsInfo = Tts("如果你不喜欢我")
            gestureData60.expression = Face(
                getRandomString(
                    arrayOf(
                        "h0010",
                        "h0054"
                    )
                )
            )
            //        gestureData60.setFootAction(new Motion(getRandomMotion(new int[]{19, 33})));
            gestureData60.soundEffects = Sound("a0053")
            gestureData60.antennalight = AntennaLight("on", 7)
            gestureData60.interval = 1000

            val gestureData61 = GestureData()
            gestureData61.ttsInfo = Tts("我会有点伤心")
            gestureData61.expression = Face("h0052")
            gestureData61.footAction =
                Motion("null", 28, 3)
            gestureData61.soundEffects = Sound("a0020")
            gestureData61.interval = 2500

            val gestureData62 = GestureData()
            gestureData62.ttsInfo = Tts("但是你可以摸摸我的头安慰我")
            gestureData62.expression = Face("h0036")
            gestureData62.footAction = Motion(34)
            gestureData62.soundEffects = Sound("a0030")
            gestureData62.interval = 3000


            val gestureData70 = GestureData()
            gestureData70.ttsInfo = Tts("除此之外，我还能做好多事情")
            gestureData70.interval = 300
            val gestureData71 = GestureData()
            gestureData71.expression = Face("h0031")
            gestureData71.footAction =
                Motion("null", 17, 2)
            gestureData71.antennalight = randomAntennaLight
            gestureData71.interval = 2700

            val gestureData100 = GestureData()
            gestureData100.ttsInfo = Tts("我还可以陪你过生日")
            gestureData100.expression = Face("h0015")
            gestureData100.interval = 1500

            val gestureData101 = GestureData()
            gestureData101.expression = Face("h0087")
            gestureData101.footAction =
                Motion("null", 50, 5)
            val antennaMotion1 = AntennaMotion(3)
            antennaMotion1.speed = 600
            antennaMotion1.step = 3
            gestureData101.earAction = antennaMotion1
            gestureData101.antennalight = randomAntennaLight
            gestureData101.interval = 5000

            val gestureData110 = GestureData()
            gestureData110.ttsInfo = Tts("还有很多")
            gestureData110.expression = Face("h0015")
            gestureData110.interval = 1000

            val gestureData111 = GestureData()
            gestureData111.expression = Face("h0068")
            gestureData111.interval = 800

            val gestureData1111 = GestureData()
            gestureData1111.footAction =
                Motion("null", 20, 3)
            gestureData1111.interval = 4000

            val gestureData112 = GestureData()
            gestureData112.footAction =
                Motion("null", 44, 6)
            gestureData112.expression = Face("h0074")
            gestureData112.antennalight = randomAntennaLight
            gestureData112.interval = 3000

            val gestureData113 = GestureData()
            gestureData113.expression = Face("h0070")
            gestureData113.interval = 3000

            //        GestureData gestureData120 = new GestureData();
//        gestureData120.setTtsInfo(new Tts("包括，如果你们不理我的时候，我还可以自己玩自己……"));
//        gestureData120.setInterval(5000);
            val gestureData130 = GestureData()
            gestureData130.ttsInfo = Tts("我这么可爱，小哥哥小姐姐快让我的立项会顺利通过吧")
            gestureData130.expression = Face("h0002")
            gestureData130.footAction =
                Motion("null", 59, 2)
            gestureData130.soundEffects = Sound("a0032")
            gestureData130.antennalight = randomAntennaLight
            gestureData130.earAction = AntennaMotion(3)
            gestureData130.interval = 4000

            val gestureData131 = GestureData()
            gestureData131.expression = Face("h0075")
            gestureData131.interval = 200


            val gestureData132 = GestureData()
            gestureData132.ttsInfo = Tts("让更多的好朋友把我带回家")
            gestureData132.footAction = Motion(63)
            gestureData132.interval = 2000


            val gestureData140 = GestureData()
            gestureData140.ttsInfo = Tts("希望你们喜欢我，谢谢！")
            gestureData140.expression = Face("h0027")
            gestureData140.soundEffects = Sound("a0094")
            gestureData140.antennalight = randomAntennaLight
            gestureData140.interval = 3000

            val gestureData141 = GestureData()
            gestureData141.footAction = Motion(11)
            gestureData141.interval = 1500

            val gestureData142 = GestureData()
            gestureData142.footAction = Motion(0)
            gestureData142.expression = Face("h0019")
            gestureData142.interval = 2000

            list.add(gestureData10)
            list.add(gestureData11)
            list.add(gestureData12)
            list.add(gestureData20)
            list.add(gestureData21)
            list.add(gestureData22)
            list.add(gestureData40)
            list.add(gestureData41)
            list.add(gestureData42)
            list.add(gestureData50)
            list.add(gestureData51)
            list.add(gestureData52)
            list.add(gestureData60)
            list.add(gestureData61)
            list.add(gestureData62)
            list.add(gestureData70)
            list.add(gestureData71)
            list.add(gestureData100)
            list.add(gestureData101)
            list.add(gestureData110)
            list.add(gestureData111)
            list.add(gestureData1111)
            list.add(gestureData112)
            list.add(gestureData113)
            list.add(gestureData130)
            list.add(gestureData131)
            list.add(gestureData132)
            list.add(gestureData140)
            list.add(gestureData141)
            list.add(gestureData142)

            return list
        }

        val allRandom: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(
                        arrayOf(
                            "h0001",
                            "h0002",
                            "h0003",
                            "h0004",
                            "h0005",
                            "h0006",
                            "h0007",
                            "h0008",
                            "h0009",
                            "h0010",
                            "h0011",
                            "h0012",
                            "h0013",
                            "h0014",
                            "h0015",
                            "h0016",
                            "h0017",
                            "h0018",
                            "h0019",
                            "h0020"
                        )
                    )
                )
                gestureData.soundEffects = Sound(
                    getRandomString(
                        arrayOf(
                            "a0001",
                            "a0002",
                            "a0003",
                            "a0004",
                            "a0005",
                            "a0006",
                            "a0007",
                            "a0008",
                            "a0009",
                            "a0010",
                            "a0011",
                            "a0012",
                            "a0013",
                            "a0014",
                            "a0015",
                            "a0016",
                            "a0017",
                            "a0018",
                            "a0019",
                            "a0020"
                        )
                    )
                )
                gestureData.footAction = Motion(
                    getRandomMotion(
                        intArrayOf(
                            1,
                            2,
                            3,
                            4,
                            5,
                            6,
                            7,
                            8,
                            9,
                            10,
                            11,
                            12,
                            13,
                            14,
                            15,
                            16,
                            17,
                            18,
                            19,
                            20
                        )
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2, 3)
                    )
                )
                gestureData.interval = 1000
                list.add(gestureData)
                return list
            }

        val newRobotGesture: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(
                        arrayOf(
                            "h0057",
                            "h0058",
                            "h0059",
                            "h0060",
                            "h0061",
                            "h0135",
                            "h0136",
                            "h0137",
                            "h0138",
                            "h0139",
                            "h0140",
                            "h0141",
                            "h0142",
                            "h0143",
                            "h0144",
                            "h0145",
                            "h0146",
                            "h0147",
                            "h0148",
                            "h0149",
                            "h0150",
                            "h0151"
                        )
                    )
                )
                val stepNum = getRandomIndex(5) + 1
                val m =
                    Motion(
                        "null",
                        getRandomMotion(
                            intArrayOf(
                                25,
                                26,
                                68,
                                21,
                                22,
                                63,
                                64
                            )
                        ),
                        stepNum
                    )
                m.speed = getRandomMotion(intArrayOf(1, 2))
                gestureData.footAction = m
                gestureData.soundEffects = Sound(
                    getRandomString(
                        arrayOf(
                            "a0012",
                            "a0013",
                            "a0014",
                            "a0015",
                            "a0112",
                            "a0113",
                            "a0114",
                            "a0115",
                            "a0212",
                            "a0213",
                            "a0214",
                            "a0215",
                        )
                    )
                )
                gestureData.interval = (2000 + 1000 * stepNum).toLong()
                list.add(gestureData)
                return list
            }

        /**
         * 睡眠模式
         *
         * @return
         */
        fun goToSleepGesture(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face("h0039")
            gestureData.interval = 10000
            list.add(gestureData)
            return list
        }

        /**
         * 冬眠模式
         *
         * @return
         */
        fun goToHibernationGesture(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.expression = Face("h0039")
            gestureData.interval = 11000

            val gestureData1 = GestureData()
            gestureData1.expression = Face("h0097")
            gestureData1.interval = 4000
            list.add(gestureData)
            list.add(gestureData1)
            return list
        }

        /**
         * 冬眠模式
         *
         * @return
         */
        fun goToHibernationGesture1(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.interval = 8000
            gestureData.soundEffects = Sound("a0077")
            list.add(gestureData)
            return list
        }

        /**
         * 冬眠模式
         *
         * @return
         */
        fun stopHibernationGesture(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            gestureData.interval = 500
            gestureData.soundEffects = Sound("stop")
            list.add(gestureData)
            return list
        }

        val wakeupGesture: ArrayList<GestureData>
            /**
             * 思必驰唤醒
             *
             * @return
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0180")
                gestureData.footAction = Motion(
                    getRandomMotion(
                        intArrayOf(
                            25,
                            26,
                            46,
                            47,
                            49
                        )
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 1000
                list.add(gestureData)
                return list
            }

        val vadBeginGesture: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0347")
                //        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 46, 47, 49})));
//        gestureData.setAntennalight(getRandomAntennaLight());
//        gestureData.setInterval(1000);
                list.add(gestureData)
                return list
            }

        val understandGesture: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0181")
                gestureData.footAction = Motion(
                    getRandomMotion(
                        intArrayOf(
                            25,
                            26,
                            46,
                            47,
                            49
                        )
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 1000
                list.add(gestureData)
                return list
            }

        val wakeupFennuGesture: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0001")
                gestureData.footAction = Motion(
                    getRandomMotion(
                        intArrayOf(
                            25,
                            26,
                            46,
                            47,
                            49
                        )
                    )
                )
                gestureData.earAction = randomAntennaMotion
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 1000
                list.add(gestureData)
                return list
            }

        val firstSpeakingGesture: ArrayList<GestureData>
            /**
             * 思必驰说的时候
             *
             * @return
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0352")
                gestureData.footAction = Motion(
                    getRandomMotion(
                        intArrayOf(
                            25,
                            26,
                            28,
                            55,
                            56
                        )
                    )
                )
                gestureData.antennalight = randomAntennaLight
                if (getRandomIndex(10) % 6 == 0) {
                    gestureData.earAction = randomAntennaMotion
                }
                gestureData.interval = 1000
                list.add(gestureData)
                return list
            }

        val speakingGesture: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0292")
                //        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 51, 52, 55, 56})));
//        gestureData.setAntennalight(getRandomAntennaLight());
//        if (getRandomIndex(10) % 6 == 0) {
//            gestureData.setEarAction(getRandomAntennaMotion());
//        }
//        gestureData.setInterval(1000);
                list.add(gestureData)
                return list
            }

        val speakingWithAIGesture: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0346")
                gestureData.footAction = Motion(
                    getRandomMotion(
                        intArrayOf(
                            25,
                            26,
                            28,
                            55,
                            56
                        )
                    )
                )
                gestureData.antennalight = randomAntennaLight
                if (getRandomIndex(10) % 6 == 0) {
                    gestureData.earAction = randomAntennaMotion
                }
                gestureData.interval = 1000
                list.add(gestureData)
                return list
            }

        /**
         * 听内容给chatgpt 的时候
         *
         * @return
         */
        fun getListenAiGesture(aiModel: Int): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            //        gestureData.setExpression(new Face(getRandomString(new String[]{"h0083", "h0084", "h0085", "h0086"})));
            if (aiModel == 0) {
                gestureData.expression = Face("h0184")
            } else if (aiModel == 1) {
                gestureData.expression = Face("h0185")
            } else if (aiModel == 2) {
                gestureData.expression = Face("h0233")
            }
            gestureData.footAction = Motion(
                getRandomMotion(intArrayOf(25, 26, 46, 47, 49))
            )
            gestureData.soundEffects = Sound("a0119")
            gestureData.antennalight = randomAntennaLight
            gestureData.interval = 1000
            list.add(gestureData)
            return list
        }

        fun getAiUnderstandGesture(aiModel: Int): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            if (aiModel == 0) {
                gestureData.expression = Face("h0183")
            } else if (aiModel == 1) {
                gestureData.expression = Face("h0186")
            } else if (aiModel == 2) {
                gestureData.expression = Face("h0228")
            }
            gestureData.footAction = Motion(
                getRandomMotion(intArrayOf(25, 26, 46, 47, 49))
            )
            gestureData.soundEffects = Sound("a0108")
            gestureData.antennalight = randomAntennaLight
            gestureData.interval = 500
            list.add(gestureData)
            return list
        }

        /**
         * chatgpt 说的时候
         *
         * @return
         */
        fun getSpeakingAiGesture(aiModel: Int): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val gestureData = GestureData()
            if (aiModel == 0) {
                gestureData.expression = Face("h0082")
            } else if (aiModel == 1) {
                gestureData.expression = Face("h0113")
            } else if (aiModel == 2) {
                gestureData.expression = Face("h0231")
            }
            gestureData.footAction = Motion(
                getRandomMotion(intArrayOf(25, 26, 46, 47, 49))
            )
            gestureData.antennalight = randomAntennaLight
            if (getRandomIndex(10) % 6 == 0) {
                gestureData.earAction = randomAntennaMotion
            }
            gestureData.interval = 500
            list.add(gestureData)
            return list
        }

        val normalGesture: GestureData
            /**
             * 回正的状态
             */
            get() {
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(arrayOf("h0025"))
                )
                gestureData.soundEffects = Sound("a0063")
                gestureData.interval = 1000
                return gestureData
            }

        val normalShoushiGesture: GestureData
            /**
             * 手势识别专用回正的状态
             */
            get() {
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(arrayOf("h0025"))
                )
                gestureData.soundEffects = Sound("a0063")
                gestureData.interval = 2000
                return gestureData
            }

        /**
         * 没有识别到手势
         *
         * @return
         */
        fun canNotRecGesture(): GestureData {
            val gestureData = GestureData()
            gestureData.expression = Face(
                getRandomString(arrayOf("h0017"))
            )
            gestureData.interval = 3000
            return gestureData
        }

        /**
         * 十帧未识别到表情
         */
        fun cannotReadFace(): GestureData {
            val gestureData = GestureData()
            gestureData.expression = Face(
                getRandomString(arrayOf("h0025"))
            )
            gestureData.soundEffects = Sound("a0108")
            gestureData.interval = 2000
            return gestureData
        }


        val normalGestureList: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(arrayOf("h0025"))
                )
                gestureData.interval = 1000
                list.add(gestureData)
                return list
            }


        val normalNoListGesture: GestureData
            get() {
                val gestureData = GestureData()
                gestureData.expression = Face("h0047")
                gestureData.interval = 2000
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


        private const val handId0 = "0"
        private const val handId1 = "1"
        private const val handId2 = "2"
        private const val handId3 = "3"
        private const val handId4 = "4"
        private const val handId5 = "5"
        private const val handId6 = "6"
        private const val handId7 = "7"
        private const val handId8 = "8"
        private const val handId9 = "9"
        private const val handId9_1 = "9.2"
        private const val handId9_3 = "9.3"
        private const val handId9_4 = "9.4"
        private const val handId10 = "10"
        private const val handId11 = "11"
        private const val handId12 = "12"


        /**
         * 通过手势id 获取姿态
         *
         * @param handId
         * @return
         */
        fun getHandGestureWithID(handId: String): ArrayList<GestureData> {
            val gestureData = GestureData()
            val list = ArrayList<GestureData>()

            when (handId) {
                "0.0" -> list.add(HandsGestureCenter.okGesture)
                "1.0" -> list.add(HandsGestureCenter.zanGesture)
                "2.0" -> list.add(HandsGestureCenter.fistGesture)
                "3.0" -> list.add(HandsGestureCenter.yeahGesture)
                "4.0" -> list.add(HandsGestureCenter.shuZi5Gesture)
                "5.0" -> list.add(HandsGestureCenter.gunGesture)
                "6.0" -> list.add(HandsGestureCenter.threeGesture)
                "7.0" -> list.add(HandsGestureCenter.fourGesture)
                "8.0" -> list.add(HandsGestureCenter.sixGesture)
                "9.1" -> list.add(HandsGestureCenter.upGesture)
                "9.2" -> list.add(HandsGestureCenter.downGesture)
                "9.3" -> list.add(HandsGestureCenter.leftGesture)
                "9.4" -> list.add(HandsGestureCenter.rightGesture)
                "10.0" -> list.add(HandsGestureCenter.loveGesture)
                "11.0" -> list.add(HandsGestureCenter.rockGesture)
                "12.0" -> {
                    list.add(HandsGestureCenter.handHeartGesture)
                    list.add(HandsGestureCenter.shuZi1Gesture)
                    list.add(HandsGestureCenter.qiDaoGesture)
                    list.add(HandsGestureCenter.zuoYiGesture)
                    list.add(HandsGestureCenter.zuoBieGesture)
                }

                "13.0" -> {
                    list.add(HandsGestureCenter.shuZi1Gesture)
                    list.add(HandsGestureCenter.qiDaoGesture)
                    list.add(HandsGestureCenter.zuoYiGesture)
                    list.add(HandsGestureCenter.zuoBieGesture)
                }

                "14.0" -> {
                    list.add(HandsGestureCenter.qiDaoGesture)
                    list.add(HandsGestureCenter.zuoYiGesture)
                    list.add(HandsGestureCenter.zuoBieGesture)
                }

                "15.0" -> {
                    list.add(HandsGestureCenter.zuoYiGesture)
                    list.add(HandsGestureCenter.zuoBieGesture)
                }

                "16.0" -> list.add(HandsGestureCenter.zuoBieGesture)
                "17.0" -> list.add(HandsGestureCenter.dissGesture)
                "18.0" -> list.add(HandsGestureCenter.dissGesture)
                "19.0" -> list.add(HandsGestureCenter.shuangShouHeart1Gesture)
                "20.0" -> list.add(HandsGestureCenter.shuangShouHeart2Gesture)
                "21.0" -> list.add(HandsGestureCenter.shuangShouHeart3Gesture)
                "22.0" -> list.add(HandsGestureCenter.shuZi7Gesture)
                "23.0" -> list.add(HandsGestureCenter.shuZi8Gesture)
                "24.0" -> {
                    list.add(HandsGestureCenter.shuZi9Gesture)
                    list.add(HandsGestureCenter.zuoBieGesture)
                }

                "25.0" -> list.add(HandsGestureCenter.zuoBieGesture)
                "99.0" -> {
                    list.add(HandsGestureCenter.decreaseGesture)
                    list.add(HandsGestureCenter.increaseGesture)
                    list.add(HandsGestureCenter.firstEnter())
                    list.add(HandsGestureCenter.yeahGesture)
                }

                "100.0" -> {
                    list.add(HandsGestureCenter.increaseGesture)
                    list.add(HandsGestureCenter.firstEnter())
                    list.add(HandsGestureCenter.yeahGesture)
                }

                "101.0" -> {
                    list.add(HandsGestureCenter.firstEnter())
                    list.add(HandsGestureCenter.yeahGesture)
                }

                else -> list.add(HandsGestureCenter.yeahGesture)
            }
            return list
        }

        val fingerGuessGesture: ArrayList<GestureData>
            /**
             * 进入猜拳游戏动画
             *
             * @return
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                //        gestureData.setExpression(new Face(getRandomString(new String[]{"h0088", "h0089", "h0090", "h0091"})));
                gestureData.expression = Face("h0093")
                val motion =
                    Motion()
                motion.number = 59
                motion.stepNum = 2
                gestureData.footAction = motion
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 6000L
                list.add(gestureData)
                return list
            }

        val noListFingerGuessGesture: GestureData
            get() {
                val gestureData = GestureData()
                //        gestureData.setExpression(new Face(getRandomString(new String[]{"h0088", "h0089", "h0090", "h0091"})));
                gestureData.expression = Face("h0093")
                val motion =
                    Motion()
                motion.number = 23
                gestureData.footAction = motion
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
                )
                gestureData.interval = 6000L
                return gestureData
            }

        val aIDonghuaGesture: GestureData
            /**
             * 开始识别手势
             *
             * @return
             */
            get() {
                val gestureData = GestureData()
                //        gestureData.setExpression(new Face(getRandomString(new String[]{"h0088", "h0089", "h0090", "h0091"})));
                gestureData.expression = Face("h0310")
                gestureData.soundEffects = Sound("a0063")
                val motion =
                    Motion()
                motion.number = 23
                gestureData.footAction = motion
                //        gestureData.setSoundEffects(new Sound("a0028"));
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
                )
                gestureData.interval = 4000L
                return gestureData
            }

        val canNotGetGesture: GestureData
            /**
             * 识别不到手势或者识别为空
             *
             * @return
             */
            get() {
                val gestureData = GestureData()
                //        gestureData.setExpression(new Face(getRandomString(new String[]{"h0088", "h0089", "h0090", "h0091"})));
                gestureData.expression = Face("h0017")
                gestureData.soundEffects = Sound("a0087")
                val motion =
                    Motion()
                //        motion.setNumber(23);
                gestureData.footAction = motion
                //        gestureData.setSoundEffects(new Sound("a0028"));
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = AntennaLight(
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                    MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
                )
                gestureData.interval = 4000L
                return gestureData
            }

        /**
         * 退出猜拳游戏
         *
         * @return
         */
        fun quitFingerGame(): GestureData {
            val gestureData = GestureData()
            gestureData.expression = Face("h0291")
            val motion = Motion()
            motion.number = 0
            gestureData.footAction = motion
            gestureData.antennalight = AntennaLight(
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF,
                MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED
            )
            gestureData.interval = 5000L
            return gestureData
        }

        val fingerGuessResultGesture: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(
                        arrayOf(
                            "h0094",
                            "h0095",
                            "h0096"
                        )
                    )
                )
                gestureData.footAction = Motion(
                    getRandomMotion(intArrayOf(59))
                )
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 1000L
                list.add(gestureData)
                return list
            }


        val h0094List: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0094")
                gestureData.footAction = Motion(
                    getRandomMotion(intArrayOf(59))
                )
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 1000L
                list.add(gestureData)
                return list
            }

        val h0095List: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0095")
                gestureData.footAction = Motion(
                    getRandomMotion(intArrayOf(59))
                )
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 1000L
                list.add(gestureData)
                return list
            }

        val h0096List: ArrayList<GestureData>
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0096")
                gestureData.footAction = Motion(
                    getRandomMotion(intArrayOf(59))
                )
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 1000L
                list.add(gestureData)
                return list
            }

        val h0094: GestureData
            get() {
                val gestureData = GestureData()
                gestureData.expression = Face("h0094")
                gestureData.footAction = Motion(
                    getRandomMotion(intArrayOf(59))
                )
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 2000L
                return gestureData
            }

        val h0095: GestureData
            get() {
                val gestureData = GestureData()
                gestureData.expression = Face("h0095")
                gestureData.footAction = Motion(
                    getRandomMotion(intArrayOf(59))
                )
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 2000L
                return gestureData
            }

        val h0096: GestureData
            get() {
                val gestureData = GestureData()
                gestureData.expression = Face("h0096")
                gestureData.footAction = Motion(
                    getRandomMotion(intArrayOf(59))
                )
                gestureData.soundEffects = Sound("a0028")
                gestureData.earAction = AntennaMotion(
                    getRandomMotion(
                        intArrayOf(1, 2)
                    )
                )
                gestureData.antennalight = randomAntennaLight
                gestureData.interval = 2000L
                return gestureData
            }

        val specialCommandGesture: ArrayList<GestureData>
            /**
             * 任务指令，比如向前走三步
             * 同时还要执行相应的动作，动作不在此执行
             *
             * @return
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(
                        arrayOf(
                            "h0019",
                            "h0025",
                            "h0030",
                            "h0031"
                        )
                    )
                )
                list.add(gestureData)
                return list
            }

        val sadGesture: ArrayList<GestureData>
            /**
             * 负向的情绪
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
                            "h0010",
                            "h0021",
                            "h0022",
                            "h0023",
                            "h0039"
                        )
                    )
                )
                gestureData.soundEffects = Sound(
                    getRandomString(
                        arrayOf(
                            "a0089",
                            "a0133"
                        )
                    )
                )
                gestureData.footAction = Motion(
                    getRandomMotion(
                        intArrayOf(
                            9,
                            10,
                            18,
                            19,
                            29,
                            30,
                            63
                        )
                    )
                )
                gestureData.interval = 2000
                list.add(gestureData)
                return list
            }

        val happyGesture: ArrayList<GestureData>
            /**
             * 正向的情绪
             *
             * @return
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face(
                    getRandomString(
                        arrayOf(
                            "h0006",
                            "h0020",
                            "h0047",
                            "h0048",
                            "h0049",
                            "h0057"
                        )
                    )
                )
                gestureData.soundEffects = Sound(
                    getRandomString(
                        arrayOf(
                            "a0051",
                            "a0092",
                            "a0095",
                            "a0115"
                        )
                    )
                )
                gestureData.footAction = Motion(
                    getRandomMotion(
                        intArrayOf(
                            5,
                            6,
                            17,
                            18,
                            43,
                            59,
                            62,
                            65,
                            66,
                            67,
                            68
                        )
                    )
                )
                gestureData.earAction = randomAntennaMotion
                gestureData.interval = 2000
                list.add(gestureData)
                return list
            }

        fun danceMusicGesture(): ArrayList<GestureData> {
            val list: ArrayList<GestureData> = ArrayList()
            val gestureData = GestureData()
            gestureData.footAction = Motion(
                getRandomMotion(
                    intArrayOf(
                        5,
                        6,
                        55,
                        56,
                        7,
                        8,
                        24,
                        28,
                        46,
                        47,
                        59,
                        60
                    )
                )
            )
            gestureData.expression = Face(
                getRandomString(
                    arrayOf(
                        "h0006",
                        "h0007",
                        "h0020",
                        "h0037",
                        "h0042",
                        "h0043",
                        "h0044",
                        "h0058"
                    )
                )
            )
            //        gestureData.setEarAction(getRandomAntennaMotion());
            gestureData.antennalight = randomAntennaLight
            gestureData.interval = 1500

            val gestureData1 = GestureData()
            gestureData1.footAction = Motion(27, 10, 3)
            gestureData1.expression = Face("h0134")
            gestureData1.interval = (10 * 1000).toLong()

            val gestureData11 = GestureData()
            gestureData11.footAction = Motion(7, 3, 2)
            gestureData11.interval = (5 * 1000).toLong()
            val gestureData111 = GestureData()
            gestureData111.footAction = Motion(8, 3, 2)
            gestureData111.interval = (5 * 1000).toLong()
            val gestureData12 = GestureData()
            gestureData12.footAction = Motion(1, 2, 3)
            gestureData12.interval = (4 * 1000).toLong()

            val gestureData13 = GestureData()
            gestureData13.footAction = Motion(2, 2, 3)
            gestureData13.interval = (4 * 1000).toLong()

            val gestureData2 = GestureData()
            gestureData2.footAction = Motion(19, 10, 1)
            gestureData2.interval = (4 * 1000).toLong()

            val gestureData5 = GestureData()
            gestureData5.footAction = Motion(79, 10, 2)
            gestureData5.interval = (10 * 1000).toLong()

            val gestureData6 = GestureData()
            gestureData6.footAction = Motion(9, 5, 1)
            gestureData6.interval = (3 * 1000).toLong()
            val gestureData7 = GestureData()
            gestureData7.footAction = Motion(10, 5, 1)
            gestureData7.interval = (3 * 1000).toLong()
            val gestureData8 = GestureData()
            gestureData8.footAction = Motion(80, 10, 6)
            gestureData8.interval = (8 * 1000).toLong()


            //        list.add(gestureData);
            list.add(gestureData1)
            list.add(gestureData11)
            list.add(gestureData111)
            list.add(gestureData12)
            list.add(gestureData13)
            list.add(gestureData2)
            //        list.add(gestureData3);
//        list.add(gestureData4);
            list.add(gestureData5)
            list.add(gestureData6)
            list.add(gestureData7)
            list.add(gestureData8)
            return list
        }


        fun miSayHello(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.ttsInfo = Tts("主人回来啦，快来有人陪我玩了")
            data.expression = Face("h0006")
            data.footAction = Motion(63)
            data.antennalight = randomAntennaLight
            data.interval = 3000
            list.add(data)
            return list
        }

        fun miFeelCold(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val ttsGt = GestureData()
            ttsGt.ttsInfo = Tts("shutdown")

            val data = GestureData()
            data.ttsInfo = Tts("有点冷，冻死我啦，快把空调打开")
            data.expression = Face("h0051")
            data.footAction = Motion(18)
            data.soundEffects = Sound("a0068")
            data.antennalight = AntennaLight("on", 8)
            data.interval = 3000

            val data1 = GestureData()
            data1.footAction = Motion(28)
            data1.interval = 2000
            list.add(ttsGt)
            list.add(data)
            list.add(data1)
            return list
        }

        fun miFeelHot(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val ttsGt = GestureData()
            ttsGt.ttsInfo = Tts("shutdown")

            val data = GestureData()
            data.ttsInfo = Tts("天气好热呀，快帮我降温")
            data.expression = Face("h0099")
            data.footAction = Motion(18)
            data.soundEffects = Sound("a0115")
            data.antennalight = AntennaLight("on", 1)
            data.interval = 3000

            val data1 = GestureData()
            data1.footAction = Motion(28)
            data1.interval = 2000
            list.add(ttsGt)
            list.add(data)
            list.add(data1)
            return list
        }

        fun miSleepMode(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val ttsGt = GestureData()
            ttsGt.ttsInfo = Tts("shutdown")

            val data = GestureData()
            data.ttsInfo = Tts("主人晚安，做个好梦")
            data.expression = Face("h0055")
            data.interval = 3000
            list.add(data)
            list.add(ttsGt)
            return list
        }

        fun miCookingFinish(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val ttsGt = GestureData()
            ttsGt.ttsInfo = Tts("shutdown")

            val data = GestureData()
            data.ttsInfo = Tts("主人主人，快吃饭啦，吃饱饭才有力气和我玩～")
            data.expression = Face("h0100")
            data.footAction = Motion(63)
            data.soundEffects = Sound("a0017")
            data.antennalight = AntennaLight("on", 3)
            data.interval = 7000

            val data1 = GestureData()
            data1.footAction = Motion(2)
            data1.interval = 2000
            list.add(data1)
            list.add(data)
            list.add(ttsGt)
            return list
        }

        fun miGasAlarm(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0101")
            data.footAction = Motion("", 17, 5)
            data.earAction = AntennaMotion(3)
            data.soundEffects = Sound("a0015")
            data.antennalight = AntennaLight("on", 3)
            data.interval = 3000
            list.add(data)
            return list
        }

        fun miWaterAlarm(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0102")
            data.footAction = Motion("", 17, 5)
            data.earAction = AntennaMotion(3)
            data.soundEffects = Sound("a0015")
            data.antennalight = AntennaLight("on", 3)
            data.interval = 3000
            list.add(data)
            return list
        }

        fun miSmokeAlarm(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()
            val data = GestureData()
            data.expression = Face("h0103")
            data.footAction = Motion("", 17, 5)
            data.earAction = AntennaMotion(3)
            data.soundEffects = Sound("a0015")
            data.antennalight = AntennaLight("on", 3)
            data.interval = 3000
            list.add(data)
            return list
        }

        val lowBatteryNoticeGesture: ArrayList<GestureData>
            /**
             * 低电量展示
             *
             * @return
             */
            get() {
                val list = ArrayList<GestureData>()
                val gestureData = GestureData()
                gestureData.expression = Face("h0220")
                gestureData.interval = 3000
                list.add(gestureData)
                return list
            }

        /**
         * 健身提醒姿态
         *
         * @return
         */
        fun keepRemindGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()

            val data = GestureData()
            data.expression = Face("h0240")
            data.footAction = Motion("111", 18, 2)
            data.soundEffects = Sound("a0045")
            data.interval = 5500
            list.add(data)

            //TODO 待添加
            return list
        }

        /**
         * 喝水提醒姿态
         *
         * @return
         */
        fun waterRemindGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()

            val data = GestureData()
            data.expression = Face("h0238")
            data.soundEffects = Sound("a0010")
            data.interval = 5500
            list.add(data)

            //TODO 待添加
            return list
        }

        /**
         * 喝水提醒姿态
         *
         * @return
         */
        fun siteRemindGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()

            val data = GestureData()
            data.expression = Face("h0241")
            data.footAction = Motion("111", 23, 2)
            data.soundEffects = Sound("a0020")
            data.interval = 5500
            list.add(data)

            //TODO 待添加
            return list
        }

        /**
         * 久坐提醒
         *
         * @return
         */
        fun sedRemindGestureData(): ArrayList<GestureData> {
            val list = ArrayList<GestureData>()

            val data = GestureData()
            data.expression = Face("h0239")
            data.soundEffects = Sound("a0024")
            data.footAction = Motion("111", 58, 2)
            data.interval = 5500
            list.add(data)

            //TODO 待添加
            return list
        }
    }
}
