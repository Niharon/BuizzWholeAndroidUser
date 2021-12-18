package com.niharon.buizzwholeandroiduser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.Holder> {
    Context context;
    ArrayList<String> quan=new ArrayList<>();
    ArrayList<String> unitprice=new ArrayList<>();
    ArrayList<String> total=new ArrayList<>();
    ArrayList<String> status=new ArrayList<>();
    ArrayList<Integer> image=new ArrayList<>();
    public CartAdapter(Context context,ArrayList<String> quan,ArrayList<String> unitprice,ArrayList<String> total,ArrayList<String> status,ArrayList<Integer> image){
        this.context=context;
        this.quan=quan;
        this.unitprice=unitprice;
        this.total=total;
        this.status=status;
        this.image=image;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.cart,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.product_img.setImageResource(image.get(position));
        holder.product_quan.setText(quan.get(position));
        holder.product_unit.setText(unitprice.get(position));
        holder.product_total.setText(total.get(position));
        holder.product_status.setText(status.get(position));

    }

    @Override
    public int getItemCount() {
        return status.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView product_img;
        TextView product_quan,product_unit,product_total,product_status;
        public Holder(@NonNull View itemView) {
            super(itemView);
            product_img=itemView.findViewById(R.id.cartImageView);
            product_quan=itemView.findViewById(R.id.cart_quan);
            product_unit=itemView.findViewById(R.id.cart_unit);
            product_total=itemView.findViewById(R.id.cart_total);
            product_status=itemView.findViewById(R.id.cart_status);
        }
    }
}
