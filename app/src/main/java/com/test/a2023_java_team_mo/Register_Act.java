package com.test.a2023_java_team_mo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Register_Act extends AppCompatActivity {
    private FirebaseAuth mFBAuth; // 파이어 베이스 인증
    private DatabaseReference mDBRef; // 실시간 데이터 베이스
    private EditText mEtname, mEtEmail, mEtPwd;
    private Button mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_screen);
/*
        mFBAuth = FirebaseAuth.getInstance();
        mDBRef = FirebaseDatabase.getInstance().getReference();

        mEtname = findViewById(R.id.etNickname);
        mEtEmail = findViewById(R.id.et_email);
        mEtPwd = findViewById(R.id.et_pw);
        mBtnRegister = findViewById(R.id.loginButton);

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // EditText에서 이메일과 비밀번호 가져오기
                String name = mEtname.getText().toString().trim();
                String email = mEtEmail.getText().toString().trim();
                String password = mEtPwd.getText().toString().trim();

                mFBAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(Register_Act.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete( Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            FirebaseUser Fbuser = mFBAuth.getCurrentUser();
                            UserAccount UsrAcc = new UserAccount();
                            UsrAcc.setIdToken(Fbuser.getUid());
                            UsrAcc.setEmailId(Fbuser.getEmail());
                            UsrAcc.setPassword(password);

                            mDBRef.child("UserAccount").child(Fbuser.getUid()).setValue(UsrAcc);
                            Toast.makeText(Register_Act.this, "회원 가입 성공", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Register_Act.this, "회원 가입 실패", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });*/
    }
}
