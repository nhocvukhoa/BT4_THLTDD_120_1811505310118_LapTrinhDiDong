package com.example.dmcoffehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.dmcoffehouse.CuaHang.CuaHangFragment;
import com.example.dmcoffehouse.DatHang.DatHangFragment;
import com.example.dmcoffehouse.TaiKhoan.TaiKhoanFragment;
import com.example.dmcoffehouse.TinTuc.TinTucFragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav=findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TinTucFragment()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment=null;
            switch (item.getItemId()){
                case R.id.nagavition_tintuc:
                    selectedFragment=new TinTucFragment();
                    break;
                case R.id.nagavition_dathang:
                    selectedFragment=new DatHangFragment();
                    break;
                case R.id.nagavition_cuahang:
                    selectedFragment=new CuaHangFragment();
                    break;
                case R.id.nagavition_taikhoan:
                    selectedFragment=new TaiKhoanFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
        }
    };
}