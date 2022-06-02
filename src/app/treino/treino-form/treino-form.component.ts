import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { TreinosService } from 'src/app/treinos/services/treinos.service';

@Component({
  selector: 'app-treino-form',
  templateUrl: './treino-form.component.html',
  styleUrls: ['./treino-form.component.css']
})
export class TreinoFormComponent implements OnInit {

  constructor(
    private formBuilder: FormBuilder,
    private service: TreinosService) { }

  ngOnInit() {
  }

  //Implementar onCancel, onSucesso,onError,onSubmit
}
