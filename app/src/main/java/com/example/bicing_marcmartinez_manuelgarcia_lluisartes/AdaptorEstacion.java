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
    private ArrayList<Estacion> estattionList;
    private Context context;

    public AdaptorEstacion(Context context) {
        this.context = context;
        this.estattionList= new ArrayList<>();
        this.cargarDades();
    }

    private void cargarDades() {


        this.estattionList.add(new Estacion(1, "Estacion A", 50, "Dirección A", "Tipo A", true));
        this.estattionList.add(new Estacion(2, "Estacion B", 30, "Dirección B", "Tipo B", false));
        this.estattionList.add( new Estacion(3, "Estacion C", 40, "Dirección C", "Tipo C", true));
        this.estattionList.add( new Estacion(4, "Estacion D", 60, "Dirección D", "Tipo D", false));
    }

    @NonNull
    @Override
    public AdaptorEstacion.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    public void onBindViewHolder(@NonNull AdaptorEstacion.ViewHolder holder, int position) {
            Estacion estacion= this.estattionList.get(position);
            holder.name.setText(estacion.getNom());
            holder.adress.setText(estacion.getDireccion());
            holder.capacity.setText(estacion.getCapacidad());
            holder.desciption.setText(estacion.getTipo());
        boolean isOpen = this.estattionList.get(position).isAbierto();
        holder.setIcon(isOpen);
            //tenim de fer el listener per obri informaicio directa estacio
            //holder.

    }

    @Override
    public int getItemCount() {
        return this.estattionList.size();
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
