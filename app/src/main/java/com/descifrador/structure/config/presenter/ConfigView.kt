package com.descifrador.structure.config.presenter

import com.descifrador.structure.utils.base.BaseView

interface ConfigView : BaseView{

    fun onSetupViews()
    fun onError(throwable: Throwable)
    fun onConfigDataDelivered()
    fun onUserDataDelivered()
}