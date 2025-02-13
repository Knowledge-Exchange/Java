package com.learnings.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpyTest {  
	  
    @Test  
    public void test() {  
          
        List spyArrayList = spy(ArrayList.class);  
        assertEquals(0, spyArrayList.size());  
  
                        // adding an item in the list  
        spyArrayList.add("Mockito");  
        assertEquals(1, spyArrayList.size());  
    }  
 }  