import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Products } from '../interfaces/products.interface';
import { Subject, Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { ProductsResult } from '../interfaces/products-result.interface';

@Injectable({
  providedIn: 'root'
})
export class ProductsServiceService {
  apiURL = 'https://dummyjson.com/products';
  favoritesSub = new Subject<number>();
  favoritesCounter = 0;
  private favorites: Products[] = []; // Array per memorizzare i preferiti
  private localStorageKey = 'favorites'; // Chiave per memorizzare i preferiti nel LocalStorage

  constructor(private http: HttpClient) {
    // Quando il servizio viene inizializzato, carica i preferiti dal LocalStorage se presenti
    const storedFavorites = localStorage.getItem(this.localStorageKey);
    if (storedFavorites) {
      this.favorites = JSON.parse(storedFavorites);
      this.updateFavoritesCounter();
    }
  }

  getProducts(): Observable<ProductsResult> {
    return this.http.get<ProductsResult>(this.apiURL).pipe(
      catchError((err) => throwError(this.getErrorMessage(err.status)))
    );
  }

  getFavorites(): Observable<Products[]> {
    return new Observable<Products[]>((observer) => {
      observer.next(this.favorites);
      observer.complete();
    });
  }

  addFavorite(product: Products) {
    this.favorites.push(product);
    this.updateLocalStorage();
    this.updateFavoritesCounter();
  }

  removeFromFavorites(product: Products) {
    const index = this.favorites.findIndex(p => p.id === product.id);
    if (index !== -1) {
      this.favorites.splice(index, 1);
      this.updateLocalStorage();
      this.updateFavoritesCounter();
    }
  }

  private updateLocalStorage() {
    localStorage.setItem(this.localStorageKey, JSON.stringify(this.favorites));
  }

  private updateFavoritesCounter() {
    this.favoritesCounter = this.favorites.length;
    this.favoritesSub.next(this.favoritesCounter);
  }

  private getErrorMessage(status: number): string {
    let message = '';
    switch (status) {
      case 404:
        message = 'Elementi non trovati';
        break;
      default:
        message = 'Qualcosa non ha funzionato nella chiamata';
        break;
    }
    return message;
  }

  getFavoritesFromLocalStorage(): Products[] | null {
    const storedFavorites = localStorage.getItem(this.localStorageKey);
    return storedFavorites ? JSON.parse(storedFavorites) : null;
  }
}
