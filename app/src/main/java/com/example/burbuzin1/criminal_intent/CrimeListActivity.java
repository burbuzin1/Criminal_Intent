package com.example.burbuzin1.criminal_intent;

import android.support.v4.app.Fragment;

/**
 * Created by burbuzin1 on 26.06.2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
