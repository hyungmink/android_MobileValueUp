package org.mjd.mygps;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class RestourantActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restourant);
        LinearLayout resLayout =  (LinearLayout) findViewById(R.id.resLayout);
        String title = getIntent().getExtras().getString("title"); // ����Ʈ�� �Ѿ�� Ÿ��Ʋ �ޱ�. ���� ��� key�� Ȱ���ϸ� �ɵ�. ��Ƽ��Ƽ�� ���� Ȱ��
        //�ؽ�Ʈâ
        TextView text1 = new TextView(this);
        text1.setText(title);
        resLayout.addView(text1);

        //�޴��׸�
        //�׸������� http://blog.naver.com/yikj1004/134314705
        ImageView resImage = (ImageView) findViewById(R.id.resImage);
        resImage.setImageResource(R.drawable.arrow);

        //����
        String temp = getIntent().getExtras().getString("key");
        String explain = "no value"; //�ѱ۷� �ȳ����� ���� ó���Ұ�.
        if(temp.equals("1")) {
         explain = "goooooodd";
        }
        TextView text2 = new TextView(this);
        text2.setText(explain);
        resLayout.addView(text2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_restourant, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
