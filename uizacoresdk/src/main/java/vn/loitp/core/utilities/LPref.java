package vn.loitp.core.utilities;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import vn.loitp.core.common.Constants;
import vn.loitp.restapi.uiza.model.v2.auth.Auth;

/**
 * File created on 11/15/2016.
 *
 * @author loitp
 */
public class LPref {
    private String TAG = getClass().getSimpleName();

    private final static String PREFERENCES_FILE_NAME = "loitp";
    private final static String CHECK_APP_READY = "CHECK_APP_READY";
    private final static String PRE_LOAD = "PRE_LOAD";
    private final static String SLIDE_UIZA_VIDEO_ENABLED = "SLIDE_UIZA_VIDEO_ENABLED";
    public final static String INDEX = "INDEX";
    public final static String AUTH = "AUTH";
    public final static String API_END_POINT = "API_END_POINT";
    public final static String API_TRACK_END_POINT = "API_TRACK_END_POINT";
    public final static String TOKEN = "TOKEN";

    //object
    /*public User getUser() {
        SharedPreferences pref = context.getSharedPreferences(Const.PREFERENCES_FILE_NAME, 0);
        return gson.fromJson(pref.getString(KEY_USER, ""), User.class);
    }

    public void setUser(User user) {
        SharedPreferences.Editor editor = context.getSharedPreferences(Const.PREFERENCES_FILE_NAME, 0).edit();
        editor.putString(KEY_USER, gson.toJson(user));
        editor.apply();
    }*/

    /////////////////////////////////STRING
    public static String getApiEndPoint(Context context) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        return pref.getString(API_END_POINT, null);
    }

    public static void setApiEndPoint(Context context, String value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0).edit();
        editor.putString(API_END_POINT, value);
        editor.apply();
    }

    public static String getApiTrackEndPoint(Context context) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        return pref.getString(API_TRACK_END_POINT, null);
    }

    public static void setApiTrackEndPoint(Context context, String value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0).edit();
        editor.putString(API_TRACK_END_POINT, value);
        editor.apply();
    }

    public static String getToken(Context context) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        return pref.getString(TOKEN, null);
    }

    public static void setToken(Context context, String value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0).edit();
        editor.putString(TOKEN, value);
        editor.apply();
    }
    /////////////////////////////////BOOLEAN

    public static Boolean getCheckAppReady(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        return prefs.getBoolean(CHECK_APP_READY, false);
    }

    public static void setCheckAppReady(Context context, Boolean value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0).edit();
        editor.putBoolean(CHECK_APP_READY, value);
        editor.apply();
    }

    public static Boolean getPreLoad(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        return prefs.getBoolean(PRE_LOAD, false);
    }

    public static void setPreLoad(Context context, Boolean value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0).edit();
        editor.putBoolean(PRE_LOAD, value);
        editor.apply();
    }

    public static Boolean getSlideUizaVideoEnabled(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        return prefs.getBoolean(SLIDE_UIZA_VIDEO_ENABLED, false);
    }

    public static void setSlideUizaVideoEnabled(Context context, Boolean value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0).edit();
        editor.putBoolean(SLIDE_UIZA_VIDEO_ENABLED, value);
        editor.apply();
    }

    /////////////////////////////////INT
    public static int getIndex(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        return prefs.getInt(INDEX, Constants.NOT_FOUND);
    }

    public static void setIndex(Context context, int value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0).edit();
        editor.putInt(INDEX, value);
        editor.apply();
    }

    //Object
    public static Auth getAuth(Context context, Gson gson) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        String json = pref.getString(AUTH, null);
        return gson.fromJson(json, Auth.class);
    }

    public static void setAuth(Context context, Auth auth, Gson gson) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0).edit();
        editor.putString(AUTH, gson.toJson(auth));
        editor.apply();
    }
}