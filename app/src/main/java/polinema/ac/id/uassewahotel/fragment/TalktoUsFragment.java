package polinema.ac.id.uassewahotel.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import polinema.ac.id.uassewahotel.R;
import polinema.ac.id.uassewahotel.activities.MainActivity;
import polinema.ac.id.uassewahotel.activities.pembayaranActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class TalktoUsFragment extends Fragment {


    public TalktoUsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_talkto_us, container, false);
        // Inflate the layout for this fragment
        ImageView ImageView1 = (ImageView) view.findViewById(R.id.images1);
        ImageView ImageView2 = (ImageView) view.findViewById(R.id.images2);
        ImageView ImageView3 = (ImageView) view.findViewById(R.id.images3);
        ImageView ImageView4 = (ImageView) view.findViewById(R.id.images4);


        ImageView1.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
           Intent i = new Intent(getActivity(), MainActivity.class);
          startActivity(i);
        }
        });
        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(),MainActivity .class);
                startActivity(i);
            }
        });
        ImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
            }
        });
        ImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Toast.makeText(getActivity().getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
            }
        });


        return view;
    }

}
