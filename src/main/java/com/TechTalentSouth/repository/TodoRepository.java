package com.TechTalentSouth.repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TechTalentSouth.model.TodoList;

@Repository
public interface TodoRepository extends CrudRepository<TodoList, Long>{
	List<TodoList> todoList = new  ArrayList<>();
	
	SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-DD HH:mm");
    List<TodoList> sorted = todoList.stream().sorted(
            (a,b)->
    {
        try {
            return a.getDateDue().compareTo(b.getDateDue());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }
    ).collect(Collectors.toList());
}
