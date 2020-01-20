package com.example.santassecrettree.steganography

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.graphics.drawable.toBitmap
import com.ayush.imagesteganographylibrary.Text.AsyncTaskCallback.TextDecodingCallback
import com.ayush.imagesteganographylibrary.Text.AsyncTaskCallback.TextEncodingCallback
import com.ayush.imagesteganographylibrary.Text.ImageSteganography
import com.ayush.imagesteganographylibrary.Text.TextDecoding
import com.ayush.imagesteganographylibrary.Text.TextEncoding
import com.example.santassecrettree.R
import com.example.santassecrettree.webriddles.AstronautActivity
import com.example.santassecrettree.webriddles.AudioActivity
import com.example.santassecrettree.webriddles.WebViewActivity
import com.github.dhaval2404.imagepicker.ImagePicker
import java.io.File


class Steganography : Activity() , TextEncodingCallback, TextDecodingCallback  {

    private val SELECT_PICTURE = 100
    private val TAG = "Decode Class"
    //Initializing the UI components
    private var textView: TextView? = null
    private var imageView: ImageView? = null
    private var message: EditText? = null
    private var secret_key: EditText? = null
    private var filepath: Uri? = null
    //Bitmap
    private var original_image: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decode)
        //Instantiation of UI components
        textView = findViewById(R.id.whether_decoded)
        imageView = findViewById(R.id.imageview)
        message = findViewById(R.id.message)
        secret_key = findViewById(R.id.secret_key)
        val decode_button: Button = findViewById(R.id.decode_button)

        ImagePicker.with(this)
            .galleryOnly()
            .compress(1024)			//Final image size will be less than 1 MB(Optional)
            .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
            .start()

        decode_button.setOnClickListener {
            Log.e("BATE KAKVO", secret_key?.text.toString())
            val imageSteganography = ImageSteganography(
                secret_key?.text.toString(),
                original_image
            )
            val textDecoding = TextDecoding(
                this@Steganography,
                this@Steganography
            )
            textDecoding.execute(imageSteganography)
        }
    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) {
        super.onActivityResult(requestCode, resultCode, data)
        //Image set to imageView
        if (resultCode == Activity.RESULT_OK) {
            //Image Uri will not be null for RESULT_OK
            val fileUri = data?.data

            //You can get File object from intent
            val file: File? = ImagePicker.getFile(data)
            imageView?.setImageURI(fileUri)
            original_image = imageView?.getDrawable()?.toBitmap()
            val imageSteganography: ImageSteganography = ImageSteganography(
                "http://igreedy.club/",
                "KEY",
                original_image
            )
            val textEncoding = TextEncoding(
                this@Steganography,
                this@Steganography
            )
            textEncoding.execute(imageSteganography)
            //You can also get File Path from intent
            val filePath:String? = ImagePicker.getFilePath(data)
            Log.e("File", file.toString())
            Log.e("FilePath", filePath)
        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(this, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Task Cancelled", Toast.LENGTH_SHORT).show()
        }
    }



    override fun onStartTextEncoding() {

    }

    override fun onCompleteTextEncoding(result: ImageSteganography?) {
        if (result != null && result.isEncoded()) {

            //encrypted image bitmap is extracted from result object
            original_image = result.encoded_image

            //set text and image to the UI component.
            textView?.setText("Encoded")
            imageView?.setImageBitmap(original_image)
        }
        else {
            print(result.toString())
            if (result != null) { /* If result.isDecoded() is false, it means no Message was found in 					the image. */
                if (!result.isDecoded) textView!!.text =
                    "No message found" else { /* If result.isSecretKeyWrong() is true, it means that secret key provided 				is wrong. */
                    if (!result.isSecretKeyWrong) { //set the message to the UI component.
                        textView!!.text = "Decoded"
                        message!!.setText("" + result.message)
                        visitPage()
                    } else {
                        textView!!.text = "Wrong secret key"
                    }
                }
            } else { //If result is null it means that bitmap is null
                textView!!.text = "Select Image First"
            }
        }

    }

    fun visitPage() {
        if (secret_key?.text.toString().equals("KEY")) {
            val intent = Intent(this, AstronautActivity::class.java)
            startActivity(intent)
        }
    }
}