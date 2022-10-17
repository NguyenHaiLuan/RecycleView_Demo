package nhl69.luansapp.recycleviewdemo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterHoa extends RecyclerView.Adapter<AdapterHoa.DataViewHolder> {

    private List<Hoa> hoas;
    private Context context;

    public AdapterHoa(List<Hoa> hoas, Context context) {
        this.hoas = hoas;
        this.context = context;
    }


    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycle, parent, false);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHoa.DataViewHolder holder, int position) {
        Hoa hoa = hoas.get(position);
        holder.mtenhoa.setText(hoa.getTen());
        holder.mmauhoa.setText(hoa.getMau());
        holder.mhinhhoa.setImageResource(hoa.getHinh());
    }

    @Override
    public int getItemCount() {
        return hoas.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {

        private TextView mtenhoa, mmauhoa;
        private ImageView mhinhhoa;

        public DataViewHolder(View itemView) {
            super(itemView);
            mtenhoa = (TextView) itemView.findViewById(R.id.tenHoa);
            mmauhoa = (TextView) itemView.findViewById(R.id.mauHoa);
            mhinhhoa = (ImageView) itemView.findViewById(R.id.hinh);
        }
    }

}
