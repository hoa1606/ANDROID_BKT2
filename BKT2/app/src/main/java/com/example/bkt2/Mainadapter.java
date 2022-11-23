package com.example.bkt2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class Mainadapter extends FirebaseRecyclerAdapter<MainModel, Mainadapter.myViewHoder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public Mainadapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHoder holder, int position, @NonNull MainModel model) {
        holder.Ten_thuong_goi.setText(model.getTen_thuong_goi());
        holder.Ten_KH.setText(model.getTen_KH());

        Glide.with(holder.img.getContext())
                .load(model.getHinh_anh())
                .into(holder.img);
    }

    @NonNull
    @Override
    public myViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        return new myViewHoder(view);
    }

    class myViewHoder extends RecyclerView.ViewHolder{
        CircleImageView img;
        TextView Ten_thuong_goi, Ten_KH;

        public myViewHoder(@NonNull View itemView) {
            super(itemView);

            img = (CircleImageView) itemView.findViewById(R.id.img);
            Ten_thuong_goi = (TextView) itemView.findViewById(R.id.TextView_TenTG);
            Ten_KH = (TextView) itemView.findViewById(R.id.TextView_TenKH);
        }
    }
}
