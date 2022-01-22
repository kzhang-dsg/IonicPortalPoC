package com.dunnsolutions.ionicportalpoc;

import android.app.Application;

import java.util.Arrays;
import java.util.HashMap;

import io.ionic.portals.PortalManager;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // setup portals

        // Register Portals
        PortalManager.register("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIxNTZjOWFkNS01MDg3LTRiYTMtYjBiMi1mYTRkOTRkZGU3YjUifQ.IG0Q7StAv9akwMecEvylZQJrZnkY1Re0-ZlDbBbWFvhx3Gdv7hqo7g7lmyHkiUZTseNw8ASMv31KXfbGmMdFWoiM_sq6gUf_tuqo-_6yn7bJJ8Neoi5lnzp5WPxeMA_QEgj4b06k7xwvo1ftWM-ZusBWLEnCHmXDxogxxKVAjSOCBQRSL0C_84m7TwNHA_wEDeROCCS1yVCf2j8cj8z4a9XozuyplxuClll4xmrsbH2nzfXJjZ9f-8zuHHmcSupRJ868Ivw2YnaADOzO0PFdtupZIiKbVPI7qv4J_XF2uVjUegPH_SMNtwLP4DuXs6_qAMxBH-DaOJjcvRcG53MgCw");

        PortalManager.newPortal("MINI_APP_1")
                .setStartDir("miniApp1")
                .create();

        PortalManager.newPortal("MINI_APP_2")
                .setStartDir("miniApp2")
                .create();


    }
}
