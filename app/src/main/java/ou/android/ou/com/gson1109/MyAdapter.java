package ou.android.ou.com.gson1109;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


/**
 * Created by 192_168_58_254 on 2017/11/9.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    ZooInfo[] zooInfo;

    public MyAdapter(Context context, ZooInfo[] zooInfo) {
        this.context = context;
        this.zooInfo = zooInfo;
    }

    @Override
    public int getCount() {
        return zooInfo.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.myitem, null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(zooInfo[i].E_Name);

        ImageView img = (ImageView) v.findViewById(R.id.imageView2);
        Picasso.with(context).load(zooInfo[i].E_Pic_URL).into(img);
        return v;
    }
}

