import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule} from '@angular/http';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { APP_BASE_HREF } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { MenuComponent } from './semillero/componentes/menu/menu-component';
import { BienvenidaComponent } from './semillero/componentes/home/bienvenida-component';
import { CrearPersonaComponent } from './semillero/componentes/crearPersona/crear-persona-component';
import { GestionarComicComponent } from './semillero/componentes/gestionarComic/gestionar-comic';
 

// DTOs
export { ComicDTO } from './semillero/dto/comic.dto';
export { ResultadoDTO } from './semillero/dto/resultado.dto';

//Manejo de servicios

import {EjemploService} from './semillero/services/ejemplo.service';
import {AbstractService} from './semillero/services/template.service';
import { MensajeComponent } from './semillero/componentes/mensaje/mensaje.component';
import { RelacionComicPersonaComponent } from './semillero/componentes/relacion-comic-persona/relacion-comic-persona.component';
import { ComprarComicComponent } from './semillero/componentes/comprar-comic/comprar-comic.component';
import { ListaPersonasComponent } from './semillero/componentes/lista-personas/lista-personas.component';
import { ListaComicsComponent } from './semillero/componentes/lista-comics/lista-comics.component';
import { NuevaPersonaComponent } from './semillero/componentes/nueva-persona/nueva-persona.component';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    BienvenidaComponent,
    
    CrearPersonaComponent,
    GestionarComicComponent,
    MensajeComponent,
    RelacionComicPersonaComponent,
    ComprarComicComponent,
    ListaPersonasComponent,
    ListaComicsComponent,
    NuevaPersonaComponent,
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
  	{ provide: APP_BASE_HREF, useValue: '/SemilleroHBT' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 

}
