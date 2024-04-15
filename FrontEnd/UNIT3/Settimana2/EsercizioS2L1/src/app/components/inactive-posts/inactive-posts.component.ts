import { Component, OnInit } from '@angular/core';
import { PostInterface } from 'src/interfaces/post.interface';
import { PostServiceService } from 'src/app/services/post-service.service';

@Component({
  selector: 'app-inactive-posts',
  templateUrl: './inactive-posts.component.html',
  styleUrls: ['./inactive-posts.component.scss']
})
export class InactivePostsComponent implements OnInit {
  posts: PostInterface[] = []

  constructor (private postSrv : PostServiceService ) {}

  ngOnInit(): void {
    this.posts = this.postSrv.getPost().filter((post)=> !post.active);
  }


  
}
