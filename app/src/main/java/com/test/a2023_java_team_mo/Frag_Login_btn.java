package com.test.a2023_java_team_mo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

//


// 첫 로그인 화면 관련된 코드(이메일로 시작 or 이메일 없이 시작)
public class Frag_Login_btn extends Fragment {

    // 로그인 버튼
    private Button mBtnRegister;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Fragment의 레이아웃을 인플레이트합니다.
        View view = inflater.inflate(R.layout.login_btn, container, false);

        // 이메일로 시작하기 버튼에 대한 클릭 이벤트 리스너 설정
        Button emLoginBtn = view.findViewById(R.id.em_login_btn);
        emLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 클릭하면 login_input_screen.xml로 이동
                Intent intent = new Intent(getActivity(), Login_Act.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
