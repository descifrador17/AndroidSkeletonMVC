package com.descifrador.structure.config.presenter

import com.descifrador.structure.model.manager.NetworkingInterface
import com.descifrador.structure.utils.base.BasePresenter

class ConfigPresenter(var configView:ConfigView, var networkingInterface: NetworkingInterface):BasePresenter(configView) {
    override fun onViewCreated(isLaunched: Boolean) {
        configView.onSetupViews()
        if (isLaunched) {
            fetchAppConfigData()
        }
    }

    /**
     * Fetch App Config Data.
     *
     */
    fun fetchAppConfigData() {
//        addSubscription(
//            networkingInterface.//TODO(NAME_OF_FUNCTION)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(this::onAppConfigDataDelivered, this::onError)
//        )
    }

    /**
     * API Response Handler
     *
     *
     */
    fun onAppConfigDataDelivered() {
        configView.onConfigDataDelivered()
    }


    /**
     * API error handler/
     *
     *
     */
    fun onError(throwable: Throwable) {
        configView.onError(throwable)
    }



}