import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response, URLSearchParams} from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { User } from '../dtos/user';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';

@Injectable()
export class UserService {

  private options: RequestOptions;
  private baseResourceUrl = 'http://localhost:4040/api/v1/users';

  constructor(private http: Http) { }

  setRequestOptions() {
    this.options = new RequestOptions({ headers: new Headers({ 'Content-Type': 'application/json' }) });
  }

  findAll(): Observable<User[]> {
    this.setRequestOptions();
    return this.http.get(this.baseResourceUrl).map(response => response.json() || {});
  }

  save(user: User): Observable<User> {
    this.setRequestOptions();
    return this.http.post(this.baseResourceUrl, user, this.options).map(response => response.json() || {});
  }

  validateAge(age: number): any {
    return this.http.get(this.baseResourceUrl + '/age/' + age).map(response => response.text() || {});
  }

  delete(id: number): any {
    return this.http.delete(this.baseResourceUrl + '/' + id);
  }

}
