package com.example.p1.ui.gallery;

import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.p1.R;
import com.example.p1.sql.SQLite;

public class crearFragment extends Fragment {

    private crearViewModel crearViewModel;
    Spinner clasi, especie;
    RadioButton sexomacho, sexohembra;
    EditText nombre, fecha, habitat, alimentacion;
    Button btnguardar, btnlimpiar;
    public SQLite sqlite;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        crearViewModel =
                ViewModelProviders.of(this).get(crearViewModel.class);
        View root = inflater.inflate(R.layout.fragment_crear, container, false);
        final TextView textView = root.findViewById(R.id.textView);
        crearViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        }
        );

        clasi = root.findViewById(R.id.clasificrear);
        especie = root.findViewById(R.id.especiecrear);
        sexomacho =root.findViewById(R.id.machocrear);
        sexohembra = root.findViewById(R.id.hembracrear);
        nombre = root.findViewById(R.id.txtnombrecrear);
        fecha = root.findViewById(R.id.fecha_nacicrear);
        habitat = root.findViewById(R.id.txthabitadcrear);
        alimentacion = root.findViewById(R.id.txtalimentacioncrear);
        btnguardar = root.findViewById(R.id.btnguardarcrear);
        btnlimpiar = root.findViewById(R.id.btnlimpiarcrear);

        sqlite = new SQLite(getContext());
        sqlite.abrir();
        final ArrayAdapter<CharSequence> adapter=
                ArrayAdapter.createFromResource( getContext(),R.array.opciones, android.R.layout.simple_spinner_item

                );
        clasi.setAdapter(adapter);
        clasi.setOnItemSelectedListener(new
                                                AdapterView.OnItemSelectedListener() {
                                                    @Override
                                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                                                    }

                                                    @Override
                                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                                    }
                                                });
        return root;
    }
}