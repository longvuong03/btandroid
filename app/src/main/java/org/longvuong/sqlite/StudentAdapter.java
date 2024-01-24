package org.longvuong.sqlite;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    private List<Student> studentList;
    private Context context;

    public StudentAdapter( Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_student, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student user = studentList.get(position);

        holder.idTextView.setText("id: " + user.getId());
        holder.emailTextView.setText("ten: " + user.getHoten());
        holder.passwordTextView.setText("diachi: " + user.getDiachi());
        holder.roleTextView.setText("sdt: " + user.getSdt());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView idTextView;
        public TextView emailTextView;
        public TextView passwordTextView;
        public TextView roleTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTextView = itemView.findViewById(R.id.idTextView);
            emailTextView = itemView.findViewById(R.id.emailTextView);
            passwordTextView = itemView.findViewById(R.id.passwordTextView);
            roleTextView = itemView.findViewById(R.id.roleTextView);
        }
    }
}