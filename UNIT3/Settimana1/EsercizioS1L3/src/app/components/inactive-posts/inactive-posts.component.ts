import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/models/post.interface';

@Component({
  selector: 'app-inactive-posts',
  templateUrl: './inactive-posts.component.html',
  styleUrls: ['./inactive-posts.component.scss']
})
export class InactivePostsComponent {
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
      
      this.filterInactivePosts();
    } catch (error) {
      console.error('Si è verificato un errore durante il recupero dei dati:', error);
    }
  }

  filterInactivePosts() {
    
    this.posts = this.posts.filter(post => !post.active);
  }

}

