// import { Injectable } from '@angular/core';

// @Injectable({
//   providedIn: 'root'
// })
// export class TreinosService {

//   constructor() { }

//   list(): treino[]{
//     return[]
//   }
// }
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { delay, first, tap } from 'rxjs/operators';
import { Treino } from 'src/app/treino/model/treino';

@Injectable({
  providedIn: 'root'
})
export class TreinosService {

  private readonly API = 'api/treino';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Treino[]>(this.API)
    .pipe(
      first(),
      // delay(5000),
      tap(treinos => console.log(treinos))
    );
  }

  save(record: Treino) {
    return this.httpClient.post<Treino>(this.API, record).pipe(first());
  }
}
