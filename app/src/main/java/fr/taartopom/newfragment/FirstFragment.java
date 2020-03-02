package fr.taartopom.newfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {
    private EditText txtLogin;
    private EditText txtPassword;
    private Button btnConnect;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_first, container, true);
        txtLogin = (EditText) rootView.findViewById(R.id.txt_login);
        txtPassword = (EditText) rootView.findViewById(R.id.txt_password);

        btnConnect = (Button) rootView.findViewById(R.id.btn_connect);
        btnConnect.setOnClickListener(btnConnectListenner);

        return rootView;
    }
    private View.OnClickListener btnConnectListenner =  new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("DEBUG",txtLogin.getText() + " / " + txtPassword.getText() );
        }
    };

}
