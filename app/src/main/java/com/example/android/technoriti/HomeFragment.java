package com.example.android.technoriti;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private TextView mTextViewLitfest;
    private TextView mTextViewTechie;
    private TextView mTextViewParakaram;
    private TextView mTextViewVistas;
    private TextView mTextViewExhibition;
    private TextView mTextViewBrainden;
    private TextView mTextViewSpecialevent;
    private TextView mTextViewFundoz;



        public HomeFragment() {

        }

        View view;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            view=inflater.inflate(R.layout.fragment_home, container, false);
            mTextViewLitfest=(TextView)view.findViewById(R.id.textView_litfest);
            mTextViewTechie=(TextView)view.findViewById(R.id.textView_techie);
            mTextViewParakaram=(TextView)view.findViewById(R.id.textView_parakaram);
            mTextViewVistas=(TextView)view.findViewById(R.id.textView_vista);
            mTextViewExhibition=(TextView)view.findViewById(R.id.textView_exhibition);
            mTextViewBrainden=(TextView)view.findViewById(R.id.textView_brainden);
            mTextViewSpecialevent=(TextView)view.findViewById(R.id.textView_specialevent);
            mTextViewFundoz=(TextView)view.findViewById(R.id.textView_fundoz);
            mTextViewLitfest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getContext(),LitfestActivity.class);
                   in.putExtra("some","somedata");
                    startActivity(in);
                }
            });
            mTextViewTechie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getContext(),TechieActivity.class);
                    in.putExtra("some1","somedata1");
                   startActivity(in);
                }
            });
            mTextViewParakaram.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getContext(),Parakaram.class);
                    in.putExtra("some2","somedata2");
                    startActivity(in);
                }
            });
            mTextViewVistas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getContext(),Vistas.class);
                    in.putExtra("some3","somedata3");
                    startActivity(in);
                }
            });
            mTextViewExhibition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getContext(),ExhibitionActivity.class);
                    in.putExtra("some4","somedata4");
                    startActivity(in);
                }
            });
            mTextViewBrainden.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getContext(),BraindentActivity.class);
                    in.putExtra("some5","somedata5");
                    startActivity(in);
                }
            });
            mTextViewSpecialevent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getContext(),SpecialeventActivity.class);
                    in.putExtra("some6","somedata6");
                    startActivity(in);
                }
            });
            mTextViewFundoz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getContext(),FundozActivity.class);
                    in.putExtra("some7","somedata7");
                    startActivity(in);
                }
            });
            return view;
        }
    }

