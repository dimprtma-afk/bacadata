package com.example.bacadata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


public class myadapter2 extends FirebaseRecyclerAdapter<model2,myadapter2.myviewholder> {

    public myadapter2(@NonNull FirebaseRecyclerOptions<model2> options) {
        super(options);
    }
    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model2 model2) {

        holder.nama2.setText(model2.getNama2());
        holder.alamat2.setText(model2.getAlamat2());
        holder.email2.setText(model2.getEmail2());
        holder.telpon2.setText(model2.getTelpon2());
        holder.keluhann.setText(model2.getKeluhann());

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.doublerow,parent, false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {

        CircleImageView img2;
        TextView alamat2,email2,nama2,telpon2,keluhann;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img2=(CircleImageView) itemView.findViewById(R.id.img2);
            alamat2=(TextView)itemView.findViewById(R.id.alamattext2);
            nama2=(TextView)itemView.findViewById(R.id.namatext2);
            email2=(TextView)itemView.findViewById(R.id.emailtext2);
            telpon2=(TextView)itemView.findViewById(R.id.telpontext2);
            keluhann=(TextView)itemView.findViewById(R.id.keluhann);


        }
    }
}
