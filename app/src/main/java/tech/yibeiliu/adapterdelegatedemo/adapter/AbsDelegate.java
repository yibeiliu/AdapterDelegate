package tech.yibeiliu.adapterdelegatedemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2017/8/30.
 */

public interface AbsDelegate<T> {

    int isForViewType(List<T> lists, int position);

    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(RecyclerView.ViewHolder holder, int position);
}
