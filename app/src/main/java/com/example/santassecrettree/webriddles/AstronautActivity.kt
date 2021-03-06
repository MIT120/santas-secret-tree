package com.example.santassecrettree.webriddles

import android.Manifest
import android.annotation.TargetApi
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.webkit.*
import android.net.Uri
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.santassecrettree.R
import com.example.santassecrettree.qrcode.QrCodeScannerActivity
import com.example.santassecrettree.steganography.Steganography

class AstronautActivity: Activity() {
    private val MY_PERMISSIONS_REQUEST = 100


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val myWebView: WebView = WebView(this)

        val webSettings: WebSettings = myWebView.getSettings()
        webSettings.setLoadsImagesAutomatically(true)
        webSettings.setAllowContentAccess(true)
        webSettings.setJavaScriptEnabled(true)
        webSettings.setAppCacheEnabled(true)
        webSettings.setDomStorageEnabled(true)
        webSettings.setLoadWithOverviewMode(true)
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true)
        webSettings.setPluginState(WebSettings.PluginState.ON)
        webSettings.setMediaPlaybackRequiresUserGesture(false)

        /* CUSTOM USER AGENT */
        webSettings.setUserAgentString("hcapp")

        myWebView.setWebViewClient(object: WebViewClient () {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean
            {
                Log.e("baGOQ", (Uri.parse(url).toString() == "http://igreedy.club/male.html").toString())
                if(Uri.parse(url).toString() == "http://igreedy.club/male.html")
                {
                    val intent = Intent(this@AstronautActivity, QrCodeScannerActivity::class.java)
                    startActivity(intent)
                    return false
                }
                return true

            }
            override fun onReceivedError(
                webView: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                try {
                    webView.stopLoading()
                } catch (e: Exception) {
                }
                if (webView.canGoBack()) {
                    webView.goBack()
                }
                webView.loadUrl("http://igreedy.club/")
            }
        })
        myWebView.setWebChromeClient(object: WebChromeClient (){
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)

            override fun onPermissionRequest(request: PermissionRequest) {
                request.grant(request.getResources())
            }
        })

        // Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_CONTACTS
            )
            != PackageManager.PERMISSION_GRANTED
        ) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.READ_CONTACTS
                )
            ) {

                // Show an expanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(this,
                    Array<String>(5) {
                        android.Manifest.permission.RECORD_AUDIO
                        android.Manifest.permission.MODIFY_AUDIO_SETTINGS
                        android.Manifest.permission.WRITE_EXTERNAL_STORAGE
                        android.Manifest.permission.CAMERA
                    }, MY_PERMISSIONS_REQUEST
                )

            }
        }
        setContentView(myWebView)
        myWebView.loadUrl("http://igreedy.club/")
    }
//    private lateinit var webView: WebView

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_web_view)
//        webView = this.findViewById(R.id.web_riddler) as WebView
//        webView.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                view?.loadUrl(url)
//                return true
//            }
//        }
//        webView.loadUrl("http://145.93.137.162:4200/")
//    }
}