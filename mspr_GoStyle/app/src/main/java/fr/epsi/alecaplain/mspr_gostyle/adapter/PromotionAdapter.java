package fr.epsi.alecaplain.mspr_gostyle.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.epsi.alecaplain.mspr_gostyle.R;
import fr.epsi.alecaplain.mspr_gostyle.holder.PromotionHolder;
import fr.epsi.alecaplain.mspr_gostyle.model.Promotion;

public class PromotionAdapter extends RecyclerView.Adapter<PromotionHolder> implements View.OnClickListener {
    private View.OnClickListener onClickListener;
    private final List<Promotion> listPromotion;

    public PromotionAdapter(List<Promotion> listPromotion) {
        this.listPromotion = listPromotion;
    }

    @Override
    public void onClick(View v) {
        this.onClickListener.onClick(v);
    }

    @NonNull
    @Override
    public PromotionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promotion, parent, false);
        itemView.setOnClickListener(this);
        return new PromotionHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PromotionHolder holder, int position) {
        Promotion promotion = this.listPromotion.get(position);
        holder.getTvItemPromotionTitle().setText(promotion.getName());
        holder.getTvItemPromotionDescription().setText(promotion.getDescription());
        holder.getTvItemPromotionCategory().setText(promotion.getCategory().getName());
        holder.getTvItemPromotionCodeAdvantage().setText(promotion.getCodeAdvantage());
    }

    @Override
    public int getItemCount() {
        return this.listPromotion.size();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
