package com.example.bicing_marcmartinez_manuelgarcia_lluisartes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptorEstacion extends RecyclerView.Adapter<AdaptorEstacion.ViewHolder> {
    private ArrayList<Estacion> estationList;
    private Context context;

    public AdaptorEstacion(Context context) {
        this.context = context;
        this.estationList = new ArrayList<>();
        this.cargarDades();
    }

    private void cargarDades() {


        this.estationList.add(new Estacion(1, "Estacion A", 50, "Dirección A", "Tipo A", true));
        this.estationList.add(new Estacion(2, "Estacion B", 30, "Dirección B", "Tipo B", false));
        this.estationList.add( new Estacion(3, "Estacion C", 40, "Dirección C", "Tipo C", true));
        this.estationList.add( new Estacion(4, "Estacion D", 60, "Dirección D", "Tipo D", false));
    }

    @NonNull
    @Override
    public AdaptorEstacion.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    public void onBindViewHolder(@NonNull AdaptorEstacion.ViewHolder holder, int position) {
            Estacion estacion= this.estationList.get(position);
            holder.name.setText(estacion.getNom());
            holder.adress.setText(estacion.getDireccion());
            holder.capacity.setText(estacion.getCapacidad()+"");
            holder.desciption.setText(estacion.getTipo());
        boolean isOpen = this.estationList.get(position).isAbierto();
        holder.setIcon(isOpen);
            //tenim de fer el listener per obri informaicio directa estacio
            //holder.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes manejar el clic en el elemento del RecyclerView
                // Por ejemplo, puedes abrir una nueva actividad o mostrar más información
                // sobre la estación seleccionada.
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.estationList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        //parts de la etiqueta
        private TextView name;
        private TextView adress;
        private TextView capacity;

        private TextView desciption;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.textViewName);
            this.adress = itemView.findViewById(R.id.textAdress);
            this.capacity = itemView.findViewById(R.id.textNumber);
            this.desciption=itemView.findViewById(R.id.textType);
        }
        public void setIcon(boolean isOpen){
            int iconId=isOpen?R.drawable.openico:R.drawable.closed_ico;
            //posar icone en el Textview
            name.setCompoundDrawablesWithIntrinsicBounds(iconId, 0, 0, 0);
        }

    }
}
