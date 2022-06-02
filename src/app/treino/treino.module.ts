import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TreinoRoutingModule } from './treino-routing.module';
import { TreinosComponent } from './treinos/treinos.component';
import { TreinoFormComponent } from './treino-form/treino-form.component';

@NgModule({
  imports: [
    CommonModule,
    TreinoRoutingModule
  ],
  declarations: [TreinosComponent, TreinoFormComponent]
})
export class TreinoModule { }
