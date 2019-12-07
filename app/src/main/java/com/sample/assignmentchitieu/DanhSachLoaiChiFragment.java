package com.sample.assignmentchitieu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.sample.assignmentchitieu.dao.LoaiChiDAO;
import com.sample.assignmentchitieu.model.LoaiChi;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DanhSachLoaiChiFragment extends Fragment {

    private ListView lvLoaiChi;
    private LoaiChiDAO loaiChiDAO;
    private List<LoaiChi> dsLoaiChi;

    public DanhSachLoaiChiFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        loaiChiDAO = new LoaiChiDAO(getActivity());
        dsLoaiChi = loaiChiDAO.getAllLoaiChi();

        ArrayAdapter adapter = new ArrayAdapter(
                getActivity(),
                android.R.layout.simple_list_item_1 ,
                dsLoaiChi);

        View view = inflater.inflate(R.layout.fragment_danhsachloaichi, container, false);
        lvLoaiChi = view.findViewById(R.id.lvLoaiChi);

        lvLoaiChi.setAdapter(adapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.menu_loaichi, menu);
    }


}
