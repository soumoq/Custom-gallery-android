package com.example.gallerypoc.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gallerypoc.R
import com.example.gallerypoc.util.Utils
import kotlinx.android.synthetic.main.activity_image_edit.*


class ImageEditActivity : AppCompatActivity() {

    private val PHOTO_EDITOR_REQUEST_CODE = 231 // Any integer value as a request code.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_edit)

        val bitmap = Utils.getBitmap()
        image_edit_image_view.setImageBitmap(bitmap)


    }


}