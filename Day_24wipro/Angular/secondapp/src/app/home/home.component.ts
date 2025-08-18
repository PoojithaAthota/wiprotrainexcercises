import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],   
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
 books = [
  { title: 'Book 1', description: `This is a short description of book number 1.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 2', description: `This is a short description of book number 2.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 3', description: `This is a short description of book number 3.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 4', description: `This is a short description of book number 4.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 5', description: `This is a short description of book number 5.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 6', description: `This is a short description of book number 6.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 7', description: `This is a short description of book number 7.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 8', description: `This is a short description of book number 8.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 9', description: `This is a short description of book number 9.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 10', description: `This is a short description of book number 10.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 11', description: `This is a short description of book number 11.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 12', description: `This is a short description of book number 12.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 13', description: `This is a short description of book number 13.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 14', description: `This is a short description of book number 14.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 15', description: `This is a short description of book number 15.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 16', description: `This is a short description of book number 16.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 17', description: `This is a short description of book number 17.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 18', description: `This is a short description of book number 18.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 19', description: `This is a short description of book number 19.`, image: 'https://picsum.dev//300/200' },
  { title: 'Book 20', description: `This is a short description of book number 20.`, image: 'https://picsum.dev//300/200' }
];
}
