package com.example.notificacao.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notificacao.R;

import java.util.List;

public class AdapterNotificacao extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Notificacao> notificacao;

    public AdapterNotificacao(Context context, List<Notificacao> notificacao) {
        this.context = context;
        this.notificacao = notificacao;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        ViewHolder holder = new ViewHolder(view);
        view.setTag(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notificacao.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        LinearLayout telaNotificacoes;
        TextView textView_Nome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            telaNotificacoes = (LinearLayout) itemView.findViewById(R.id.tela_notificacoes);
            textView_Nome = (TextView) itemView.findViewById(R.id.title_mensagens);
        }
    }
}
