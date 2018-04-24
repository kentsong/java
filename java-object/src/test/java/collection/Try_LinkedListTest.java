package collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;


/**
 * LinkedList 測試方法：
 * 1. 加入 Node 是否線性排列
 * 2. 加入 Node, first、last、指定中間 Node before、after
 * 3. 取得、驗證 Note 前後元素的是否正確
 */

public class Try_LinkedListTest {

    LinkedList<String> lkList;
    String peopleA = "People A";
    String peopleB = "People B";
    String peopleC = "People C";
    String peopleD = "People D";
    String peopleE = "People E";

    @Before
    public void setUp() throws Exception {
        lkList = new LinkedList<>();
        lkList.add(peopleA);
        lkList.add(peopleB);
        lkList.add(peopleC);
        lkList.add(peopleD);
        lkList.add(peopleE);
    }

    @Test
    public void test_linkedlist_add_series(){
        String peopleF = "People F";
        String peopleG = "People G";

        Assert.assertEquals(5, lkList.size());
        Assert.assertEquals(peopleA, lkList.getFirst());
        Assert.assertEquals(peopleE, lkList.getLast());

        lkList.add(2, peopleF);
        Assert.assertEquals(peopleF, lkList.get(2));
        Assert.assertEquals(peopleC, lkList.get(3));

        lkList.addFirst(peopleG);
        Assert.assertEquals(peopleG, lkList.getFirst());

        lkList.addLast(peopleG);
        Assert.assertEquals(peopleG, lkList.getLast());

        System.out.println(lkList);
    }

    @Test
    public void test_linkedlist_remove_series(){

        lkList.remove(peopleA);
        Assert.assertEquals(4, lkList.size());

    }



    @Test
    public void test_linkedlist_queue_series(){

        //poll 查詢並刪除第一個元素
        Assert.assertEquals(lkList.poll(), peopleA);
        Assert.assertEquals(4, lkList.size());

        //poll Last 查詢並刪除最後一個元素
        Assert.assertEquals(lkList.pollLast(), peopleE);
        Assert.assertEquals(3, lkList.size());

        //peek 查詢、不刪除元素
        Assert.assertEquals(lkList.peek(), peopleB);
        Assert.assertEquals(lkList.peekLast(), peopleD);
        Assert.assertEquals(3, lkList.size());

    }


}