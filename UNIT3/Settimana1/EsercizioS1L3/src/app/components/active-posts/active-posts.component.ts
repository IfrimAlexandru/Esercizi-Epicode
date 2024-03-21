import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/models/post.interface';


@Component({
  selector: 'app-active-posts',
  templateUrl: './active-posts.component.html',
  styleUrls: ['./active-posts.component.scss']
})
export class ActivePostsComponent implements OnInit {
  posts!: Post[];

  constructor() { }

  ngOnInit(): void {
    this.readPosts();
  }

  async readPosts() {
    try {
      const response = await fetch('assets/db.json');
      const data = await response.json();
      this.posts = data;
      
      this.filterActivePosts();
    } catch (error) {
      console.error('Si è verificato un errore durante il recupero dei dati:', error);
    }
  }

  filterActivePosts() {
    
    this.posts = this.posts.filter(post => post.active);
  }

}