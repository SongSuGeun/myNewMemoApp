package com.example.mymemoapp.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    val memos: MutableList<MemoData> = mutableListOf()
    val memoLiveData: MutableLiveData<MutableList<MemoData>> by lazy {
        MutableLiveData<MutableList<MemoData>>().apply {
            value = memos
        }
    }

    fun addMemo(data: MemoData) {
        val tempList = memoLiveData.value
        tempList?.add(data)
        memoLiveData.value = tempList
    }
}