import { Component, OnInit } from '@angular/core';
import { Products } from 'src/app/interfaces/products.interface';
import { ProductsServiceService } from 'src/app/services/products-service.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  product: Products[] | undefined;
  sub!: Subscription;
  title = 'EsercizioS2L3-AZAMON';

  constructor(private service: ProductsServiceService) {}

  ngOnInit(): void {
    this.readObjects();
  }

  readObjects() {
    this.service.getProducts().subscribe(
      (results) => {
        this.product = results.products;

        // Carica i preferiti dal localStorage
        const favorites = this.service.getFavoritesFromLocalStorage();

        // Imposta lo stato isFavorite per ciascun prodotto
        if (favorites) {
          this.product.forEach((prod) => {
            prod.isFavorite = favorites.some((fav) => fav.id === prod.id);
          });
        }

        console.log(this.product);
      },
      (err) => {
        alert(err);
      }
    );
  }

  addToFavorites(product: Products) {
    this.service.addFavorite(product);
    product.isFavorite = true;
  }

  toggleFavorite(product: Products) {
    if (product.isFavorite) {
      this.service.removeFromFavorites(product);
    } else {
      this.service.addFavorite(product);
    }
    product.isFavorite = !product.isFavorite;
  }
}