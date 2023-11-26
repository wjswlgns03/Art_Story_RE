package com.test.a2023_java_team_mo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Frag_Login extends Fragment {

    private FirebaseAuth mFBAuth;
    private DatabaseReference mDatabaseRef;
    private EditText mEtEmail, mEntPW;

    // 로그인 버튼
    private Button mBtnRegister;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Fragment의 레이아웃을 인플레이트합니다.
        View view = inflater.inflate(R.layout.login, container, false);

        // 이메일로 시작하기 버튼에 대한 클릭 이벤트 리스너 설정
        Button emLoginBtn = view.findViewById(R.id.em_login_btn);
        emLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 클릭 시 수행할 동작 구현
                startEmailLogin();
            }
        });

        return view;
    }

    private void startEmailLogin() {
        // 이메일 로그인 기능을 구현
        // 여기에는 앞서 설명한 startEmailLogin 메서드의 내용을 추가합니다.
    }
}
