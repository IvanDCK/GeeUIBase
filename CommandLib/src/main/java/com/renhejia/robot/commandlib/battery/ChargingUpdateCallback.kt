package com.renhejia.robot.commandlib.battery

/**
 * Created by liujunbin
 */
class ChargingUpdateCallback private constructor() {
    var battery: Int = 0
        private set
    private val mChargingListenerList: MutableList<ChargingUpdateListener?> = ArrayList<ChargingUpdateListener?>()

    private object ChargingUpdateCallBackHolder {
        val instance: ChargingUpdateCallback = ChargingUpdateCallback()
    }

    interface ChargingUpdateListener {
        fun onChargingUpdateReceived(changingStatus: Boolean, percent: Int)
    }

    fun registerChargingStatusUpdateListener(listener: ChargingUpdateListener?) {
        if (mChargingListenerList != null) {
            mChargingListenerList.add(listener)
        }
    }

    fun unregisterChargingStatusUpdateListener(listener: ChargingUpdateListener?) {
        if (mChargingListenerList != null) {
            mChargingListenerList.remove(listener)
        }
    }


    fun setChargingStatus(changingStatus: Boolean, percent: Int) {
        this.battery = percent
        for (i in mChargingListenerList.indices) {
            if (mChargingListenerList[i] != null) {
                mChargingListenerList[i]!!.onChargingUpdateReceived(changingStatus, percent)
            }
        }
    }

    companion object {
        val instance: ChargingUpdateCallback
            get() = ChargingUpdateCallBackHolder.instance
    }
}
