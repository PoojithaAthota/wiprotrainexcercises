import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-message-toggle',
  standalone: true,   
  imports: [FormsModule, CommonModule],   
  templateUrl: './message-toggle.component.html',
  styleUrls: ['./message-toggle.component.css']
})
export class MessageToggleComponent {
  showMessage: boolean = false;
}
