package com.test.a2023_java_team_mo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class Frag1 extends Fragment {
    private View view;
    private FirebaseFirestore firestore;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);
        return view;
    }

    class DetailViewRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        // 데이터 리스트를 저장할 ArrayList
        public ArrayList<String> dataList = new ArrayList<>();

        // 생성자에서 초기화 작업 수행
        public DetailViewRecyclerViewAdapter(ArrayList<String> dataList) {
            this.dataList = dataList;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // 뷰홀더 생성 및 초기화 작업
            // TODO: 뷰홀더 반환
            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            // 뷰홀더에 데이터 바인딩 작업
            // TODO: 데이터 바인딩
        }

        @Override
        public int getItemCount() {
            // 데이터 아이템 개수 반환
            return dataList.size();
        }
    }
}
