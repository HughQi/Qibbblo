package com.example.qihaozhang.qibbblo.view.bucket_list;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.example.qihaozhang.qibbblo.R;
import com.example.qihaozhang.qibbblo.view.base.SingleFragmentActivity;

import java.util.ArrayList;

/**
 * Created by qihaozhang on 2017-04-17.
 */

public class BucketListActivity extends SingleFragmentActivity {

    @NonNull
    @Override
    protected Fragment newFragment() {
        boolean isChoosingMode = getIntent().getExtras().getBoolean(
                BucketListFragment.KEY_CHOOSING_MODE);
        ArrayList<String> chosenBucketIds = getIntent().getExtras().getStringArrayList(
                BucketListFragment.KEY_COLLECTED_BUCKET_IDS);
        return BucketListFragment.newInstance(null, isChoosingMode, chosenBucketIds);
    }

    @NonNull
    @Override
    protected String getActivityTitle() {
        return getString(R.string.choose_bucket);
    }
}
