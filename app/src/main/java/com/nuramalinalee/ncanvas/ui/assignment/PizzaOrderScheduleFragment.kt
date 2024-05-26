package com.nuramalinalee.ncanvas.ui.assignment

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nuramalinalee.ncanvas.databinding.FragmentPizzaOrderScheduleBinding
import java.util.Calendar

class PizzaOrderScheduleFragment : Fragment() {

    private lateinit var binding: FragmentPizzaOrderScheduleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPizzaOrderScheduleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSelectDate.setOnClickListener {
            showDatePicker()
        }
        binding.btnSelectTime.setOnClickListener {
            showTimePicker()
        }
    }

    private fun showDatePicker() {
        val calendar = Calendar.getInstance()
        context?.let {
            val datePickerDialog = DatePickerDialog(
                it,
                { _, selectedYear, selectedMonth, selectedDay ->
                    binding.tvDate.text = "$selectedDay/ $selectedMonth/ $selectedYear"
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }
    }

    private fun showTimePicker() {
        val calendar = Calendar.getInstance()
        context?.let {
            val timePickerDialog = TimePickerDialog(
                it,
                { _, selectedHour, selectedMinute ->
                    binding.tvTime.text = "$selectedHour:$selectedMinute"
                },
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false
            )
            timePickerDialog.show()
        }
    }

}