package com.example.a37

import android.app.Dialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class TimeDialog(val t: TestFragment, val stars: Boolean, val sun: Boolean) : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance();
        val curHour = c.get(Calendar.HOUR_OF_DAY);
        val curMinute = c.get(Calendar.MINUTE);
        return TimePickerDialog(activity, {
                _, hour, minute ->
            t.setState(hour, minute, sun, stars)
        }, curHour, curMinute, false)
    }
}