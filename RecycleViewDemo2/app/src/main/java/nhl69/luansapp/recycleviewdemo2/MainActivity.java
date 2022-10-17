package nhl69.luansapp.recycleviewdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recvHoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Hoa> hoas = new ArrayList<>();
        hoas.add(new Hoa("Lan", "Vàng", R.drawable.lan));
        hoas.add(new Hoa("Hồng", "Trắng", R.drawable.hong));

        recvHoa = (RecyclerView) findViewById(R.id.recycleviewhoa);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recvHoa.setLayoutManager(layoutManager);
        recvHoa.setHasFixedSize(true);
        recvHoa.setAdapter(new AdapterHoa(hoas, this));
    }
}