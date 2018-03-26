package com.huodonghezi.myaspectj;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLoaderManager().initLoader(0, null, new LoaderManager.LoaderCallbacks<String>() {
            @Override
            public Loader<String> onCreateLoader(int id, Bundle args) {
                return null;
            }

            @Override
            public void onLoadFinished(Loader<String> loader, String data) {

            }

            @Override
            public void onLoaderReset(Loader<String> loader) {

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
