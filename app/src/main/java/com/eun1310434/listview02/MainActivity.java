/*=====================================================================
□ Infomation
  ○ Data : 08.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ 간단한 리스트 뷰 만들기
  ○ ListActivity를 상속받아 구현
     - actionBar가 안보임

□ Study
  ○
=====================================================================*/
package com.eun1310434.listview02;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {
    // 사용할 데이터들
    String[] items = { "a", "b", "d", "e", "f", "g", "h", "i" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ArrayAdapter를 사용하여 어댑터 설정
        setListAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                items));

    }

    protected void onListItemClick(ListView list, View v, int position, long id) {
        super.onListItemClick(list, v, position, id);
        String text = "position : " + position + " " + items[position];
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

}

