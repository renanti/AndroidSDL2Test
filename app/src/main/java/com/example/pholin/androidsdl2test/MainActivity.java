package com.example.pholin.androidsdl2test;

import org.libsdl.app.SDLActivity;

public class MainActivity extends SDLActivity {
    @Override
    protected String[] getLibraries() {
        return new String[] {
            "NativeMain",
        };
    }
}
