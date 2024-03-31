import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/interfaces/todo.interface';
import { TodoService } from 'src/app/services/todo.service';

@Component({
  selector: 'app-incompleti',
  templateUrl: './incompleti.component.html',
  styleUrls: ['./incompleti.component.scss']
})
export class IncompletiComponent implements OnInit {
  incompletedTodos: Todo[] = [];

  constructor(private incompletiService: TodoService) {}

  ngOnInit(): void {
    this.loadIncompletedTodos();
  }

  loadIncompletedTodos(): void {
    this.incompletiService.todos$.subscribe(todos => {
      this.incompletedTodos = todos.filter(todo => !todo.completed);
    });
  }

  toggleCompleted(todo:Todo) {
    todo.completed = !todo.completed
    this.incompletiService.updateTodoLocally(todo)
  }
  
}