import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { MainComponent } from './main/main.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { StringInterpolationComponent } from './string-interpolation/string-interpolation.component';
import { PropertyBindingComponent } from './property-binding/property-binding.component';
import { EventBindingComponent } from './event-binding/event-binding.component';
import { TwoWayDataBindingComponent } from './two-way-data-binding/two-way-data-binding.component';
import { FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AngularFormsComponent } from './angular-forms/angular-forms.component';
import { TemplateReferenceComponent } from './template-reference/template-reference.component';
import { TdfLoginComponent } from './tdf-login/tdf-login.component';
import { ModelDrivenLoginComponent } from './model-driven-login/model-driven-login.component';
import { LogingService } from './login.service';
import { FakeComponent } from './fake/fake.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MainComponent,
    FooterComponent,
    DataBindingComponent,
    StringInterpolationComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayDataBindingComponent,
    AngularFormsComponent,
    TemplateReferenceComponent,
    TdfLoginComponent,
    ModelDrivenLoginComponent,
    FakeComponent
  ],
  imports: [
    BrowserModule,FormsModule, ReactiveFormsModule
  ],
  providers: [LogingService],
  bootstrap: [AppComponent]
})
export class AppModule { }
