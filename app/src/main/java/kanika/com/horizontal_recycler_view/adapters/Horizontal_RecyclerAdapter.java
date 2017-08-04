package kanika.com.horizontal_recycler_view.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kanika.com.horizontal_recycler_view.R;


/**
 * Created by Kanika on 12/6/17.
 */

public class Horizontal_RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;

    public Horizontal_RecyclerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_horizontal_suggestion, null);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CustomViewHolder){
            CustomViewHolder viewHolder = (CustomViewHolder) holder;
            viewHolder.setData(position);
        }
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    private class CustomViewHolder extends RecyclerView.ViewHolder {

        ImageView imageSuggest;
        TextView textGroupName;
        TextView textMemberCount;
        CardView card_suggestion;
        public CustomViewHolder(View view) {
            super(view);
            imageSuggest = (ImageView) view.findViewById(R.id.imageSuggest);
            textGroupName = (TextView) view.findViewById(R.id.textGroupName);
            textMemberCount = (TextView) view.findViewById(R.id.textMemberCount);
            card_suggestion = (CardView) view.findViewById(R.id.card_suggestion);
        }


        public void setData(int position) {

        }
    }

}
