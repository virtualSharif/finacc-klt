import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { User } from '../../dtos/user';
import { Router} from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html'
})
export class UserComponent implements OnInit {

  public firstName: string;
  public lastName: string;
  public ageStatus: string;
  public age: number;
  public disabledSubmit: boolean = true;
  public users: User[];
  constructor(
    private router: Router,
    private userService: UserService) { }

  ngOnInit() {
    this.userService.findAll().subscribe(
      data => {
        this.users = data;
      },
      error => {
        this.handleError(error);
      });
  }

  public save() {
    this.disabledSubmit = true;
    let user = new User();
    user.firstName = this.firstName;
    user.lastName = this.lastName;
    this.userService.save(user).subscribe(data => window.location.reload());
  }

  public validateAge(age: number) {
    this.userService.validateAge(age).subscribe(data => {
      this.ageStatus = data;
      if (this.ageStatus == 'OK' || this.ageStatus === 'funny') {
        this.disabledSubmit = false;
      }
    });
  }

  public delete(id: number) {
    this.userService.delete(id).subscribe(data => window.location.reload());
  }

  public clear() {
    this.firstName = null;
    this.lastName = null
    this.ageStatus = null;
    this.age = null;
    this.disabledSubmit = true;
  }

  private handleError(error: Response | any) {
    let errorBody = error.json();
    let message = 'Unknown exception occurred';
    if (errorBody.message) {
      message = errorBody.message;
    }
  }
}
