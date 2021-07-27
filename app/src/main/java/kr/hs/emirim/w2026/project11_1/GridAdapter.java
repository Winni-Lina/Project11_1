package kr.hs.emirim.w2026.project11_1;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.movie1, R.drawable.movie2, R.drawable.movie3, R.drawable.movie4, R.drawable.movie5, R.drawable.movie6, R.drawable.movie7, R.drawable.movie8, R.drawable.movie9, R.drawable.movie10, R.drawable.movie1, R.drawable.movie2, R.drawable.movie3, R.drawable.movie4, R.drawable.movie5, R.drawable.movie6, R.drawable.movie7, R.drawable.movie8, R.drawable.movie9, R.drawable.movie10};
    String[] posterName = {"영화1", "영화2", "영화3", "영화4", "영화5", "영화6", "영화7", "영화8", "영화9", "영화10", "영화1", "영화2", "영화3", "영화4", "영화5", "영화6", "영화7", "영화8", "영화9", "영화10"};

    public GridAdapter(Context context){
        this.context = context;

    }
    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(posterIds[i]);

        final int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context, R.layout.dialog1, null);
                ImageView imgvLarge = dialogView.findViewById(R.id.imgv_large);
                imgvLarge.setImageResource(posterIds[pos]);
                dialog.setTitle(posterName[pos]);
                dialog.setIcon(R.drawable.movie_icon);
                dialog.setView(dialogView);
                dialog.setNegativeButton("close", null);
                dialog.show();
            }
        });

        return imgv;
    }
}
