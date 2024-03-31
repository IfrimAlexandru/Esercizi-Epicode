import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import {  map } from 'rxjs/operators';
import { Todo } from '../interfaces/todo.interface';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  todoUrl = 'assets/dati/todos.json';
  todos: Todo[] = [];
  todos$: BehaviorSubject<Todo[]> = new BehaviorSubject<Todo[]>([])

  constructor(private http: HttpClient) {
      this.fetchIniziale()
  }

  async fetchIniziale() {
    fetch(this.todoUrl).then((data) => data.json()).then((value:Todo[]) => {
      this.todos = value
      this.todos$.next(this.todos)
    })
  }

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
      this.todos$.next(this.todos)
    }
  }

  getTodosByUserId(userId: number): Observable<Todo[]> {
    return this.getTodos().pipe(
      map(todos => todos.filter(todo => todo.userId === userId))
    );
  }

  

  
}
