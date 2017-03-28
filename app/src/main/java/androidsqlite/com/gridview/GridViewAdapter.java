package androidsqlite.com.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.id.list;

/**
 * Created by Yazdani on 2/7/2017.
 */

public class GridViewAdapter extends BaseAdapter {

    String[] mytext;
    int[]myimage;
    Context ct;

    private LayoutInflater inflater=null;


    GridViewAdapter(MainActivity mainact,String[] text,int[] img){

        this.mytext=text;
        this.myimage=img;
        this.ct=mainact;

        inflater=(LayoutInflater)ct.getSystemService(ct.LAYOUT_INFLATER_SERVICE);


    }

    @Override
    public int getCount() {
        return mytext.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class MyHolder{
        ImageView cimg;
        TextView ctext;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MyHolder myh=new MyHolder();
        View myview=inflater.inflate(R.layout.custom_list,null);
        myh.ctext=(TextView)myview.findViewById(R.id.textView2);
        myh.cimg=(ImageView)myview.findViewById(R.id.imageview_id);

        myh.ctext.setText(mytext[i]);
        myh.cimg.setImageResource(myimage[i]);

        return myview;
    }
}
