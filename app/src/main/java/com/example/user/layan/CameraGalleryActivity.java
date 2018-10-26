package com.example.user.layan;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraGalleryActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int CAMERA_REQUEST = 0;
    Button btTakephoto, btGallery;
    ImageView imageViewCamera;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_gallery);

        btTakephoto= (Button) findViewById(R.id.btTakePhoto);
        btGallery= (Button) findViewById(R.id.btGallery);
        imageViewCamera= (ImageView) findViewById(R.id.imageViewCamera);

        btTakephoto.setOnClickListener(this);
        btGallery.setOnClickListener(this);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        //if the request was from the camera and the result was OK meaning the camera worked
//        if(requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            //the image capturedissaved in the data object
            Bitmap photo= (Bitmap) data.getExtras().get("data");
            imageViewCamera.setImageBitmap(photo);
//        }
    }

    @Override
    public void onClick(View v) {
        if (v== btTakephoto) {
            Intent i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i, CAMERA_REQUEST);
        }else{
            //later
        }
    }
}
