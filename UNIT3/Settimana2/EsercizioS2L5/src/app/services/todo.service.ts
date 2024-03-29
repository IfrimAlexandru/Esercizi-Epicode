import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {  map } from 'rxjs/operators';
import { Todo } from '../interfaces/todo.interface';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  todoUrl = 'assets/dati/todos.json'; 
  todos: Todo[] = [];

  constructor(private http: HttpClient) {}

  getTodos(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.todoUrl);
  }

  getCompletedTodos(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.todoUrl).pipe(
      map(todos => todos.filter(todo => todo.completed === true))
    );
  }

  getIncompletedTodos(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.todoUrl).pipe(
      map(todos => todos.filter(todo => todo.completed === false))
    );
  }

  updateTodoLocally(todo: Todo): void {
    const index = this.todos.findIndex(t => t.id === todo.id);
    if (index !== -1) {
      this.todos[index] = todo;
    }
  }

  getTodosByUserId(userId: number): Observable<Todo[]> {
    return this.getTodos().pipe(
      map(todos => todos.filter(todo => todo.userId === userId))
    );
  }

  

  
}
