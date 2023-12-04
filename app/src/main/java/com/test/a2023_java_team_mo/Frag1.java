package com.test.a2023_java_team_mo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


// Firebase Realtime Database에서 데이터를 읽어와서 해당 데이터를 UI에 표시


public class Frag1 extends Fragment {
    private View view;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);
        return view;
    }

    public class HomeFragment extends Fragment {

        private View view;
        private ImageView profileImageView;
        private TextView profileTextView;
        private ImageView contentImageView;
        private ImageView favoriteImageView;
        private ImageView commentImageView;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            // Initialize views
            profileImageView = view.findViewById(R.id.detailviewitem_profile_image);
            profileTextView = view.findViewById(R.id.detailviewitem_profile_textview);
            contentImageView = view.findViewById(R.id.detailviewitem_imageview_content);
            favoriteImageView = view.findViewById(R.id.detailviewitem_favorite_imageview);
            commentImageView = view.findViewById(R.id.detailviewitem_comment_imageview);

            // TODO: Set up Firebase Database reference
            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("your_data_node");

            // TODO: Attach a ValueEventListener to read data
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // TODO: Parse dataSnapshot and set values to views
                    if (dataSnapshot.exists()) {
                        // Example: Assuming you have "userName" and "profileImage" fields
                        String userName = dataSnapshot.child("userName").getValue(String.class);
                        String profileImage = dataSnapshot.child("profileImage").getValue(String.class);

                        // Set data to views
                        profileTextView.setText(userName);

                        // Use a library like Picasso or Glide to load images from a URL
                        // Example using Picasso:
                        if (profileImage != null && !profileImage.isEmpty()) {
                            Picasso.get().load(profileImage).into(profileImageView);
                        }
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    // Handle error
                }
            });

            return view;
        }
    }
}