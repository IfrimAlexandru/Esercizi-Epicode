import { Component } from '@angular/core';
import { Post } from 'src/app/models/post.interface';
import { OnInit } from '@angular/core';

@Component({
  selector: 'app-interesse',
  templateUrl: './interesse.component.html',
  styleUrls: ['./interesse.component.scss']
})
export class InteresseComponent implements OnInit {
  posts: Post[] = [];
  advised: Post[] = [];
  included: number[] = [];
  isLoaded = false;
  ngOnInit(): void {
    this.readPosts();
  }
  
 
async readPosts() {
    const response = await fetch('assets/db.json');
    const data = await response.json();
    this.posts = data;
   
      await this.buildIndex();
      await this.advisePosts();
      console.log(this.posts)
      this.isLoaded = true
        
    
}

buildIndex() {
    for (let i = 0; i < 4; i++) {
        let index = Math.floor(Math.random() * this.posts.length);
        if (this.included.includes(index)) {
            index = Math.floor(Math.random() * this.posts.length);
        }
        this.included.push(index);
    }
}

advisePosts() {
    for (let i = 0; i < this.included.length; i++) {
        let postIndex = this.included[i];
        this.advised.push(this.posts[postIndex]);
    }

}
}