import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModelDrivenLoginComponent } from './model-driven-login.component';

describe('ModelDrivenLoginComponent', () => {
  let component: ModelDrivenLoginComponent;
  let fixture: ComponentFixture<ModelDrivenLoginComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ModelDrivenLoginComponent]
    });
    fixture = TestBed.createComponent(ModelDrivenLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
