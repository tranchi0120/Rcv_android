package com.example.rcv_firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private static final  String Tag = "Recyclerview";
    private Context mcontext;
    private ArrayList<Messages> messagesList;

    public RecyclerAdapter(Context mcontext, ArrayList<Messages> messagesList) {
        this.mcontext = mcontext;
        this.messagesList = messagesList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ////////////
        holder.textView.setText(messagesList.get(position).getName());


        ///////imageview
        Glide.with(mcontext)
                .load(messagesList.get(position)
                .getImageUrl()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemview){
            super(itemview);


            imageView = itemview.findViewById(R.id.imageview);
            textView = itemview.findViewById(R.id.texview);
        }
    }

}
