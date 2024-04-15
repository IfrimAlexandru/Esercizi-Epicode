import { Component, OnInit } from '@angular/core';
import { PostServiceService } from 'src/app/services/post-service.service';
import { PostInterface } from 'src/interfaces/post.interface';

@Component({
  selector: 'app-active-posts',
  templateUrl: './active-posts.component.html',
  styleUrls: ['./active-posts.component.scss'],
})
export class ActivePostsComponent implements OnInit {
  posts: PostInterface[] = []

  constructor (private postSrv : PostServiceService ) {}

  ngOnInit(): void {
    this.posts = this.postSrv.getPost().filter((post) => post.active);
  }


  // active!: PostInterface[]
  // constructor() {
  //   this.active = this.activePosts;
  // }
  // get activePosts(): PostInterface[] {
  //   return this.posts.filter((post) => post.active);
  // }
}
