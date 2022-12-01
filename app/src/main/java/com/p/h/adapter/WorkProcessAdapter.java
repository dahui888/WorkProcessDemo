package com.p.h.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.p.h.R;
import com.p.h.bean.WorkProcessBean;

import java.util.List;

/**
 * desc：工作流适配器
 */
public class WorkProcessAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<WorkProcessBean.DateBean> mList; //数据源
    private final Context context;      //上下文

    public WorkProcessAdapter(Context context, List<WorkProcessBean.DateBean> list) {
        this.context = context;
        this.mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itme_approval, parent, false);
        return new ApprovalViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ApprovalViewHolder vh = (ApprovalViewHolder) holder;
        WorkProcessBean.DateBean dataBean = mList.get(position);

        //第一条隐藏头部线
        if (position == 0) {
            vh.tvTopLine.setVisibility(View.INVISIBLE);
            vh.tvSpjg.setVisibility(View.GONE);

            //最后一条隐藏底部线
        } else if (position == mList.size() - 1) {
            vh.tvTopLine2.setVisibility(View.GONE);
            vh.tvSpjg.setVisibility(View.VISIBLE);

            //全部显示
        } else {
            vh.tvTopLine.setVisibility(View.VISIBLE);
            vh.tvTopLine2.setVisibility(View.VISIBLE);
            vh.tvSpjg.setVisibility(View.VISIBLE);
        }

        //已审批过
        if (dataBean.getStatus() == 1) {
            vh.rlEnd.setVisibility(View.VISIBLE);
            vh.tvName.setVisibility(View.GONE);
            vh.tvIndex.setBackgroundResource(R.drawable.approval_bg);
            vh.tvIndex.setTextColor(context.getResources().getColor(R.color.txt_5782EF));
            vh.tvTitle.setTextColor(context.getResources().getColor(R.color.txt_5782EF));

            //正在审批
        } else if (dataBean.getStatus() == 0) {
            vh.rlEnd.setVisibility(View.GONE);
            vh.tvName.setVisibility(View.VISIBLE);
            vh.tvIndex.setBackgroundResource(R.drawable.approval_bg2);
            vh.tvName.setTextColor(context.getResources().getColor(R.color.txt_303133));
            vh.tvIndex.setTextColor(context.getResources().getColor(R.color.txt_303133));
            vh.tvTitle.setTextColor(context.getResources().getColor(R.color.txt_303133));

            //未审批
        } else if (dataBean.getStatus() == -1) {
            vh.rlEnd.setVisibility(View.GONE);
            vh.tvName.setVisibility(View.VISIBLE);
            vh.tvIndex.setBackgroundResource(R.drawable.approval_bg3);
            vh.tvName.setTextColor(context.getResources().getColor(R.color.txt_A8ABB2));
            vh.tvIndex.setTextColor(context.getResources().getColor(R.color.txt_A8ABB2));
            vh.tvTitle.setTextColor(context.getResources().getColor(R.color.txt_A8ABB2));
        }

        //是否显示审批意见
        if (dataBean.getContent() != null) {
            vh.tvSpyj.setVisibility(View.VISIBLE);
            vh.tvSpyj.setText("审批意见：" + dataBean.getContent());
        } else {
            vh.tvSpyj.setVisibility(View.GONE);
        }

        //赋值
        vh.tvIndex.setText(String.valueOf(position + 1));
        vh.tvTitle.setText(dataBean.getName() == null ? "" : dataBean.getName());
        vh.tvSpr.setText("审批人: " + (dataBean.getUser() == null ? "" : dataBean.getUser()));
        vh.tvName.setText(dataBean.getUser() == null ? "" : dataBean.getUser());
        if (dataBean.getResult() == null) {
            vh.tvSpjg.setVisibility(View.GONE);
        } else {
            vh.tvSpjg.setText("审批结果: " + ResultName(dataBean.getResult()));
        }
        vh.tvSpsj.setText("审批时间: " + (dataBean.getEndTime() == null ? "" : dataBean.getEndTime()));
    }

    @Override
    public int getItemCount() {
        return null == mList ? 0 : mList.size();
    }

    //审批意见
    private String ResultName(Integer result) {
        if (result == null) {
            return "";
        } else if (result == 1) {
            return "同意";
        } else {
            return "不同意";
        }
    }

    private static class ApprovalViewHolder extends RecyclerView.ViewHolder {
        TextView tvTopLine;
        TextView tvIndex;
        TextView tvTopLine2;
        TextView tvTitle;
        TextView tvName;
        RelativeLayout rlEnd;
        TextView tvSpr;
        TextView tvSpjg;
        TextView tvSpyj;
        TextView tvSpsj;

        public ApprovalViewHolder(View itemView) {
            super(itemView);
            tvTopLine = itemView.findViewById(R.id.tvTopLine);
            tvIndex = itemView.findViewById(R.id.tvIndex);
            tvTopLine2 = itemView.findViewById(R.id.tvTopLine2);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvName = itemView.findViewById(R.id.tvName);
            rlEnd = itemView.findViewById(R.id.rlEnd);
            tvSpr = itemView.findViewById(R.id.tvSpr);
            tvSpjg = itemView.findViewById(R.id.tvSpjg);
            tvSpyj = itemView.findViewById(R.id.tvSpyj);
            tvSpsj = itemView.findViewById(R.id.tvSpsj);
        }
    }

}