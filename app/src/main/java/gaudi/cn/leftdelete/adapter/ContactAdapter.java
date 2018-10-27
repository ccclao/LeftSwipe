package gaudi.cn.leftdelete.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import gaudi.cn.leftdelete.R;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.Holder> {

    private Context mContext;
    private List<IMContact> imContactList;

    public ContactAdapter(Context mContext,List<IMContact> imContactList) {

        this.mContext=mContext;
        this.imContactList = imContactList;
    }

    @NonNull
    @Override
    public ContactAdapter.Holder onCreateViewHolder( ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(mContext).inflate(R.layout.item_recycler, parent, false);
        return new Holder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.Holder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return imContactList.size();
    }


    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        private ImageView mBmp;

        Holder(View itemView) {
            super(itemView);

            View main = itemView.findViewById(R.id.main);
            main.setOnClickListener(this);
            main.setOnLongClickListener(this);

            View delete = itemView.findViewById(R.id.delete);
            delete.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.main:
                    Toast.makeText(v.getContext(), "点击了main，位置为：" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                    break;

                case R.id.delete:
                    Toast.makeText(v.getContext(), "shanchu，位置为：", Toast.LENGTH_SHORT).show();

                    break;
            }
        }

        @Override
        public boolean onLongClick(View v) {
            switch (v.getId()) {
                case R.id.main:
                    break;
            }
            return false;
        }
    }

}
