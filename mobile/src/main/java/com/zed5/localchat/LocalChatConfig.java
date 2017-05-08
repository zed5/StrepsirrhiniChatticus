/**
 *  MIT License
 *
 *  SPDX:MIT
 *
 *  https://spdx.org/licenses/MIT
 *
 *  See LICENSE.txt file in the top level directory.
 */

package com.zed5.localchat;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalChatConfig {
    private static final String PREF_FILENAME= "com.zed5.localchat.ConfigPreferences";
    private static final String DISPLAY_NAME = "displayName";

    private final Context mContext;
    private final SharedPreferences mSharedPreferences;

    public LocalChatConfig(Context ctx) {
        mContext = ctx;
        mSharedPreferences = mContext.getSharedPreferences(
                PREF_FILENAME, Context.MODE_PRIVATE);
    }

    public String getDisplayName() {
        return mSharedPreferences.getString(DISPLAY_NAME, null);
    }

    public void setDisplayName(final String displayName) {
        mSharedPreferences.edit()
                          .putString(DISPLAY_NAME, displayName)
                          .apply();
    }
}
