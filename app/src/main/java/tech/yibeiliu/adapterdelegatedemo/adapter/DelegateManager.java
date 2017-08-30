package tech.yibeiliu.adapterdelegatedemo.adapter;

import android.support.v4.util.SparseArrayCompat;

import java.util.List;

/**
 * Created by Administrator on 2017/8/30.
 */

public class DelegateManager<E> {
    private SparseArrayCompat<AbsDelegate> absDelegateMap = new SparseArrayCompat<>();

    public void addDelegate(AbsDelegate delegate) {
        int index = absDelegateMap.size();
        absDelegateMap.put(index, delegate);
    }

    public int getItemViewType(List<E> lists,int position) {

        absDelegateMap.get(position).isForViewType(lists,position);
        return;
    }
}
