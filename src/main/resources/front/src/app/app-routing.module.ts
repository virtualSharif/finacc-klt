import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { UserComponent} from './components/user/user.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'app/users',
    pathMatch: 'full'
  },
  {
    path: 'app/users',
    component: UserComponent
  },
  {
    path: '**',
    component: UserComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
