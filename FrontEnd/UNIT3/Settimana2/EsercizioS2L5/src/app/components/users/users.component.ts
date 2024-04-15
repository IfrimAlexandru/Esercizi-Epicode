import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/interfaces/user.interface';
import { UserService } from 'src/app/services/user.service';
import { Todo } from 'src/app/interfaces/todo.interface';
import { TodoService } from 'src/app/services/todo.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss']
})
export class UsersComponent implements OnInit {
  users: User[] = [];
  userTodosMap: Map<number, Todo[]> = new Map();

  constructor(private userService: UserService, private todoService: TodoService) { }

  ngOnInit(): void {
    this.userService.getUsers().subscribe(users => {
      this.users = users;
      this.loadUserTodos();
    });
  }

  loadUserTodos(): void {
    this.users.forEach(user => {
      this.todoService.getTodosByUserId(user.id).subscribe(todos => {
        this.userTodosMap.set(user.id, todos);
      });
    });
  }
  toggleCompleted(todo: Todo) {
    todo.completed = !todo.completed;
  }

  
}