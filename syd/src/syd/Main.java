package syd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void print(int index, Object object){
		System.out.println(String.format("{%d},%s", index, object.toString()));
	}

	//静态变量只能调用静态变量
	public static void demoOperation(){
		print(1, 5+2);
		print(2, 5-2);
		print(3, 5*2);
		print(4, 5/2);
		print(5, 5%2);
		print(6, 5<<2);
		print(7, 5>>2);
		print(8, 5|2);
		print(9, 5^2);
		print(10, 5!=2);
		print(11, 5==2);
	}

	public static void demoString(){
		String str = "hello world";
		print(1, str.indexOf('x'));
		print(2, str.charAt(3));
		print(3, str.codePointAt(1));
		print(4, str.compareToIgnoreCase("HELLO WORLD"));
		print(5, str.compareTo("hello xorld"));
		print(6, str.contains("hello"));
		print(7, str.concat("!!!"));
		print(8, str.toUpperCase());
		print(9, str.endsWith("world"));
		print(10, str.startsWith("hell"));
		print(11, str.replace("o", "e"));
		print(12, str.replaceAll("o|l", "a"));
		print(13, str.replaceAll("hello", "hi"));

		StringBuilder sb = new StringBuilder();//字符串随机操作，线程不安全的，多线程用StringBuffer
		sb.append("a ");
		sb.append(1.2);
		sb.append('a');
		sb.append(true);
		print(14, sb.toString());


	}
	public static void demoControlFlow(){
		int a = 2;
		//如果a=2，返回1， 否则返回3
		int target = a == 2 ? 1:3;//三目运算符
		print(15, target);
	}

	public static void demoList(){
		List<String> strList = new ArrayList<String>(10);
		for(int i=0; i<4; i++) {
			strList.add(String.valueOf(i * i));
		}
			print(1, strList);

			List<String> strListB = new ArrayList<String>();
		for(int i=0; i<4; i++){
			strListB.add(String.valueOf(i));
		}

		strList.addAll(strListB);//两个列表合并
		print(2, strList);

		strList.remove(0);
		print(3, strList);

		strList.remove(String.valueOf(1));
		print(4, strList);
		print(5, strList.get(1));

		Collections.reverse(strList);
		print(6, strList);

		Collections.sort(strList);
		print(7, strList);

		//自定义排序函数
		Collections.sort(strList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);//互换位置就是反向
			}
		});
		print(8, strList);

		for(String obj: strList){
			print(9, obj);
		}
		for(int i = 0; i<strList.size(); i++){
			print(10, strList.get(i));
		}

		int[] array = new int[] {1, 2, 3};


		}

	public static void demoMapTable(){
		//hashtable线程安全，hashmap线程不安全
			Map<String, String> map = new HashMap<String, String>();
			for(int i = 0; i<4; i++){
				map.put(String.valueOf(i), String.valueOf(i*i));

			}
			print(1, map);

			for(Map.Entry<String, String> entry: map.entrySet()){
				print(2, entry.getKey() + "|" + entry.getValue());

			}
			print(3, map.values());
			print(4, map.keySet());
			print(5, map.get("3"));
			print(6, map.containsKey("A"));
			map.replace("3", "27");
			print(7, map.get("3"));




	}

	public static void demoSet(){
			Set<String> strSet = new HashSet<String>();
			for(int i=0; i<3; i++){
				strSet.add(String.valueOf(i));
			}
			print(1, strSet);
			strSet.remove(String.valueOf(1));
			print(2, strSet);
			print(3, strSet.contains(String.valueOf(1)));
			print(4, strSet.isEmpty());
			print(5, strSet.size());

			strSet.addAll(Arrays.asList((new String[]{"A", "B", "C"})));
			print(6, strSet);
			for(String value: strSet){
				print(7, value);
			}

		}

		public static void demoException(){
			try{
				//xxxxxxxxxx
				int k = 2;
				//k = k/0;
				if(k==2){
					//throw 自定义业务性异常
					throw new Exception("Fuck Off.");
				}
			}catch(Exception e){
				print(2, e.getMessage());
			}finally{
				//基本是清理工作
				print(3, "finally");
			}
	}



	public static void demo00(){
			Animal a = new Animal("Mike", 1);
			a.say();
			Animal human = new Human("Gay", 22, "China");
			human.say();
	}

	public static void demoFunction(){
		Random random = new Random();

		//random.setSeed(1);

		print(1, random.nextInt(1000));
		print(2, random.nextFloat());

		List<Integer> array = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
		Collections.shuffle(array);//打乱
		print(3, array);

		Date date = new Date();
		print(4, date);
		print(5, date.getTime());

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		print(6, df.format(date));

		print(7, UUID.randomUUID());
		print(8, Math.log(10));
		print(9, Math.min(3, 10));
		print(10, Math.max(1321, 323));
		print(11, Math.ceil(2.2));
		print(12, Math.floor(2.2));
	}



	public static void main(String[] args){
		//System.out.println("Hello, dou.");
		//System.out.println("Hello, dou.");
		//System.out.print("SH in SH, with SH.");
		//demoOperation();
		//demoString();
		//demoControlFlow();
		//demoList();
		//demoMapTable();
		//demoSet();
		//demoException();
		//demo00();
		//demoFunction();
		System.out.println(5/2);

	}
}