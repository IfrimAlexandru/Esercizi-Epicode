import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appRandomColors]'
})
export class RandomColorsDirective {

  constructor(private element: ElementRef) {
    this.element.nativeElement.style.backgroundColor = this.coloreRandom()
  }

  coloreRandom(): string {
    const letters = '0123456789ABCDEF'
    let colors = '#';
    for (let i = 0; i < 6; i++) {
      colors += letters[Math.floor(Math.random()* 16)];
    } 
    return colors

  }

  

  

}
