package xzy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 /**
  * 模拟利用java实现sql中的group by 语句.
  * 实质：就是新建一个Map，将要group by 的字段设置为key，后面的数值相加为对应的value.
  * @author xuzhiyou
  *
  */
public class SqlTest {
 
    public static void main(String[] args) {
        List<JavaBean> list = new ArrayList<JavaBean>();
        list.add(new JavaBean("来源A", 100));
        list.add(new JavaBean("来源B", 200));
        list.add(new JavaBean("来源C", 300));
        list.add(new JavaBean("来源B", 6600));
        list.add(new JavaBean("来源A", 99800));
 
        List<JavaBean> groupList = getListByGroup(list);
        for (JavaBean bean : groupList) {
            System.out.print(bean.getGroup() + "        ");
            System.out.println(bean.getMoney());
        }
    }
 
    private static List<JavaBean> getListByGroup(List<JavaBean> list) {
        List<JavaBean> result = new ArrayList<JavaBean>();
        Map<String, Integer> map = new HashMap<String, Integer>();
 
        for (JavaBean bean : list) {
            if (map.containsKey(bean.getGroup())) {
                map.put(bean.getGroup(), map.get(bean.getGroup()) + bean.getMoney());
            } else {
                map.put(bean.getGroup(), bean.getMoney());
            }
        }
        for (Entry<String, Integer> entry : map.entrySet()) {
            result.add(new JavaBean(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}
 
class JavaBean {
    private String group;
    private int money;
 
    public JavaBean() {
    }
 
    public JavaBean(String group, int money) {
        this.group = group;
        this.money = money;
    }
 
    public String getGroup() {
        return group;
    }
 
    public void setGroup(String group) {
        this.group = group;
    }
 
    public int getMoney() {
        return money;
    }
 
    public void setMoney(int money) {
        this.money = money;
    }
 
}
