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

  constructor(private todoService: TodoService) {}

  ngOnInit(): void {
    this.loadIncompletedTodos();
  }

  loadIncompletedTodos(): void {
    this.todoService.getTodos().subscribe(todos => {
      this.incompletedTodos = todos.filter(todo => !todo.completed);
    });
  }
}