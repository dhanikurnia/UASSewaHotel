package polinema.ac.id.uassewahotel.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import polinema.ac.id.uassewahotel.R;
import polinema.ac.id.uassewahotel.activities.pembayaranActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {


    public ExploreFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
        // Inflate the layout for this fragment
        //CardView cardView = (CardView) view.findViewById(R.id.cardview1);
        CardView cardView2 = (CardView) view.findViewById(R.id.cardview2);
        CardView cardView3 = (CardView) view.findViewById(R.id.cardview3);
        CardView cardView4 = (CardView) view.findViewById(R.id.cardview4);
        CardView cardView5 = (CardView) view.findViewById(R.id.cardview5);


        //cardView.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
            //    Toast.makeText(getActivity().getApplicationContext(), "Berhasil Membyar", Toast.LENGTH_LONG).show();
             //   Intent i = new Intent(getActivity(), pembayaranActivity.class);
              //  startActivity(i);
            //}
        //});

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Pembayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });

           cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
          }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Membayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });
        return view;
       }


}
