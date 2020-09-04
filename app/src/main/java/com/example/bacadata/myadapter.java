package com.example.bacadata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder> {

    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {

        holder.nama.setText(model.getNama());
        holder.alamat.setText(model.getAlamat());
        holder.emaill.setText(model.getEmaill());
        holder.telpon.setText(model.getTelpon());

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent, false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder

    {
        CircleImageView img;
        TextView alamat,emaill,nama,telpon;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img=(CircleImageView) itemView.findViewById(R.id.img1);
            alamat=(TextView)itemView.findViewById(R.id.alamattext);
            nama=(TextView)itemView.findViewById(R.id.namatext);
            emaill=(TextView)itemView.findViewById(R.id.emailtext);
            telpon=(TextView)itemView.findViewById(R.id.telpontext);
        }
    }
}
