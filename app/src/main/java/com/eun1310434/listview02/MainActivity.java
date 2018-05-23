/*=====================================================================
□ INFORMATION
  ○ Data : 23.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference
     - Do it android app Programming
     - Hello JAVA Programming
     - http://itmining.tistory.com/5

□ FUNCTION
  ○ 간단한 리스트 뷰 만들기
  ○ ListActivity를 상속받아 구현
     - actionBar가 안보임

□ STUDY
  ○ ListActivity
     -An activity that displays a list of items by binding to a data source such as an array or Cursor,
      and exposes event handlers when the user selects an item.
     -ListActivity hosts a ListView object that can be bound to different data sources,
      typically either an array or a Cursor holding query results. Binding, screen layout, and row layout are discussed in the following sections.
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

