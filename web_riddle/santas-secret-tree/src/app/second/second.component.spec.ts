import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { SecondComponent } from './second.component';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        SecondComponent
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(SecondComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'santas-secret-tree'`, () => {
    const fixture = TestBed.createComponent(SecondComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('santas-secret-tree');
  });

  it('should render title in a h1 tag', () => {
    const fixture = TestBed.createComponent(SecondComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to santas-secret-tree!');
  });
});
