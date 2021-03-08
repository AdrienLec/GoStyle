package fr.epsi.alecaplain.mspr_gostyle.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.epsi.alecaplain.mspr_gostyle.R;

public class PromotionHolder extends RecyclerView.ViewHolder {
    private TextView tvItemPromotionTitle;
    private TextView tvItemPromotionDescription;
    private TextView tvItemPromotionCategory;
    private TextView tvItemPromotionCodeAdvantage;
    private TextView tvItemPromotionTitleCategory;
    private TextView tvItemPromotionTitleCodeAdvantage;

    public PromotionHolder(@NonNull View itemView) {
        super(itemView);
        this.tvItemPromotionTitle = itemView.findViewById(R.id.tvItemPromotionTitle);
        this.tvItemPromotionDescription = itemView.findViewById(R.id.tvItemPromotionDescription);
        this.tvItemPromotionCategory = itemView.findViewById(R.id.tvItemPromotionCategory);
        this.tvItemPromotionCodeAdvantage = itemView.findViewById(R.id.tvItemPromotionCodeAdvantage);
        this.tvItemPromotionTitleCategory = itemView.findViewById(R.id.tvItemPromotionTitleCategory);
        this.tvItemPromotionTitleCodeAdvantage = itemView.findViewById(R.id.tvItemPromotionTitleCodeAdvantage);
    }

    public TextView getTvItemPromotionTitle() {
        return tvItemPromotionTitle;
    }

    public TextView getTvItemPromotionDescription() {
        return tvItemPromotionDescription;
    }

    public TextView getTvItemPromotionCategory() {
        return tvItemPromotionCategory;
    }

    public TextView getTvItemPromotionCodeAdvantage() {
        return tvItemPromotionCodeAdvantage;
    }

    public TextView getTvItemPromotionTitleCategory() {
        return tvItemPromotionTitleCategory;
    }

    public TextView getTvItemPromotionTitleCodeAdvantage() {
        return tvItemPromotionTitleCodeAdvantage;
    }
}
