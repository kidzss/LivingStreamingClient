package com.qloop.orange.view.fragment;

import android.view.View;

import com.qloop.orange.R;
import com.qloop.orange.view.Iview.IUserFragment;

/**
 * Created by Qloop on 2017/4/13.
 */

public class UserFragment extends BaseFragment implements IUserFragment {
    @Override
    public View initViews() {
        View view = View.inflate(mActivity, R.layout.fragment_user, null);
        return view;
    }
}
