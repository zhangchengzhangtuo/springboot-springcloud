package com.apin;

import com.apin.mybatis.Person;
import com.apin.mybatis.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;

//	@Test
//	public void testFind() {
//		Person person=userMapper.findByName("zhangcheng");
//		Assert.assertEquals(27, person.getAge().intValue());
//	}

//	@Test
//	public void testInsert(){
//		userMapper.insert("xiaorange", 28);
//	}
//
//	@Test
//	public void testInsertByMap(){
//		Map<String,Object> map=new HashMap<>();
//		map.put("name","zhangyan");
//		map.put("age",36);
//		userMapper.insertByMap(map);
//	}

//	@Test
//	public void testInsertByPerson(){
//		Person person=new Person();
//		person.setName("zhangli");
//		person.setAge(38);
//		userMapper.insertByPerson(person);
//	}

//	@Test
//	public void testUpdate(){
//		Person person=new Person();
//		person.setName("xiaorange");
//		person.setAge(28);
//		userMapper.update(person);
//	}

//	@Test
//	public void testFindAll(){
//		List<Person> personList=userMapper.findAll();
//		System.out.println("person list:" + personList.toString());
//	}

	@Test
	@Transactional
	public void testTransactional(){
		userMapper.insertByPerson(new Person("A",1));
		userMapper.insertByPerson(new Person("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB",1));
		userMapper.insertByPerson(new Person("C",1));

	}

}
