package tama;

import org.junit.Test;
/*a. Modelar una mascota virtual, onda Tamagotchi, incluyendo los mensajes
correspondientes a las acciones de comer y jugar, y la pregunta acerca de si puede
jugar o no.
b. También hay que poder conocer el nivel de una mascota, que es un número entero
mayor o igual que 0, donde a mayor nivel, más capa es.
Una mascota puede estar aburrida, hambrienta o contenta; y su comportamiento depende de
en qué estado esté.
Veamos:
Cuando una mascota come, pasa lo siguiente:
● Si está hambrienta, se pone contenta.
● Si está contenta, su nivel se incrementa en una unidad.
● Si está aburrida, y hace más de 80 minutos que está aburrida, entonces se pone contenta.
● Si está aburrida desde hace 80 minutos o menos, entonces no le pasa nada, no cambia nada.
Cuando una mascota juega, pasa lo siguiente:
● Si está contenta, su nivel se incrementa en dos unidades.
● Si está aburrida, se pone contenta.
● No produce ningún efecto jugar con la mascota si esta hambrienta.
● Una mascota puede jugar si está contenta o aburrida, si está hambrienta no.

 */
public class Tamagotchi {
    private Integer nivel;
     private String nombre;
     //TODO:modificar estado a ENUM
    private String estado;
    private final Integer TIEMPO_ABURRIDA = 90;

     int minutos;

    public Tamagotchi() {
        nivel = 0;
        estado = "hambrienta";
    }

    public Tamagotchi( String nombre) {

        this.nombre = nombre;
        nivel=0;
        estado = "hambrienta";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(){
        this.nivel=nivel;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
    return estado;
    }

    public  Boolean comer(){

        if (estado.equals("hambrienta")) {
            estado = "contenta";
        }else if(estado.equals("contenta")){
            nivel++;
        }else if (estado.equals("aburrida")){
            if(TIEMPO_ABURRIDA>80)
        estado= "contenta";
        }
        return true;
        }

        public void jugar(){
             if(estado.equals("contenta")){
                nivel+=2;
            }else if (estado.equals("aburrida")){
                 estado= "contenta";
            }
        }
    }

