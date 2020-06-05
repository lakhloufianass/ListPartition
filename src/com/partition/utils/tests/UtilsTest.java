package com.partition.utils.tests;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.partition.utils.Utils;

/**
 * Test dans le cas de size = n and size > n and size < n and invalid parameters
 * @author macpro
 *
 */
public class UtilsTest {
	 static List<List<Integer>> listOfEqualSize;
	 static List<List<Integer>> listOfGreaterSize;
	 static List<List<Integer>> listOfSmallerSize;
	
    @BeforeClass  
    public static void setBeforeClass() {  
        listOfEqualSize = Arrays.asList(Arrays.asList(1,2,3,4));
        listOfGreaterSize = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7));
        listOfSmallerSize = Arrays.asList(Arrays.asList(1,2,3,4));
    } 
    
    
    @Test(expected = Exception.class)
	public void testInvalidSize() throws Exception {
		Utils.partition(Arrays.asList(1,2,3,4),-8);
	}
    
    @Test(expected = Exception.class)
   	public void testEmptyList() throws Exception {
   		Utils.partition(new ArrayList<Integer>(),8);
   	}
    
    @Test(expected = Exception.class)
   	public void testInvalidList() throws Exception {
   		Utils.partition(null,8);
   	}
	 
    /**
	 * listSize == n
	 * @throws Exception
	 */
	@Test
	public void testEqualPartition() throws Exception {
		List<List<Integer>> result = Utils.partition(Arrays.asList(1,2,3,4),4);
		assertEquals(listOfEqualSize,result); //check that the lists have the same values
		assertTrue(listOfEqualSize.size() == result.size()); //check list size
		for(int i=0;i<listOfEqualSize.size();i++) {
			assertTrue(listOfEqualSize.get(i).size() == result.get(i).size()); //check sublists size
		}
	}
	
	/**
	 * listSize > n
	 * @throws Exception
	 */
	@Test
	public void testGreaterPartition() throws Exception {
		List<List<Integer>> result = Utils.partition(Arrays.asList(1,2,3,4,5,6,7),3);
		assertEquals(listOfGreaterSize,result); //check that the lists have the same values
		assertTrue(listOfGreaterSize.size() == result.size()); //check list size
		for(int i=0;i<listOfGreaterSize.size();i++) {
			assertTrue(listOfGreaterSize.get(i).size() == result.get(i).size()); //check sublists size
		}
	}
	
	/**
	 * listSize < n
	 * @throws Exception
	 */
	@Test
	public void testSmallerPartition() throws Exception {
		List<List<Integer>> result = Utils.partition(Arrays.asList(1,2,3,4),8);
		assertEquals(listOfSmallerSize,result); //check that the lists have the same values
		assertTrue(listOfSmallerSize.size() == result.size()); //check list size
		for(int i=0;i<listOfSmallerSize.size();i++) {
			assertTrue(listOfSmallerSize.get(i).size() == result.get(i).size()); //check sublists size
		}
	}
}
