package com.example.vishwajeet.spiderg;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import static android.R.attr.resource;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    int[] images ={R.drawable.hum,R.drawable.google1,R.drawable.talks,R.drawable.rangnarok,R.drawable.google,R.drawable.let_me_love_you,R.drawable.a,R.drawable.chain};
    String [] names={"Humorously Yours S01E01","Introducing daydream view","Ted 2017","Rangnarok trailer","Google I/O 2017","Let me love you","Attention","Don't let me down"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
      customAdapter1 customAdapter =new customAdapter1(this,names,images);
       list.setAdapter(customAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(list.getItemAtPosition(position).toString()=="Humorously Yours S01E01"){
                    Intent intent = new Intent(MainActivity.this,webview.class);
                    intent.putExtra("videoname","https://www.youtube.com/watch?v=-0XiiT5dR_Q");
                    startActivity(intent);
                }
                if(list.getItemAtPosition(position).toString()=="Introducing daydream view"){
                    Intent intent = new Intent(MainActivity.this,webview.class);
                    intent.putExtra("videoname","https://www.youtube.com/watch?v=rLLAA4ENIP4");
                    startActivity(intent);
                }
                if(list.getItemAtPosition(position).toString()=="Ted 2017"){
                    Intent intent = new Intent(MainActivity.this,webview.class);
                    intent.putExtra("videoname","https://www.youtube.com/watch?v=0NV1KdWRHck");
                    startActivity(intent);
                }
                if(list.getItemAtPosition(position).toString()=="Rangnarok trailer"){
                    Intent intent = new Intent(MainActivity.this,webview.class);
                    intent.putExtra("videoname","https://www.youtube.com/watch?v=v7MGUNV8MxU");
                    startActivity(intent);
                }
                if(list.getItemAtPosition(position).toString()=="Google I/O 2017"){
                    Intent intent = new Intent(MainActivity.this,webview.class);
                    intent.putExtra("videoname","https://www.youtube.com/watch?v=dpnxTXILS4s");
                    startActivity(intent);
                }
                if(list.getItemAtPosition(position).toString()=="Let me love you"){
                    Intent intent = new Intent(MainActivity.this,webview.class);
                    intent.putExtra("videoname","https://www.youtube.com/watch?v=euCqAq6BRa4");
                    startActivity(intent);
                }
                if(list.getItemAtPosition(position).toString()=="Attention"){
                    Intent intent = new Intent(MainActivity.this,webview.class);
                    intent.putExtra("videoname","https://www.youtube.com/watch?v=nfs8NYg7yQM");
                    startActivity(intent);
                }
                if(list.getItemAtPosition(position).toString()=="Don't let me down"){
                    Intent intent = new Intent(MainActivity.this,webview.class);
                    intent.putExtra("videoname","https://www.youtube.com/watch?v=Io0fBr1XBUA");
                    startActivity(intent);
                }



            }
        });

       // ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this,R.layout.customlayout,R.id.textView3_name,names);
        //list.setAdapter(Adapter);
    }

    class customAdapter1 extends ArrayAdapter<String> {
        Context context;
         int [] images;
        String [] title;
        public customAdapter1(Context c, String[] names,int im[]) {
            super(c, R.layout.customlayout, R.id.textView3_name, names );
            this.context = c;
            this.images=im;
            this.title=names;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup Parent) {
            View row=convertView;
            if(row==null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.customlayout, Parent, false);
            }
            ImageView image = (ImageView) row.findViewById(R.id.imageView);
            TextView text= (TextView) row.findViewById(R.id.textView3_name);

            image.setImageResource(images[position]);
            text.setText(title[position]);
            return row;
        }

    }


}
