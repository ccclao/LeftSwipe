package gaudi.cn.leftdelete;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import gaudi.cn.leftdelete.adapter.ContactAdapter;
import gaudi.cn.leftdelete.adapter.IMContact;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initSwipe();
        initDatas();
        initView();

    }

    /*private void initSwipe() {

        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swipe_refresh);
        swipeRefreshLayout.setColorSchemeColors(Color.RED);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                },2000);
            }
        });
    }*/

    private void initDatas() {

        IMContact imContact =new IMContact("Lebron","13183749292");
        List<IMContact> imContacts = new ArrayList<>();
        for(int i=0;i<10;i++){

            imContacts.add(imContact);

        }
        contactAdapter =new ContactAdapter(this,imContacts);
    }

    private void initView() {

        recyclerView=(RecyclerView)findViewById(R.id.id_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new SwipeItemLayout.OnSwipeItemTouchListener(this));
        recyclerView.setAdapter(contactAdapter);
    }

}
