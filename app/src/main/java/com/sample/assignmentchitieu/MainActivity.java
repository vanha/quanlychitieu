package com.sample.assignmentchitieu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;
        switch (item.getItemId())
        {
            case R.id.menu_quanlyloaichi:
                fragment = new DanhSachLoaiChiFragment();
                this.setTitle("Danh sách loại chi");
                fragmentTransaction.replace(R.id.frameContent, fragment);
                fragmentTransaction.commit();
                return true;
            case R.id.menu_khoanchi:
                fragment = new DanhSachLoaiChiFragment();
                this.setTitle("Danh sách khoản chi");
                fragmentTransaction.replace(R.id.frameContent, fragment, "");
                fragmentTransaction.commit();
                return true;
            case R.id.menu_thongke:
                fragment = new ThongKeFragment();
                this.setTitle("Danh sách thống kê");
                fragmentTransaction.replace(R.id.frameContent, fragment);
                fragmentTransaction.commit();
                return true;
            case R.id.menu_gioithieu:
                fragment = new GioiThieuFragment();
                this.setTitle("Danh sách giới thiệu");
                fragmentTransaction.replace(R.id.frameContent, fragment, "gioithieu");
                fragmentTransaction.commit();
                return true;

            case R.id.menu_themloaichi:
                fragment = new ThemLoaiChiFragment();
                this.setTitle("Thêm loại chi");
                fragmentTransaction.replace(R.id.frameContent, fragment, "themloaichi");
                fragmentTransaction.commit();
                return true;
            case R.id.menu_thoat:
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
