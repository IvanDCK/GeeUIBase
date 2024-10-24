package com.renhejia.robot.gesturefactory.manager

import android.content.Context

/**
 * 解析管理器
 * @author liujunbin
 */
class ParserManager(private val mContext: Context) {
    companion object {
        private var parserManager: ParserManager? = null

        fun getInstance(context: Context): ParserManager {
            if (parserManager == null) {
                synchronized(ParserManager::class.java) {
                    if (parserManager == null) {
                        parserManager = ParserManager(context)
                    }
                }
            }
            return parserManager!!
        }

        private fun getGestureById(gestureId: Int) {
        }
    }
}
