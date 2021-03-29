package co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.Home;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.zw.techsolutes.happyfirst.R;

public class DisplayAdapter  extends  RecyclerView.Adapter<DisplayAdapter.DataViewHolder> {

        List<DisplayData> list;

        Context context;


public DisplayAdapter (List<DisplayData> list, Context context) {
        this.list = list;
        this.context = context;

        }


@Override
public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {

        context=parent.getContext();


        return new DisplayAdapter.DataViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_my_info,parent,false));
        }

@Override
public void onBindViewHolder(@NonNull DataViewHolder holder, int position){
      DisplayData incomingData = list.get(position);





        holder.labName.setText(incomingData.getTopic());
        holder.labAddress.setText(incomingData.getBody());
        holder.pic.setImageResource(incomingData.getPicid());

        }

@Override
public int getItemCount()
        {
        return list.size();
        }


public static class DataViewHolder extends RecyclerView.ViewHolder {
    TextView labName;
    TextView labAddress;
    ImageView pic;


    DataViewHolder(View itemView) {
        super(itemView);
        labName = itemView.findViewById(R.id.lab_name);
        labAddress = itemView.findViewById(R.id.lab_address);
        pic = itemView.findViewById(R.id.examPic);

         }

    }
}

