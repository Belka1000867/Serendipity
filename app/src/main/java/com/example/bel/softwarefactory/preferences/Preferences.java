package com.example.bel.softwarefactory.preferences;

import org.androidannotations.annotations.sharedpreferences.SharedPref;

@SharedPref(SharedPref.Scope.APPLICATION_DEFAULT)
public interface Preferences {

    String user();

    boolean loggedIn();

    boolean rememberUser();

    boolean facebookLogin();

    long facebookId();

    String profilePictureUrl();

    String lastPosition();

    String audioRecordsList();

}
