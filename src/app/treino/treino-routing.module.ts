import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TreinosComponent } from './treinos/treinos.component';

const routes: Routes = [
  {path: '', component: TreinosComponent},
  {
    path: 'treinos',
    loadChildren: () => import('./treino.module').then(m=>m.TreinoModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TreinoRoutingModule { }
