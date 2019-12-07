package com.sample.assignmentchitieu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.sample.assignmentchitieu.dao.LoaiChiDAO;
import com.sample.assignmentchitieu.model.KhoanChi;
import com.sample.assignmentchitieu.model.LoaiChi;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThemKhoanChiFragment extends Fragment {

    private Spinner spLoaiChi;
    private LoaiChiDAO loaiChiDAO;
    private List<LoaiChi> dsLoaiChi;

    public ThemKhoanChiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        loaiChiDAO = new LoaiChiDAO(getActivity());
        dsLoaiChi = loaiChiDAO.getAllLoaiChi();

        View view = inflater.inflate(R.layout.fragment_themkhoanchi, container, false);

        spLoaiChi = view.findViewById(R.id.spLoaiChi);

        ArrayAdapter<LoaiChi> adapter = new ArrayAdapter<LoaiChi>(
                getActivity(),
                android.R.layout.simple_spinner_item,
                dsLoaiChi);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spLoaiChi.setAdapter(adapter);


        Button btLuuKhoanChi = view.findViewById(R.id.btLuuKC);
        EditText edMaKC = view.findViewById(R.id.edMaKC);
        EditText edTenKC = view.findViewById(R.id.edTenKC);
        EditText edSoTien = view.findViewById(R.id.edSoTien);
        EditText edNgayChi = view.findViewById(R.id.edNgayChi);

        LoaiChi objLoaiChi = (LoaiChi) spLoaiChi.getSelectedItem();
        String maLoaiChi = objLoaiChi.getMaLoaiChi();
        String maKhoanChi = edMaKC.getText().toString();
        String tenKhoanChi = edTenKC.getText().toString();
        double soTien = Double.parseDouble(edSoTien.getText().toString());
        String ngayChi = edNgayChi.getText().toString();

        KhoanChi objKhoanChi = new KhoanChi(maKhoanChi, tenKhoanChi, soTien, ngayChi, maLoaiChi);

        btLuuKhoanChi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        return view;
    }

}
