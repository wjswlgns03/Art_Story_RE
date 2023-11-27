package com.test.a2023_java_team_mo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login_Act extends AppCompatActivity {
    private FirebaseAuth mFBAuth; // 파이어 베이스 인증
    private DatabaseReference mDBRef; // 실시간 데이터 베이스
    private EditText mEtname, mEtEmail, mEtPwd;
    private Button mBtnRegister;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_input_screen);

        mFBAuth = FirebaseAuth.getInstance();
        mDBRef = FirebaseDatabase.getInstance().getReference();

        mEtname = findViewById(R.id.etNickname);
        mEtEmail = findViewById(R.id.et_email);
        mEtPwd = findViewById(R.id.et_pw);
        mBtnRegister = findViewById(R.id.RegisterButton);
        mBtnLogin = findViewById(R.id.loginButton);
    }
}
