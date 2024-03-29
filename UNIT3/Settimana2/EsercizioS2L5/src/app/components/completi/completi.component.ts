import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/interfaces/todo.interface';
import { TodoService } from 'src/app/services/todo.service';

@Component({
  selector: 'app-completi',
  templateUrl: './completi.component.html',
  styleUrls: ['./completi.component.scss']
})
export class CompletiComponent implements OnInit {
  completedTodos: Todo[] = [];

  constructor(private completiService: TodoService) {}

  ngOnInit(): void {
    this.loadCompletedTodos();
  }

  loadCompletedTodos(): void {
    this.completiService.getCompletedTodos().subscribe(completedTodos => {
      this.completedTodos = completedTodos;
    });
  }
}