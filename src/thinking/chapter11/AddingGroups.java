package thinking.chapter11;

import java.util.*;

/**
 * 添加元素
 * 
 * @author Mr.w
 *
 */
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(
				1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		// Arrays.asList的输出可以当作List，但是不能调整尺寸，因为底层时数组
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // OK -- modify an element
		// add remove都属于修改尺寸
		// list.add(21); // Runtime error because the
		// list.remove(0);

		
		//可以添加儿子
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(),new Powder());

		// 不能添加孙子
//		 List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

		// Collections.addAll() doesn't get confused:
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		//使用泛型，可以添加孙子
		List<Snow> snow4 = Arrays.<Snow> asList(new Light(), new Heavy());
	}
}

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}