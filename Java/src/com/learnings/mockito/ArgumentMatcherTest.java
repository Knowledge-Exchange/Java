package com.learnings.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ArgumentMatcherTest {   
    @Test  
public void testList_Argument_Matchers() {  

List<String> mocklist = mock(List.class);  

when(mocklist.get(Mockito.anyInt())).thenReturn("Mockito");  

assertEquals("Mockito", mocklist.get(0));  
assertEquals("Mockito", mocklist.get(1));   
              assertEquals("Mockito", mocklist.get(2));  
}  
}  