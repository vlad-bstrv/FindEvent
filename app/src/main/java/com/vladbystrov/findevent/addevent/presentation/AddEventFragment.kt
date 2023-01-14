package com.vladbystrov.findevent.addevent.presentation

import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.google.android.material.chip.Chip
import com.google.android.material.datepicker.MaterialDatePicker
import com.vladbystrov.findevent.R
import com.vladbystrov.findevent.addevent.domain.model.Event
import com.vladbystrov.findevent.addevent.domain.model.EventType
import com.vladbystrov.findevent.core.fragment.BaseFragment
import com.vladbystrov.findevent.databinding.FragmentAddEventBinding
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class AddEventFragment : BaseFragment<FragmentAddEventBinding>(
    FragmentAddEventBinding::inflate
) {

    private val viewModel: AddEventViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val acceptableAge = listOf("0+", "5+", "10+", "16+", "18+")
        val arrayAdapter = ArrayAdapter(requireActivity(), R.layout.item_age_spinner, acceptableAge)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        val moods = listOf("Любое", "Деятельное", "Созерцательное", "Унылое")
        val arrayMoodAdapter = ArrayAdapter(requireActivity(), R.layout.item_age_spinner, moods)
        binding.moodAutoCompleteTextView.setAdapter(arrayMoodAdapter)

        binding.dateInputLayout.editText?.inputType = InputType.TYPE_NULL
        binding.dateInputLayout.editText?.keyListener = null

        binding.dateInputLayout.editText?.setOnClickListener {
            openDatePicker();
        }

//        binding.chipGroup.setOnCheckedChangeListener { group, checkedIds ->
//            val chip: Chip? = view.findViewById(checkedIds)
//
//            chip?.let {
//                // Show the checked chip text on toast message
//                Toast.makeText(requireContext(), "${it.text} выбран", Toast.LENGTH_LONG)
//                    .show()
//            }
//        }

        binding.chipGroup.setOnCheckedStateChangeListener() { group, checkedIds ->
            val chip: Chip? = view.findViewById(checkedIds[0])
            chip?.let {
                Toast.makeText(requireContext(), "${it.text}", Toast.LENGTH_SHORT).show()
            }
        }


//         binding.dateInputLayout.editText?.setOnFocusChangeListener { v, hasFocus ->
//             val builder: MaterialDatePicker.Builder<*> = MaterialDatePicker.Builder.datePicker()
//             val picker = builder.build()
//             picker.show(this.parentFragmentManager, "DATE_PICKER")
//             picker.addOnPositiveButtonClickListener {
//                 val longV = it.toString()
//                 val millisecond = longV.toLong()
//                 val dateString: String =
//                     SimpleDateFormat("dd/MM/yyyy").format(Date(millisecond))
//                 binding.dateInputLayout.editText?.setText(dateString)
//             }
//        }
    }

    private fun newEvent(): Event {
        binding.apply {
            return Event(
                getCategoryEvent(),
                getNameEvent(),
                1,
                "",
                1,
                1L,
                true,
                2.5)
        }
    }

    private fun getNameEvent(): String {
        var nameEvent = ""
        binding.nameEventTextInputLayout.editText?.let {
            nameEvent = it.text.toString()
        }
        return nameEvent
    }

    private fun getCategoryEvent(): String {
        var categoryEvent = ""
        binding.chipGroup.setOnCheckedStateChangeListener() { group, checkedIds ->
            val chip: Chip? = view?.findViewById(checkedIds[0])
            chip?.let {
               categoryEvent = it.text.toString()
            }
        }
        return categoryEvent
    }

    private fun openDatePicker() {
        val builder: MaterialDatePicker.Builder<*> = MaterialDatePicker.Builder.datePicker()
        val picker = builder.build()
        picker.show(this.parentFragmentManager, "DATE_PICKER")
        picker.addOnPositiveButtonClickListener {
            val longV = it.toString()
            val millisecond = longV.toLong()
            val dateString: String =
                SimpleDateFormat("dd/MM/yyyy").format(Date(millisecond))
            binding.dateInputLayout.editText?.setText(dateString)
        }
    }

    inner class TextFieldValidation(private val view: View) : TextWatcher {
        override fun afterTextChanged(s: Editable?) {}
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            // checking ids of each text field and applying functions accordingly.

        }

    }
}
