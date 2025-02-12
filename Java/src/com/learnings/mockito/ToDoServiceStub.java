package com.learnings.mockito;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements TodoService {  
	  
    public List<String> getTodos(String user) {  
      
    return Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use Hibernate ", " Use Spring MVC ");  
    }  
 }  