import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FakeComponent } from './fake.component';

describe('FakeComponent', () => {
  let component: FakeComponent;
  let fixture: ComponentFixture<FakeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FakeComponent]
    });
    fixture = TestBed.createComponent(FakeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
