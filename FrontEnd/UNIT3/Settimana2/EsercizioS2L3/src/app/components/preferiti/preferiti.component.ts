import { Component, OnInit } from '@angular/core';
import { ProductsServiceService } from 'src/app/services/products-service.service';

@Component({
  selector: 'app-preferiti',
  templateUrl: './preferiti.component.html',
  styleUrls: ['./preferiti.component.scss']
})
export class PreferitiComponent implements OnInit {
  totFavorites: number = 0;
  preferiti: any[] = []; 

  constructor(private service: ProductsServiceService) {}

  ngOnInit(): void {
    this.service.getFavorites().subscribe((favorites) => {
      this.preferiti = favorites;
      this.totFavorites = this.preferiti.length; 
    });
  }
}