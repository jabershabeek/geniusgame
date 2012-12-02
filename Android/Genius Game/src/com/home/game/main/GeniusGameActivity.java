package com.home.game.main;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

@SuppressLint("SetJavaScriptEnabled")
public class GeniusGameActivity extends Activity {


private WebView mainView;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mainView=new WebView(this);
		Display display=getWindowManager().getDefaultDisplay();
		mainView.setLayoutParams(new LayoutParams(display.getWidth(), display.getHeight()));
		mainView.clearCache(true);
		mainView.setWebViewClient(new WebViewSampleClient());
		mainView.setWebChromeClient(new WebChromeClient());
		//view.buildDrawingCache(true);
		//view.setClickable(true);
		//view.setHorizontalScrollBarEnabled(false);
		//view.setVerticalScrollBarEnabled(false);
		//view.setScrollbarFadingEnabled(false);
		mainView.getSettings().setJavaScriptEnabled(true);
		//view.getSettings().setDomStorageEnabled(true);
		mainView.loadUrl("file:///android_asset/killer.htm");
		
		setContentView(mainView);


	}
	
	 private class WebViewSampleClient extends WebViewClient {
	       
	        @Override
	        public boolean shouldOverrideUrlLoading(WebView view, String url) {
	            view.loadUrl(url);  
	           
	            return true;
	        }
	       
	  }

}