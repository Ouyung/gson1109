package ou.android.ou.com.gson1109;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by 192_168_58_254 on 2017/11/9.
 */

public class MyAdapter extends BaseAdapter{
    Context context;
    ZooInfo[] zooInfo;

    public MyAdapter(Context context,ZooInfo[] zooInfo){
        this.context = context;
        this.zooInfo = zooInfo;
    }
    @Override
    public int getCount() {
        return zooInfo.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.myitem,null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(zooInfo[i].E_Name);

        return v;
    }
}

