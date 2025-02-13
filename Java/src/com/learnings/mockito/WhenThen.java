package com.learnings.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class WhenThen {  
	  
    @Test  
    public void testList_ReturnsSingle_value() {  
  
        List mocklist = mock(List.class);  
                           when(mocklist.size()).thenReturn(1);  
  
        assertEquals(1, mocklist.size());  
        assertEquals(1, mocklist.size());  
          
                          System.out.println( mocklist.size());  
        System.out.println(mocklist);  
    }  
 }  
