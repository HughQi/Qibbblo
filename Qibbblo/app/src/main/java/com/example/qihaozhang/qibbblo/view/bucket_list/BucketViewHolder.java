package com.example.qihaozhang.qibbblo.view.bucket_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qihaozhang.qibbblo.R;
import com.example.qihaozhang.qibbblo.view.base.BaseViewHolder;

import butterknife.BindView;

/**
 * Created by qihaozhang on 2017-04-17.
 */

public class BucketViewHolder extends BaseViewHolder {

    @BindView(R.id.bucket_layout)
    View bucketLayout;
    @BindView(R.id.bucket_name)
    TextView bucketName;
    @BindView(R.id.bucket_shot_count) TextView bucketCount;
    @BindView(R.id.bucket_shot_chosen)
    ImageView bucketChosen;

    public BucketViewHolder(View itemView) {
        super(itemView);
    }
}