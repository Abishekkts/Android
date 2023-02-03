package com.example.selflearning;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;

public class Signupfragment extends Fragment {


    EditText name, mobnum, email, pass;
    RadioButton malebtn, femalebtn;
    RadioGroup gender;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab, container, false);

        name = root.findViewById(R.id.name);
        mobnum = root.findViewById(R.id.mobnum);
        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        malebtn = root.findViewById(R.id.male_button);
        femalebtn = root.findViewById(R.id.female_button);
//        gender = root.findViewById(R.id.gendertxt);

        name.setTranslationX(800);
        mobnum.setTranslationX(800);
        email.setTranslationX(800);
        pass.setTranslationX(800);
//        gender.setTranslationX(800);

        name.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        mobnum.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
//        gender.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();

        return root;


    }
}
