package androidsqlite.com.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String[] text={"Windos","Apple","Mac","Mac","Mac",
                "Windos","Apple","Mac","Mac","Mac",
                "Windos","Apple","Mac","Mac","Apple",

        };

        int[] image={

                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j,
                R.drawable.k,
                R.drawable.l,
                R.drawable.a,
                R.drawable.b,
                R.drawable.a,

        };

        GridView grd=(GridView)findViewById(R.id.grid_view);

        GridViewAdapter adapter=new GridViewAdapter(this,text,image);

        grd.setAdapter(adapter);

        grd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Clicked on "+text[i],Toast.LENGTH_SHORT).show();
            }
        });



    }
}
