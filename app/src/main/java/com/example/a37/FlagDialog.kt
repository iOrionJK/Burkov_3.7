package com.example.a37

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class FlagDialog(val t: TestFragment): DialogFragment(){
    val langs = arrayOf("Луна и звёзды ночью", "Солнце днём")
    val checked= booleanArrayOf(true, true)
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            AlertDialog.Builder(it)
                .setMultiChoiceItems(langs, checked){
                        dialog, which, isChecked ->
                    checked[which] = isChecked
                }
                .setPositiveButton("Ok"

                ) { dialog, witch ->

                    TimeDialog(t, checked[0], checked[1]).show(parentFragmentManager, "")
                }
                .create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}