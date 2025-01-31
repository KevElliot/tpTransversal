import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { forkJoin, Observable, of } from 'rxjs';
import { Login } from '../model/login.model';

@Injectable({
    providedIn: 'root'
})
export class AuthService {
    isConnect = false;
    constructor(private http: HttpClient) { }

    // uri = "http://localhost:8010/pariBack";
    uri = "https://parilocalnode.herokuapp.com/pariBack";

    authentification(login: any): Observable<any> {
        console.log("Authentification...")
        return this.http.post(this.uri + '/auth/login', login);
    }
    register(login: any): Observable<any> {
        console.log("Enregistrement en cours...")
        return this.http.post(this.uri + '/auth/register', login);
    }
    getUser(id: number): Observable<Login> {
        return this.http.get<Login>(this.uri + "/user/" + id)
    }
    updateUser(login: Login): Observable<any> {
        return this.http.put(this.uri + "/user/", login);
    }
    demandeJeton(jeton: any): Observable<any> {
        return this.http.post(this.uri + '/jeton/demande', jeton);
    }
    isConnected() {
        return new Promise((resolve, reject) => {
            resolve(this.isConnect);
        });
    }
    setConnected(bool:boolean){
        this.isConnect=bool;
    }
    getIsConnected(){
        return this.isConnect;
    }
}