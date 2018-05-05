package com.google.firebase.quickstart.database.fragment;

import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.google.firebase.quickstart.database.R;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.quickstart.database.models.Post;
import com.google.firebase.quickstart.database.models.User;

import java.util.HashMap;
import java.util.Map;

public class RecentPostsFragment extends PostListFragment {

    private EditText searchBox;
    private FloatingActionButton mSubmitButton;
    private String authorInput;



    public RecentPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START recent_posts_query]
        // Last 100 posts, these are automatically the 100 most recent
        // due to sorting by push() key

        Query authorSearch = databaseReference.child("posts").limitToFirst(100);
        // [END recent_posts_query]

        return authorSearch;
    }
}
