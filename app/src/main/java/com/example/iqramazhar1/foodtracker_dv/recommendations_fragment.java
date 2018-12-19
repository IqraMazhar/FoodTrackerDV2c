package com.example.iqramazhar1.foodtracker_dv;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class recommendations_fragment extends Fragment {
    private Button btnTEST;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.recommendations,container,false);

        btnTEST=(Button)view.findViewById(R.id.testbtn3);

    /*    btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Testing Button Click3", Toast.LENGTH_SHORT).show();

            }
        });
*/
        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listdisplay;
                listdisplay=new Intent(getContext(),MainRecyclerActivityList.class);
                startActivity(listdisplay);

            }
        });

        return view;
    }
}
