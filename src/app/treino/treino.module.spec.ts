import { TreinoModule } from './treino.module';

describe('TreinoModule', () => {
  let treinoModule: TreinoModule;

  beforeEach(() => {
    treinoModule = new TreinoModule();
  });

  it('should create an instance', () => {
    expect(treinoModule).toBeTruthy();
  });
});
