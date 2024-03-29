import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/interfaces/todo.interface';
import { User } from 'src/app/interfaces/user.interface'; 
import { TodoService } from 'src/app/services/todo.service';
import { UserService } from 'src/app/services/user.service'; 

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  todos: Todo[] = [];
  users: User[] = []; 

  constructor(private todoSrv: TodoService, private userSrv: UserService) {}

  ngOnInit(): void {
    this.loadTodos();
  }

  loadTodos(){
    this.todoSrv.getTodos().subscribe(todos => {
      this.todos = todos;
      this.loadUsers(); 
    });
  }

  loadUsers(){
    this.userSrv.getUsers().subscribe(users => {
      this.users = users;
    });
  }

  toggleCompleted(todo: Todo) {
    todo.completed = !todo.completed;
  }


  getUserFullName(userId: number): string {
    const user = this.users.find(u => u.id === userId);
    return user ? `${user.firstName} ${user.lastName}` : 'Unknown';
  }
}
