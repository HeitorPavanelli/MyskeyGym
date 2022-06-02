import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { TreinosService } from 'src/app/treinos/services/treinos.service';
import { Treino } from '../model/treino';

@Component({
  selector: 'app-treinos',
  templateUrl: './treinos.component.html',
  styleUrls: ['./treinos.component.css']
})
export class TreinosComponent {
  
  treinos$: Observable<Treino[]>;
  // courses: Course[] = [];
  displayedColumns = ['name','category','actions'];

  // coursesService: CoursesService;

  constructor(
    private treinosService: TreinosService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.treinos$ = this.treinosService.list()

}
}
