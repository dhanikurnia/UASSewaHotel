package polinema.ac.id.uassewahotel.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import polinema.ac.id.uassewahotel.R;
import polinema.ac.id.uassewahotel.activities.BaliActivity;
import polinema.ac.id.uassewahotel.activities.BatuActivity;
import polinema.ac.id.uassewahotel.activities.JakartaActivity;
import polinema.ac.id.uassewahotel.activities.JogjaActivity;
import polinema.ac.id.uassewahotel.activities.MainActivity;
import polinema.ac.id.uassewahotel.activities.MalangActivity;
import polinema.ac.id.uassewahotel.activities.SemarangActivity;
import polinema.ac.id.uassewahotel.activities.pembayaranActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyBookingsFragment extends Fragment {


    public MyBookingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_bookings, container, false);

        ImageView ImageView1 = (ImageView) view.findViewById(R.id.images1);
        ImageView ImageView2 = (ImageView) view.findViewById(R.id.images2);
        ImageView ImageView3 = (ImageView) view.findViewById(R.id.images3);
        ImageView ImageView4 = (ImageView) view.findViewById(R.id.images4);
        ImageView ImageView5 = (ImageView) view.findViewById(R.id.images5);
        ImageView ImageView6 = (ImageView) view.findViewById(R.id.images6);
        CardView cardView1 = (CardView) view.findViewById(R.id.cardview1);
        CardView cardView2 = (CardView) view.findViewById(R.id.cardview2);
        CardView cardView3 = (CardView) view.findViewById(R.id.cardview3);
        CardView cardView4 = (CardView) view.findViewById(R.id.cardview4);
        CardView cardView5 = (CardView) view.findViewById(R.id.cardview5);

        ImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Malang", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), MalangActivity.class);
                startActivity(i);
            }
        });

        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Bali", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), BaliActivity.class);
                startActivity(i);
            }
        });

        ImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Jakarta", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), JakartaActivity.class);
                startActivity(i);
            }
        });

        ImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Kota Batu", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), BatuActivity.class);
                startActivity(i);
            }
        });

        ImageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Semarang", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), SemarangActivity.class);
                startActivity(i);
            }
        });

        ImageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Jogjakarta", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), JogjaActivity.class);
                startActivity(i);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Memilih Metode Pembayar",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), pembayaranActivity.class);
                startActivity(i);
            }
        });
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
