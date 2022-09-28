package calculadora;

/**
 *
 * @author Juan Carlos Quiroz Aguilar Esta clase realiza los procesos
 * matematicos dependiendo del boton que se oprima en la clase CalculadoraUI
 * @see CalculadoraUI
 */
public class CCalculo {

    /**
     * @param a float
     * @param b float
     * @return a+b Regresa el valor de la suma de los parametros a y b
     */
    public float Sumar(float a, float b) {
        return (a + b);
    }

    /**
     * @param a float
     * @param b float
     * @return a*b Regresa el valor de la Multiplicacion de los parametros a y b
     */
    public float Multiplicar(float a, float b) {
        return (a * b);
    }

    /**
     * @param a float
     * @param b float
     * @return a/b
     * @throws DivCero Esta exepcion es lanzada si b es igual a 0 puesto que la
     * divicion entre 0 no esta permitida Regresa el valor de la divicion de los
     * parametros a y b
     */
    public float Dividir(float a, float b) throws DivCero {
        if (b == 0) {
            throw new DivCero("La division entre 0 no esta permitida");
        }
        return (a / b);
    }

    /**
     * @param a float
     * @param b float
     * @return a%b
     * @throws DivCero Esta exepcion es lanzada si b es igual a 0 puesto que la
     * divicion entre 0 no esta permitida Regresa el valor del modulo de los
     * parametros a y b
     */
    public float Modulo(float a, float b) throws DivCero {
        if (b == 0) {
            throw new DivCero("La division entre 0 no esta permitida");
        }
        return (a % b);
    }

    /**
     * @param a float
     * @param b float
     * @return a**b Regresa el valor de a elevado a la potencia b utilizando la
     * funcion pow ubicada en la libreria Math
     */
    public double Potencia(float a, float b) {
        double potencia;
        potencia = Math.pow(a, b);

        return (potencia);
    }

    /**
     * @param a float
     * @param b float
     * @throws RaizCero Lanza una exepcion cuando b es igual a 0 ya que no
     * existe una raiz 0
     * @throws Raizpar Lanza una exepcion cuando b es un numero par y a es un
     * numero menor a cero, ya que no es posible obtener la raiz en los numeros
     * reales
     * @return a Raiz b Regresa el valor de a elevado a la raiz b-esima de a
     * utilizando la funcion pow ubicada en la libreria Math. Calcular la raiz
     * b-esima es igual que elevar a la potencia 1/b
     */
    public double Raiz(float a, float b) throws RaizCero, Raizpar {
        double raiz;
        if (b == 0) {
            throw new RaizCero("No se puede tener una raiz 0");
        }
        if ((b % 2 == 0) && (a < 0)) {
            throw new Raizpar("La raiz no existe");
        }
        raiz = Math.pow(a, (1 / b));

        return (raiz);
    }

    /**
     * @param a float
     * @throws LogCero Lanza una exepcion cuando a es menor a 0 ya que no existe
     * logaritmo de numeros menores de 0
     * @return logaritmo de a Regresa el valor de logaritmo natural de a
     * utilizando la funcion log que se encuentra en la biblioteca Math
     */
    public double Log(float a) throws LogCero {

        double logaritmo;
        if (a < 0) {
            throw new LogCero("El Logaritmo debe ser mayor a 0");
        }
        logaritmo = Math.log(a);

        return (logaritmo);
    }

    /**
     * @param a float
     * @return exponencial de a Regresa el valor del exponencial a utilizando la
     * funcion exp que se encuentra en la biblioteca Math
     */
    public double Exp(float a) {
        double exp;
        exp = Math.exp(a);
        return exp;
    }

    /**
     * @param a float
     * @return seno de a Regresa el valor del seno de a utilizando la funcion
     * sin que se encuentra en la biblioteca Math
     */
    public double Seno(float a) {
        double seno;

        seno = Math.sin(a);

        return seno;
    }

    /**
     * @param a float
     * @return coseno de a Regresa el valor del coseno natural de a utilizando
     * la funcion cos que se encuentra en la biblioteca Math
     */
    public double Coseno(float a) {
        double coseno;
        coseno = Math.cos(a);

        return (coseno);
    }

    /**
     * @param a float
     * @return tangente de a Regresa el valor de la tangente de a utilizando la
     * funcion tan que se encuentra en la biblioteca Math
     */
    public double Tangente(float a) {
        double tan;
        tan = Math.tan(a);
        return (tan);
    }

    /**
     * @param a float
     * @throws Arco Lanza una exepcion cuando a esta fuera del rango [-1,1] ya
     * que la funcion arcoseno solo esta defina en ese intervalo
     * @return arcoseno de a Regresa el valor del arcoseno de a utilizando la
     * funcion asin que se encuentra en la biblioteca Math
     */
    public double Arcoseno(float a) throws Arco {
        if (Math.abs(a) > 1) {
            throw new Arco("El argumento debe estar en el rango [-1,1]");
        }
        double asen;
        asen = Math.asin(a);
        return asen;
    }

    /**
     * @param a float
     * @throws Arco Lanza una exepcion cuando a esta fuera del rango [-1,1] ya
     * que la funcion arcocoseno solo esta defina en ese intervalo
     * @return arcocoseno de a Regresa el valor del arcoseno de a utilizando la
     * funcion acos que se encuentra en la biblioteca Math
     */
    public double Arcocoseno(float a) throws Arco {
        if (Math.abs(a) > 1) {
            throw new Arco("El argumento debe estar en el rango [-1,1]");
        }
        double acos;
        acos = Math.acos(a);
        return (acos);
    }

            /**
     * @param a float
     * @return arcotangente de a 
     * Regresa el valor del arcotangente de a utilizando la funcion
     * atan que se encuentra en la biblioteca Math
     */
    public double Arcotangente(float a) {

        return (Math.atan(a));
    }

}

/**
 * @author Juan Carlos Quiroz Aguilar
 * Clase de exepcion para indicar un error al intentar dividir entre cero
 */
class DivCero extends Exception {

    public DivCero(String msn) {
        super(msn);
    }

}
/**
 * @author Juan Carlos Quiroz Aguilar
 * Clase de exepcion para indicar un error al intentar calcular una raiz cero
 */
class RaizCero extends Exception {

    public RaizCero(String msn) {
        super(msn);
    }

}
/**
 * @author Juan Carlos Quiroz Aguilar
 * Clase de exepcion para indicar un error al intentar calcular una raiz par
 * de un numero negativo
 */

class Raizpar extends Exception {

    public Raizpar(String msn) {
        super(msn);
    }

}
/**
 * @author Juan Carlos Quiroz Aguilar
 * Clase de exepcion para indicar un error al intentar calcular el logaritmo 
 * de un numero menor o igual a cero
 */
class LogCero extends Exception {

    public LogCero(String msn) {
        super(msn);
    }

}
/**
 * @author Juan Carlos Quiroz Aguilar
 * Clase de exepcion para indicar un error al intentar calcular el arcoseno o 
 * arcocoseno de un numero fuera del rango [-1,1]
 */
class Arco extends Exception {

    public Arco(String msn) {
        super(msn);
    }

}
