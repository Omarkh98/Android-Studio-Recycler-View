package com.example.recyclerviewv2;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        ImageMaps();
    }

    private void ImageMaps() {

        mImageUrls.add("https://carsguide-res.cloudinary.com/image/upload/f_auto,fl_lossy,q_auto,t_default/v1/editorial/McLaren-P1_0.jpg");
        mNames.add("McLaren P1");

        mImageUrls.add("https://i.pinimg.com/originals/65/77/cf/6577cf4ea0d177f999355a6eae9af819.jpg");
        mNames.add("Lamborghini Aventador");

        mImageUrls.add("https://d3lp4xedbqa8a5.cloudfront.net/s3/digital-cougar-assets/whichcar/2016/03/04/-1/Aston-Martin-DB11-front-side-.jpg");
        mNames.add("Aston Martin");

        mImageUrls.add("https://i.ytimg.com/vi/NkiyAZ63RT8/maxresdefault.jpg");
        mNames.add("Bugatti Chiron");


        mImageUrls.add("https://s3.amazonaws.com/carmudi-blogs/carmudi-ph/wp-content/uploads/2017/05/05014728/2017-chevy-corvette-grand-sport-first-drive_1264x711.jpg");
        mNames.add("Corvette");

        mImageUrls.add("https://stimg.cardekho.com/images/carexteriorimages/630x420/Ferrari/Ferrari-812-SuperFast/6301/1550829293731/front-left-side-47.jpg");
        mNames.add("Ferrari 488 SuperFast");


        mImageUrls.add("https://qph.fs.quoracdn.net/main-qimg-1d02e3cfe454504aa5005e6b1b66087a");
        mNames.add("Audi R8");

        mImageUrls.add("https://thecarousel.com/wp-content/uploads/2016/04/powerful-sexy-cars-the-carousel-.jpg");
        mNames.add("Rolls Royce");

        mImageUrls.add("https://o.aolcdn.com/images/dims3/GLOB/legacy_thumbnail/800x450/format/jpg/quality/85/http://www.blogcdn.com/www.autoblog.com/media/2008/09/granturismo-1280-02_opt.jpg");
        mNames.add("Maseratti");

        RecyclerView();
    }

    private void RecyclerView() {
        RecyclerView RV = findViewById(R.id.Recycler);
        RecyclerViewAdapter Adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        RV.setAdapter(Adapter);
        RV.setLayoutManager(new LinearLayoutManager(this));
    }
}
