package com.geeks.nurkyz_chomoeva_hw3_7


import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.geeks.nurkyz_chomoeva_hw3_7.databinding.ItemMessageBinding

class ChatAdapter(private val chatModel: ArrayList<ChatModel>, val context: Context?) :
    RecyclerView.Adapter<ChatAdapter.ChatViewholder>() {

    companion object {
        const val USER1_VIEW_TYPE = 0
        const val USER2_VIEW_TYPE = 1
    }

    inner class ChatViewholder(val viewBinding: ItemMessageBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewholder {
        val viewBinding =
            ItemMessageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewholder(viewBinding)
    }

    override fun getItemCount(): Int = chatModel.size

    override fun onBindViewHolder(holder: ChatViewholder, position: Int) {
        val chatItem = chatModel[position]
        holder.viewBinding.messageTextView.text = chatItem.message

        holder.viewBinding.messageTextView.apply {
            setTextAppearance(
                context,
                if (chatItem.isUser1) {
                    R.style.User1_TextView

                } else {
                    R.style.User2_TextView
                }
            )
            setBackgroundResource(
                if (chatItem.isUser1) {
                    R.drawable.bg_btn_send
                } else {
                    R.drawable.bg_btn_send2
                }
            )
        }

        val layoutParams =
            holder.viewBinding.messageTextView.layoutParams as LinearLayout.LayoutParams
        layoutParams.gravity = if (chatItem.isUser1) Gravity.END else Gravity.START
        holder.viewBinding.messageTextView.layoutParams = layoutParams
    }

    override fun getItemViewType(position: Int): Int {
        return if (chatModel[position].isUser1) USER1_VIEW_TYPE else USER2_VIEW_TYPE
    }

}

