package com.example.cmsc436semesterprojectgroup61

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.fragment.app.Fragment

class MapPage : Fragment(){
    private lateinit var testSites: WebView
    private lateinit var Hospitals: WebView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.map_page, container, false)
        testSites = view.findViewById<WebView>(R.id.test_sites)
        Hospitals = view.findViewById<WebView>(R.id.hospitals)
        //test
        val t = arguments?.getString("Additional Information")
        if (t != null) {
            Log.i("Test", t)
        }
        else{
            Log.i("Test", "no")
        }

//        testSites.settings.javaScriptEnabled = true
//        testSites.webViewClient = WebViewClient()
//        testSites.loadUrl("https://www.google.com/")
        return view
    }
}