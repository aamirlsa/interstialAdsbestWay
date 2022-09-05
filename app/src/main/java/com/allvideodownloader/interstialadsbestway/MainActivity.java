package com.allvideodownloader.interstialadsbestway;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.allvideodownloader.interstialadsbestway.ads.Admob;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Admob.mInterstitialAd!=null){

            Admob.mInterstitialAd.show(MainActivity.this);

            Admob.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdClicked() {
                    super.onAdClicked();
                }

                @Override
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    Admob.mInterstitialAd=null;
                    Admob.loadInter(MainActivity.this);
                }

                @Override
                public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                    super.onAdFailedToShowFullScreenContent(adError);
                }

                @Override
                public void onAdImpression() {
                    super.onAdImpression();
                }

                @Override
                public void onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent();
                }
            });
        }
        else {
            Toast.makeText(this, "ads not loaded", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Admob.mInterstitialAd=null;

    }
}