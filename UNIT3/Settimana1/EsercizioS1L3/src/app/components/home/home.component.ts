import { Component } from '@angular/core';
import { Post } from 'src/app/models/post.interface';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
posts!: Post[];

}



