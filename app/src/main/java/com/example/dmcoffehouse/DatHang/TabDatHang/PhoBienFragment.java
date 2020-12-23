package com.example.dmcoffehouse.DatHang.TabDatHang;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.dmcoffehouse.R;

import java.util.ArrayList;


public class PhoBienFragment extends Fragment {

    private GridView gridView;
    Context context;
    private ConstraintLayout rela;
    private ArrayList<PhoBienModel> phobienData;
    private PhoBienAdapter phoBienAdapter;
    private PhoBienModel phobien;

    public PhoBienFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context=getActivity();
        View root=inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gridView=root.findViewById(R.id.gridview_118);
        phobienData=new ArrayList<>();
        listphobien();
        muahang();
        phoBienAdapter=new PhoBienAdapter(context,phobienData);
        gridView.setAdapter(phoBienAdapter);
        registerForContextMenu(gridView);
       return root;
    }
    private void listphobien(){
        phobien=new PhoBienModel();
        phobien.setId_118(1);
        phobien.setSanpham_118(R.drawable.phobien1);
        phobien.setTensanpham_118("Cà phê Lúa mạch đá xay");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(2);
        phobien.setSanpham_118(R.drawable.phobien2);
        phobien.setTensanpham_118("Cà phê Lúa mạch nóng");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(3);
        phobien.setSanpham_118(R.drawable.phobien3);
        phobien.setTensanpham_118("Socola Lúa mạch đá xay");
        phobien.setGia_118("59.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(4);
        phobien.setSanpham_118(R.drawable.phobien4);
        phobien.setTensanpham_118("Socola Lúa mạch nóng");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);
    }
    private void muahang(){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Dialog dialog= new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.activity_mua_hang);
                dialog.show();
            }
        });
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog= new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.fragment_pho_bien);
                dialog.show();
                return true;
            }
        });
    }
}