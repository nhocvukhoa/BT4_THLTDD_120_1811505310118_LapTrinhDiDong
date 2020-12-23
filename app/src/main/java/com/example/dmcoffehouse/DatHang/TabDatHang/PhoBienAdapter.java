package com.example.dmcoffehouse.DatHang.TabDatHang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dmcoffehouse.R;

import java.util.ArrayList;

public class PhoBienAdapter extends BaseAdapter {
    Context context;
    ArrayList<PhoBienModel> phobienData;
    LayoutInflater layoutInflater;
    PhoBienModel phobien;
    public PhoBienAdapter(Context context,ArrayList<PhoBienModel> phobienData){
        this.context=context;
        this.phobienData=phobienData;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return phobienData.size();
    }

    @Override
    public Object getItem(int i) {
        return phobienData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return phobienData.get(i).getId_118();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View view1=view;
        if(view1==null){
            view1=layoutInflater.inflate(R.layout.list_phobien,null,true);
        }
        ImageView sanpham_118=view1.findViewById(R.id.sanpham_118);
       TextView tensanpham_118=view1.findViewById(R.id.tensanpham_118);
        TextView gia_118=view1.findViewById(R.id.gia_118);

        phobien=phobienData.get(position);

        sanpham_118.setImageResource(phobien.getSanpham_118());
        tensanpham_118.setText(phobien.getTensanpham_118());
        gia_118.setText(phobien.getGia_118());
        return view1;
    }
}
