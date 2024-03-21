import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Post } from 'src/app/models/post.interface';

@Component({
  selector: 'app-correlati',
  templateUrl: './correlati.component.html',
  styleUrls: ['./correlati.component.scss']
})
export class CorrelatiComponent implements OnInit {
  posts!: Post[];
  related: Post[] = [];
  included: number[] = [];
  isLoaded = false;

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.readPosts();
  }

  async readPosts() {
    const response = await fetch('assets/db.json');
    const data = await response.json();
    this.posts = data;
    this.relatedPosts();
  }

  relatedPosts() {
    for (let i = 0; i < 2; i++) {
      let index = Math.floor(Math.random() * this.posts.length);
      if (this.included.includes(index)) {
        index = Math.floor(Math.random() * this.posts.length);
      }
      this.included.push(index);
    }
    for (let i = 0; i < this.included.length; i++) {
      let postIndex = this.included[i];
      this.related.push(this.posts[postIndex]);
    }
    this.isLoaded = true;
  }

  viewPostDetails(post: Post) {
    // Naviga alla pagina PostDetailComponent con il post cliccato
    this.router.navigate(['/detail', post.id]);
  }
}