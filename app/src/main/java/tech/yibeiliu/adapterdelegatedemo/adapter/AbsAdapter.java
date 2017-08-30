package tech.yibeiliu.adapterdelegatedemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import tech.yibeiliu.adapterdelegatedemo.entity.TypeEntity;

/**
 * Created by Administrator on 2017/8/30.
 */

public class AbsAdapter extends RecyclerView.Adapter {
    private List<TypeEntity> mLists;
    private DelegateManager manager = new DelegateManager();

    public AbsAdapter() {

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        manager.onCreateViewHolder();
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mLists.size();
    }

    @Override
    public int getItemViewType(int position) {
        return manager.getItemViewType(mLists,position);
    }
}
