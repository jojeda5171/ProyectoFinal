package com.example.appmovil.io;

import com.example.appmovil.io.response.ResponseTipoDeActividad;
import com.example.appmovil.model.Actividad;
import com.example.appmovil.model.Empleado;
import com.example.appmovil.model.EmpleadoTI;
import com.example.appmovil.model.Registro;
import com.example.appmovil.model.RegistroV3;
import com.example.appmovil.model.RegistroV4;
import com.example.appmovil.model.TipoDeActividad;
import com.example.appmovil.model.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AppApiService {


    @GET("TipoDeActividad")
    Call< List<TipoDeActividad> >getTipoDeActividad();

    @GET ("EmpleadoTI")
    Call< List<EmpleadoTI> >getEmpleadoTI();

    @GET("Actividad")
    Call< List<Actividad> > getActividad();
    @GET("Empleado")
    Call< List<Empleado> > getEmpleado();
    @PUT ("EmpleadoTI/{user}/{contrasenia}")
    Call<Boolean> putContrasenia(@Path("user") String usuario,
                                 @Path("contrasenia")String contrasenia);
    @GET("EmpleadoTI/{user}")
    Call<EmpleadoTI>getContraseña(@Path("user")String usuario);

    @POST("Registro")
    Call<Boolean> registrar (@Body RegistroV3 registroV3);

    @GET("Registro/{user}/{inicio}/{lim}")
    Call<List <RegistroV4> > getPorFecha(@Path("user")String usuario,
                                         @Path("inicio")String inicio,
                                         @Path("lim")String lim);


}
