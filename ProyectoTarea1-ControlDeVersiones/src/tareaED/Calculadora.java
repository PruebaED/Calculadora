
package tareaED;

/**
 * Este clase define objetos enteros, concretamente dos, que serán empleados para realizar las funciones básicas de una calculadora: suma, resta, multiplicación y división
 * @author: Guillermo Gómez Sánchez
 * @version: 03/10/2016/A
 * @since: 02/2020
 * @see <p> href = "http://www.aprenderaprogramar.com" aprenderaprogramar.com – Didáctica en programación </p>
 */

// ESTA ES LA RAMA1 -- !!!!!! //

public class Calculadora {
    
    // Atributos de la clase
    
    // ME ENCUENTRO EDITANDO DESDE GITHUB PARA UNA TAREA DEL MÓDULO DE ENTORNOS DE DESARROLLO - LÍNEA 16 //
    
    /**
     * Variable de tipo entero, -num1-
     */
    private int num1;
    /**
     * Variable de tipo entero, -num2-
     */
    private int num2; 
    
    /**
     * Constructor para el método Calculadora
     * @param a Este parámetro se usará para poder realizar funciones básicas de la clase -Calculadora-
     * @param b Este parámetro se usará para poder realizar funciones básicas de la clase -Calculadora-
     */
    
    // ME ENCUENTRO EDITANDO DESDE GITHUB PARA UNA TAREA DEL MÓDULO DE ENTORNOS DE DESARROLLO - LÍNEA 31 //
    
    public Calculadora (int a,int b){
        
        num1=a;
        num2=b;
        
    }
    
    /**
     * Método que realiza la suma de los dos datos de tipo entero introducidos a la hora de instanciar un objeto de tipo -Calculadora-
     * @return El resultado de la suma de las dos variables, -num1- y -num2-
     */
    
    public int suma (){
        
        int result;
        
        result=num1+num2;
        return result;
        
    }
    
    /**
     * Método que realiza la resta de los dos datos de tipo entero introducidos a la hora de instanciar un objeto de tipo -Calculadora-
     * @return El resultado de la resta de las dos variables, -num1- y -num2-
     */
    
    public int resta (){
        
        int result;
        
        result=num1-num2;
        return result;
        
    }
    
    /**
     * Método que realiza el producto de los dos datos de tipo entero introducidos a la hora de instanciar un objeto de tipo -Calculadora-
     * @return El resultado del producto de las dos variables, -num1- y -num2-
     */
    
    public int multiplica (){
        
        int result;
        
        result=num1*num2;
        return result;
        
    }
    
    /**
     * Método que realiza la división de los dos datos de tipo entero introducidos a la hora de instanciar un objeto de tipo -Calculadora-
     * @return El resultado de la división de las dos variables, -num1- y -num2-
     */
    
    
    public int divide (){
        
        int result;
                
        result=num1/num2;
        return result;
        
    }
    
    // Usaremos estos dos métodos para que se realice la resta de los valores absolutos, es decir, que nunca el resultado de la resta podrá ser negativo
    
    /**
     * Método que, antes de realizar la resta de los datos de tipo entero, realiza la llamada al método -resta3-
     * @return <ul>
     *         <li>true: El resultado es igual a -num1- menos -num2- </li> 
     *         <li>false: El resultado es igual a -num2- menos -num1- </li>
     *         </ul>
     */
    
    public int resta2(){
        
        int result;
        
        if (resta3()) result=num1-num2;
        else          result=num2-num1;
        return        result;
 
    }
    
    /**
     * Método que evalúa la expresión -num1 mayor o igual num2-
     * @return Devuelve -true- si -num1- es mayor o igual que -num2-. Devuelve -false- si -num1- es menor que -num2-
     */
    
    public boolean resta3(){
        
        if (num1>=num2) return true;
        else            return false;
        
    }
    
    // Usamos este método para que no de un error al realizar una división entre cero(0) 
    
    /**
     * Método que comprueba si el divisor es igual a -0-
     * @return <ul>
     *         <li>true: Devuelve -null-
     *         <li>false: El resultado es igual a -num1- dividido entre -num2- </li>
     *         </ul>
     */
    
    public Integer divide2(){
        
        if (num2==0) return null;
        int result=  num1/num2;
        return       result;
        
    }
    
    // Usaremos esto para luego en la prueba captura la excepción //
    
    /**
     * Método que, en caso de evaluarse a cierto que el divisor, -num2-, sea igual a 0, lanza una excepción -java.lang.ArithmeticException-
     * @return <ul>
     *         <li>true: Lanza una excepción del tipo -java.lang.ArithmeticException-
     *         <li>false: El resultado es igual a -num1- dividido entre -num2- </li>
     *         </ul>
     */
    
    public int divide0(){
        
        if (num2==0){
            throw new java.lang.ArithmeticException("Divisón por 0");
        }else{
            int resul=num1/num2;
            return resul;
        }
        
    }
    
}
