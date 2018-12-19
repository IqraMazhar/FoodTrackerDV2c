package com.example.iqramazhar1.foodtracker_dv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainRecyclerActivityList extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    // variables

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_activity_main_list);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private  void initImageBitmaps()
    {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        //mImageUrls.add("");
        //mNames.add("");

        mImageUrls.add("https://cdn-images-1.medium.com/max/770/0*4wumHkmkVKG38b5l.jpg");
        mNames.add("Biryani");


        mImageUrls.add("http://www.amigosdelivery.pk/wp-content/uploads/2017/02/Mutton-Pulao.jpg");
        mNames.add("Mutton Pullao");

        mImageUrls.add("https://www.therecipespk.com/wp-content/uploads/2014/07/Chicken-Broast.-How-To-Make-Chicken-Broast.-Homemade-Chicken-Broast.jpg");
        mNames.add("Chicken Brost");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMnOt71D-VYClRrqht0ILPyVWO2Htonvsa_xH-DGW5KMnsu3zX");
        mNames.add("Nihari");

        mImageUrls.add("https://i0.wp.com/media.hungryforever.com/wp-content/uploads/2017/12/04123951/mutton-paya-recipe.jpg?ssl=1?w=356&strip=all&quality=80");
        mNames.add("Mutton Paya");

        mImageUrls.add("https://jehangirs.kitchen/wp-content/uploads/2017/01/Palak-Gosht-600x600.jpg");
        mNames.add("Palak ghost");

        mImageUrls.add("https://i0.wp.com/www.recipe52.com/wp-content/uploads/2018/04/Chicken-Karahi-Recipe-Pakistani-1-of-1.jpg?fit=2048%2C1360&ssl=1");
        mNames.add("Chicken Karahi");

        mImageUrls.add("https://funcooking.co.uk/wp-content/uploads/2015/08/chinioti-kunna-gosht-018-copy.jpg");
        mNames.add("Mutton Kunna");

        mImageUrls.add("https://kfoods.com/images1/newrecipeicon/Namkeen-Gosht_2945.jpg");
        mNames.add("Namkeen Gosht");

        mImageUrls.add("https://www.faskitchen.com/wp-content/uploads/2015/03/kaleji-ka-salan.jpg");
        mNames.add("Kaleji");

        mImageUrls.add("https://www.tandooricorner.co.uk/wp-content/uploads/2017/09/p-zarda.jpg");
        mNames.add("Zarda");


        mImageUrls.add("https://i0.wp.com/www.carveyourcraving.com/wp-content/uploads/2016/09/Saffron-rice-kheer-indian-rice-pudding-keer-diwali.jpg?resize=500%2C500&ssl=1");
        mNames.add("Kheer");

        initRecyclerView();
    }

    private  void initRecyclerView()
    {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }




}

