package com.example.zhach.bme_finalpro;

import android.app.Application;

import com.parse.Parse;

public class parseini extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
//                .applicationId( "da61db0697d4310087bcdeedffe1f7914de056bb")
//                .clientKey("a986f237bdc8b1ca32c9a805e1e2d293913e8eb8")
//                .server("http://18.220.193.165:80/parse/")
//                .build()
                        .applicationId( "3c87e8634e9e27612fed0261a76a324a61a7b5bc")
                        .clientKey("596f6d15f8c7ed65aaa3b6d77c28cacc32d5ac49")
                        .server("http://3.16.42.58:80/parse/")
                        .build()
        );
    }
}
