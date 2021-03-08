package fr.epsi.alecaplain.mspr_gostyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.epsi.alecaplain.mspr_gostyle.adapter.PromotionAdapter;
import fr.epsi.alecaplain.mspr_gostyle.holder.PromotionHolder;
import fr.epsi.alecaplain.mspr_gostyle.model.Category;
import fr.epsi.alecaplain.mspr_gostyle.model.Promotion;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMainLogin;
    private Button btnMainInscription;
    private TextView tvMainMessage;
    private Button btnMainDeconnecter;
    private Button btnMainQrCode;
    private RecyclerView rvMainListPromo;
    private List<Promotion> promotions = new ArrayList<Promotion>();
    private PromotionAdapter promotionAdapter;
    private PromotionHolder promotionHolderVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 10; i++) {
            Category category = new Category();
            category.setName("cat. " + i);
            Promotion promotion = new Promotion();
            promotion.setName("name" + i);
            promotion.setDescription("desc " + i);
            promotion.setCodeAdvantage("code " + i);
            promotion.setCategory(category);
            this.promotions.add(promotion);
        }

        this.btnMainLogin = this.findViewById(R.id.btnMainLogin);
        this.btnMainInscription = this.findViewById(R.id.btnMainInscription);
        this.tvMainMessage = this.findViewById(R.id.tvMainMessage);
        this.btnMainDeconnecter = this.findViewById(R.id.btnMainDeconnecter);
        this.btnMainQrCode = this.findViewById(R.id.btnMainQrCode);
        this.rvMainListPromo = this.findViewById(R.id.rvMainListPromo);
        this.btnMainLogin.setOnClickListener(this);
        this.btnMainInscription.setOnClickListener(this);
        this.btnMainDeconnecter.setOnClickListener(this);
        this.btnMainQrCode.setOnClickListener(this);
        this.promotionAdapter = new PromotionAdapter(this.promotions);
        this.promotionAdapter.setOnClickListener(this);
        this.rvMainListPromo.setAdapter(this.promotionAdapter);
        this.rvMainListPromo.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View v) {
        if(this.rvMainListPromo.equals(v.getParent())) {
            if(this.promotionHolderVisible != null) {
                this.promotionHolderVisible.getTvItemPromotionDescription().setVisibility(View.GONE);
                this.promotionHolderVisible.getTvItemPromotionCategory().setVisibility(View.GONE);
                this.promotionHolderVisible.getTvItemPromotionCodeAdvantage().setVisibility(View.GONE);
                this.promotionHolderVisible.getTvItemPromotionTitleCategory().setVisibility(View.GONE);
                this.promotionHolderVisible.getTvItemPromotionTitleCodeAdvantage().setVisibility(View.GONE);
            }
            PromotionHolder promotionHolder = (PromotionHolder) this.rvMainListPromo.getChildViewHolder(v);
            if(!promotionHolder.equals(this.promotionHolderVisible)) {
                promotionHolder.getTvItemPromotionDescription().setVisibility(View.VISIBLE);
                promotionHolder.getTvItemPromotionCategory().setVisibility(View.VISIBLE);
                promotionHolder.getTvItemPromotionCodeAdvantage().setVisibility(View.VISIBLE);
                promotionHolder.getTvItemPromotionTitleCategory().setVisibility(View.VISIBLE);
                promotionHolder.getTvItemPromotionTitleCodeAdvantage().setVisibility(View.VISIBLE);
                this.promotionHolderVisible = promotionHolder;
            } else {
                this.promotionHolderVisible = null;
            }
        } else if(this.btnMainLogin.equals(v)) {
        } else if(this.btnMainInscription.equals(v)) {
        } else if(this.btnMainDeconnecter.equals(v)) {
        } else if(this.btnMainQrCode.equals(v)) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("promotions", (Serializable) this.promotions);
            this.startActivity(new Intent(MainActivity.this, QRCodeActivity.class).putExtra("listPromotion", bundle));
        }
    }
}