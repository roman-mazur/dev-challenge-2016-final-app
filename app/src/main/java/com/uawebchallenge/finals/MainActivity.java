package com.uawebchallenge.finals;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ImageView imageView = (ImageView) findViewById(R.id.image);

    // TODO: Draw the image.
    // What image? Start with https://i-will-not-tell-you-but-git-can-help
    imageView.setImageResource(R.mipmap.ic_launcher);
  }
}
