package com.learnings.mockito;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {  
  
    public TodoService doService;  
  
    public ToDoBusiness(TodoService doService) {  
        this.doService = doService;  
    }  
      
    public List<String> getTodosforSpring(String user) {  
          
        List<String> retrievedtodos = new ArrayList<String>();  
        List<String> todos = doService.getTodos(user);  
          
        for(String todo :todos) {  
            if(todo.contains("Spring")) {  
                retrievedtodos.add(todo);  
            }  
        }  
        return retrievedtodos;  
        }  
 }   