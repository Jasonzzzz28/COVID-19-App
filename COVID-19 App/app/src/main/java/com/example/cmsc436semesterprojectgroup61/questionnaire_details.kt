package com.example.cmsc436semesterprojectgroup61

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class questionnaire_details: Fragment() {
    private lateinit var submitButton: Button
    private lateinit var c1: CheckBox
    private lateinit var c2: CheckBox
    private lateinit var c3: CheckBox
    private lateinit var c4: CheckBox
    private lateinit var c5: CheckBox
    private lateinit var c6: CheckBox
    private lateinit var c7: CheckBox
    private lateinit var c8: CheckBox
    private lateinit var c9: CheckBox
    private lateinit var c10: CheckBox
    private lateinit var c11: CheckBox
    private lateinit var adi: EditText



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_questionnaire_details, container, false)
        c1 = view.findViewById(R.id.checkBox)
        c2 = view.findViewById(R.id.checkBox2)
        c3 = view.findViewById(R.id.checkBox3)
        c4 = view.findViewById(R.id.checkBox4)
        c5 = view.findViewById(R.id.checkBox5)
        c6 = view.findViewById(R.id.checkBox6)
        c7 = view.findViewById(R.id.checkBox7)
        c8 = view.findViewById(R.id.checkBox8)
        c9 = view.findViewById(R.id.checkBox9)
        c10 = view.findViewById(R.id.checkBox10)
        c11 = view.findViewById(R.id.checkBox11)
        adi = view.findViewById(R.id.editTextName)

        submitButton = view.findViewById<Button>(R.id.button3)
        submitButton.setOnClickListener {
            val b = storeInput()
            findNavController().navigate(R.id.action_questionnaire_details_to_mapPage, b)
        }

        return view
    }

    private fun storeInput():Bundle {
        val b = Bundle()
        b.putBoolean(s1, c1.isChecked)
        b.putBoolean(s2, c2.isChecked)
        b.putBoolean(s3, c3.isChecked)
        b.putBoolean(s4, c4.isChecked)
        b.putBoolean(s5, c5.isChecked)
        b.putBoolean(s6, c6.isChecked)
        b.putBoolean(s7, c7.isChecked)
        b.putBoolean(s8, c8.isChecked)
        b.putBoolean(s9, c9.isChecked)
        b.putBoolean(s10, c10.isChecked)
        b.putBoolean(s11, c11.isChecked)
        b.putString(s12, adi.text.toString())
        return b
    }

    companion object {

        val s1 = "Fever or chills"
        val s2 = "Cough"
        val s3 = "Shortness of breath or difficulty breathing"
        val s4 = "Fatigue"
        val s5 = "Muscle or body aches"
        val s6 = "Headache"
        val s7 = "New loss of taste or smell"
        val s8 = "Sore throat"
        val s9 = "Congestion or runny nose"
        val s10 = "Nausea or vomiting"
        val s11 = "Diarrhea"
        val s12 = "Additional Information"
    }
}