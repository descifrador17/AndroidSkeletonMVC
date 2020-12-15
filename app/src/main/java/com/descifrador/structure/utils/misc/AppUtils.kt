package com.descifrador.structure.utils.misc

import android.view.View
import com.google.android.material.snackbar.Snackbar

object AppUtils {
    /**
     * Toast helper for
     *
     */
    fun messageHelper(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
    }

}