package com.example.android.threegoldenrulesfinalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FiveThingsToKnow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_things_to_know);
        myBundleOfRightsButton();
        myRightLocation();
        myRightMortgage();
        myRightPrice();
        myRightAgent();
    }

    public void myBundleOfRightsButton() {
        Button aBundleOfRights = (Button) findViewById(R.id.thebundleofrights);
        aBundleOfRights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                this.activityButton = activityButton;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Bundle_of_rights"));
                startActivity(browserIntent);
                //
            }
        });
    }

    public void myRightLocation() {
        Button aRightLocation = (Button) findViewById(R.id.therightlocation);
        aRightLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                this.activityButton = activityButton;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.planning.org/greatplaces/neighborhoods/characteristics.htm"));
                startActivity(browserIntent);
                //
            }
        });
    }

    public void myRightMortgage() {
        Button aRightMortgage = (Button) findViewById(R.id.therightmortgage);
        aRightMortgage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                this.activityButton = activityButton;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nerdwallet.com/blog/mortgages/get-the-best-mortgage-rates/"));
                startActivity(browserIntent);
                //
            }
        });
    }

    public void myRightPrice() {
        Button aRightPrice = (Button) findViewById(R.id.therightprice);
        aRightPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                this.activityButton = activityButton;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.investopedia.com/articles/mortgages-real-estate/08/fair-price-on-home.asp"));
                startActivity(browserIntent);
                //
            }
        });
    }
    public void myRightAgent() {
        Button aRightAgent = (Button) findViewById(R.id.therightagent);
        aRightAgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                this.activityButton = activityButton;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.wikihow.com/Find-a-Good-Real-Estate-Agent"));
                startActivity(browserIntent);
                //
            }
        });
    }

}
