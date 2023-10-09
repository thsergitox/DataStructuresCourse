package uni.aed.enteromuygrande;

public class EnteroMuyGrande {
    public static final char MENOS = '-';
    public Nodo cabeza;
    public byte signo ;

    public EnteroMuyGrande ( ) {
        this("0");
    }
    
    public EnteroMuyGrande (long numero) {
        this("" + numero);
    }

     public EnteroMuyGrande (Nodo cabeza){
        this.cabeza = cabeza;
        this.signo = +1;
    }

    public EnteroMuyGrande(EnteroMuyGrande num){
        this.signo = num.signo;
        this.cabeza = new Nodo();
        Nodo p = cabeza;
        Nodo q = num.cabeza;
        while(q != null){
            p.siguiente = new Nodo(q.valor);
            p = p.siguiente;
            q = q.siguiente;
        }
        this.cabeza = this.cabeza.siguiente;
    }
    
    public EnteroMuyGrande (String numero){

        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("La cadena proporcionada es nula o vacía.");
        }

        numero.trim();
        signo = +1;
        
        // Verificar si el primer carácter es un signo negativo
        if(numero.charAt(0) == MENOS){
            signo = -1;
            numero = numero.substring(1);
        }

        // Verificar si todos los caracteres son dígitos
        for (char c : numero.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("La cadena proporcionada contiene caracteres no válidos.");
            }
        }

        numero = extraeCerosPrecedentes(numero);
        
        if(numero.equals("0")){
            signo = +1;
        }
        
        cabeza = new Nodo();
        
        Nodo cola = cabeza;
        String digitos;
        
        while(!numero.equals("")){
            int loc = Math.max(numero.length() - Nodo.DIGITOS_MAX,0);
            digitos = numero.substring(loc);
            numero = numero.substring(0,loc);
            Nodo bloque = new Nodo(digitos);
            cola.siguiente = bloque;
            cola = bloque;
        }
        cabeza = cabeza.siguiente;
    }

    private static String extraeCerosPrecedentes(String str){
        StringBuffer strBuf = new StringBuffer(str);
        
        int length = strBuf.length();
        
        for(int i = 0; i < length; i++){
            if(strBuf.charAt(0) == '0'){
                strBuf.deleteCharAt(0);
            }
        }
        if(strBuf.length() == 0){
            strBuf.append('0');
        }
        
        return strBuf.toString();
        
    }

   
    public int comparaA(EnteroMuyGrande num){
        EnteroMuyGrande L = this;
        EnteroMuyGrande R = num;

        if(L.esPositivo() && R.esNegativo()){
            return +1;
        }
        
       if(R.esPositivo() && L.esNegativo()){
            return -1;
        }
        
        String Lstr = L.toString();
        String Rstr = R.toString();
        
        int result;

        int lengthL = Lstr.length();
        int lengthR = Rstr.length();

        if(lengthL == lengthR){
            result = Lstr.compareTo(Rstr);
        }else{
            result = (lengthL > lengthR) ? +1 : -1;
        }

        return L.signo * result;
    }

    public EnteroMuyGrande resta (EnteroMuyGrande num) {
        EnteroMuyGrande L = new EnteroMuyGrande(this);
        EnteroMuyGrande R = new EnteroMuyGrande(num);

        if(L.esPositivo() && R.esPositivo()){
            return L.restaPos(R);
        }
        
        if(L.esPositivo() && R.esNegativo()){
            return L.sumaPos(R.negativo());
        }

        if(L.esNegativo() && R.esPositivo()){
            return  L.negativo().sumaPos(R).negativo();
        }
        
        return R.negativo().restaPos(L.negativo());
    }

    private EnteroMuyGrande restaPos(EnteroMuyGrande num) {
        Nodo p, q, r, t;
        boolean esNegativo = false;
    
        // siempre resta el más pequeño del mayor.
        // si num es mayor, entonces el resultado es negativo
        if (this.comparaA(num) >= 0) { // this - num
            p = this.cabeza;
            q = num.cabeza;
        } else { // -(num - this)
            p = num.cabeza;
            q = this.cabeza;
            esNegativo = true;
        }
    
        t = new Nodo(); // nodo cabeza ficticio
        r = t;
    
        short prestamo = 0, minuendo; // para L es un minuendo
    
        while (p != null && q != null) {
            r.siguiente = new Nodo();
            r = r.siguiente;
    
            minuendo = (short) (p.valor - prestamo);
    
            if (minuendo < q.valor) { // necesita prestar
                r.valor = (short) (Nodo.VALOR_MAX + minuendo - q.valor);
                prestamo = 1;
            } else { // no prestamo
                r.valor = (short) (minuendo - q.valor);
                prestamo = 0;
            }
    
            p = p.siguiente;
            q = q.siguiente;
        }
    
        p = (p == null) ? q : p; // restablece p para apuntar a los bloques restantes
    
        while (p != null) {
            r.siguiente = new Nodo();
            r = r.siguiente;
    
            r.valor = (short) (p.valor - prestamo);
    
            if (r.valor < 0) {
                r.valor += Nodo.VALOR_MAX;
                prestamo = 1;
            } else {
                prestamo = 0;
            }
    
            p = p.siguiente;
        }
    
        EnteroMuyGrande result = new EnteroMuyGrande(t.siguiente); // remueve el nodo cabeza ficticio
        result = result.extraeCerosPrecedentes();
    
        if (esNegativo) result.negativo();
    
        return result;
    }
    

    private EnteroMuyGrande extraeCerosPrecedentes() {
        String numStr = this.toString();
        
        String result  = extraeCerosPrecedentes(numStr);
        
        if(result.equals("0")){
            return new EnteroMuyGrande(0);
        }else if(result.length() < numStr.length()){
            return new EnteroMuyGrande(result);
        }else{
            return this;    
        }
    }

    

    private boolean esPositivo(){
        return signo > 0;
    }

    private boolean esNegativo(){
        return signo < 0;
    }

    private EnteroMuyGrande negativo(){
        signo = (byte) -signo;
        return this;
    }
    
        
    
   
    public EnteroMuyGrande suma (EnteroMuyGrande num){

        EnteroMuyGrande L = new EnteroMuyGrande(this);
        EnteroMuyGrande R = new EnteroMuyGrande(num);

        if(L.esPositivo() && R.esPositivo()){
            return L.sumaPos(R);
        }
        
        if(L.esPositivo() && R.esNegativo()){
            return L.restaPos(R.negativo());
        }

        if(L.esNegativo() && R.esPositivo()){
            return R.restaPos(L.negativo());
        }
        
        return L.negativo().sumaPos(R.negativo()).negativo();
    }

    private EnteroMuyGrande sumaPos(EnteroMuyGrande num) {
        Nodo p, q, r, t;
    
        p = this.cabeza;
        q = num.cabeza;
    
        t = new Nodo(); // nodo cabeza ficticio
        r = t;
    
        short acarreo = 0;
    
        while (p != null && q != null) {
            short sum = (short) (acarreo + p.valor + q.valor);
    
            r.siguiente = new Nodo();
            r = r.siguiente;
    
            r.valor = (short) (sum % Nodo.VALOR_MAX);
            acarreo = (short) (sum / Nodo.VALOR_MAX);
    
            p = p.siguiente;
            q = q.siguiente;
        }
    
        p = (p == null) ? q : p; // restablece p para apuntar a los bloques restantes
    
        while (p != null) {
            r.siguiente = new Nodo();
            r = r.siguiente;
    
            r.valor = (short) ((p.valor + acarreo) % Nodo.VALOR_MAX);
            acarreo = (short) ((p.valor + acarreo) / Nodo.VALOR_MAX);
    
            p = p.siguiente;
        }
    
        if (acarreo > 0) { // desbordamiento, acarreo final
            r.siguiente = new Nodo((short) acarreo);
        }
    
        return new EnteroMuyGrande(t.siguiente); // quita el nodo cabeza ficticio
    }

    public EnteroMuyGrande multOriginal(EnteroMuyGrande num) {
        long startTime = System.currentTimeMillis();
    
        // Si uno de los números es cero, retorna 0 con signo positivo
        if (this.esCero() || num.esCero()) {
            return new EnteroMuyGrande(0);
        }
    
        EnteroMuyGrande resultado = new EnteroMuyGrande(0);
        EnteroMuyGrande temp = new EnteroMuyGrande(this);
        Nodo p = num.cabeza;   
    
        while (p != null) {
            for (int i = 0; i < p.valor; i++) {
                resultado = resultado.suma(temp);
            }
            temp = temp.multiplicaPorMil();
            p = p.siguiente;
        }   
        resultado.signo = (byte)(this.signo * num.signo);
    
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución del método simplista: " + (endTime - startTime) + " milisegundos");
    
        return resultado;
    }


    public EnteroMuyGrande multEficiente(EnteroMuyGrande num) {
        long startTime = System.currentTimeMillis();
    
        // Si uno de los números es cero, retorna 0 con signo positivo
        if (this.esCero() || num.esCero()) {
            return new EnteroMuyGrande(0);
        }
    
        EnteroMuyGrande resultado = new EnteroMuyGrande(0);
        Nodo p = this.cabeza;
        int desplazamiento = 0; // Desplazamiento para multiplicar por potencias de 1000
    
        while (p != null) {
            Nodo q = num.cabeza;
            int desplazamientoInterno = desplazamiento;
    
            while (q != null) {
                long multiplicacion = (long) p.valor * q.valor;
                EnteroMuyGrande productoParcial = new EnteroMuyGrande(multiplicacion);
    
                // Desplazamos el producto parcial según corresponda
                for (int i = 0; i < desplazamientoInterno; i++) {
                    productoParcial = productoParcial.multiplicaPorMil();
                }
    
                resultado = resultado.suma(productoParcial);
                q = q.siguiente;
                desplazamientoInterno++;
            }
    
            p = p.siguiente;
            desplazamiento++;
        }
    
        resultado.signo = (byte) (this.signo * num.signo);
    
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución del método eficiente: " + (endTime - startTime) + " milisegundos");
    
        return resultado;
    }
    
    
    
    private boolean esCero() {
        return this.cabeza == null || (this.cabeza.valor == 0 && this.cabeza.siguiente == null);
    }
    
    
    private EnteroMuyGrande multiplicaPorMil() {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.siguiente = this.cabeza;
        this.cabeza = nuevoNodo;
        return this;
    }

    public EnteroMuyGrande div(EnteroMuyGrande divisor) {
        if (divisor.esCero()) {
            throw new ArithmeticException("División por cero.");
        }
    
        // Almacenamos los signos originales y trabajamos con números positivos.
        byte signoOriginalDividendo = this.signo;
        byte signoOriginalDivisor = divisor.signo;
        this.signo = 1;
        divisor.signo = 1;
    
        // Si el divisor es mayor que el dividendo, el cociente es 0.
        if (this.comparaA(divisor) < 0) {
            return new EnteroMuyGrande(0);
        }
    
        EnteroMuyGrande dividendo = new EnteroMuyGrande(this);
        EnteroMuyGrande cociente = new EnteroMuyGrande(0);
        EnteroMuyGrande temp = new EnteroMuyGrande(0);
    
        Nodo p = dividendo.cabeza;
        while (p != null) {
            temp = temp.multiplicaPorMil().suma(new EnteroMuyGrande(p.valor));
            short contador = 0;
    
            while (temp.comparaA(divisor) >= 0) {
                temp = temp.resta(divisor);
                contador++;
            }
    
            cociente = cociente.multiplicaPorMil().suma(new EnteroMuyGrande(contador));
            p = p.siguiente;
        }
        cociente = cociente.extraeCerosPrecedentes();
        // Ajustar el signo del resultado según los signos originales.
        cociente.signo = (byte) (signoOriginalDividendo * signoOriginalDivisor);
        return cociente;
    }

    public void incr() {
    if (this.esCero()) {
        this.cabeza.valor = 1;
        return;
    }

    if (this.signo == -1) {
        Nodo p = this.cabeza;
        while (p != null) {
            if (p.valor > 0) {
                p.valor--;
                if (this.esCero()) { // Verificar si el número es cero después del decremento
                    this.signo = 1;
                }
                break;
            } else {
                p.valor = (short) (Nodo.VALOR_MAX - 1);
                if (p.siguiente == null) {
                    this.signo = 1;
                    this.cabeza.valor = 0;
                    break;
                }
            }
            p = p.siguiente;
        }
        return;
    }

    Nodo p = this.cabeza;
    while (p != null) {
        if (p.valor < Nodo.VALOR_MAX - 1) {
            p.valor++;
            break;
        } else {
            p.valor = 0;
            if (p.siguiente == null) {
                p.siguiente = new Nodo((short) 1);
                break;
            }
        }
        p = p.siguiente;
    }
}

    
    public void decr() {
        if (this.esCero()) {
            this.cabeza.valor = 1;
            this.signo = -1;
           
            return;
        }
    
        if (this.signo == -1) {
            Nodo p = this.cabeza;
            while (p != null) {
                if (p.valor < Nodo.VALOR_MAX - 1) {
                    p.valor++;
                    break;
                } else {
                    p.valor = 0;
                    if (p.siguiente == null) {
                        p.siguiente = new Nodo((short) 1);
                        break;
                    }
                }
                p = p.siguiente;
            }
          
            return;
        }
    
        Nodo p = this.cabeza;
        while (p != null) {
            if (p.valor > 0) {
                p.valor--;
                break;
            } else {
                p.valor = (short) (Nodo.VALOR_MAX - 1);
                if (p.siguiente == null) {
                    this.signo = -1;
                    this.cabeza.valor = 0;
                    break;
                }
            }
            p = p.siguiente;
        }
               
    }
    
    
    
    
    @Override
    public String toString() { 
        StringBuffer strBuf = new StringBuffer("");
        String formato = "%0" + Nodo.DIGITOS_MAX + "d";
        Nodo p = cabeza;
        while(p != null && p.siguiente != null){
            strBuf.insert(0, String.format(formato, p.valor) );
            p = p.siguiente;
        }
        
        strBuf.insert(0, p.valor);
        
        
        if(signo < 0){
            strBuf.insert(0, "-");
        }
        return strBuf.toString();
    }
    
    public String toString(String separador) { 
        StringBuffer strBuf = new StringBuffer("");
        String formato = "%0" + Nodo.DIGITOS_MAX + "d";
        Nodo p = cabeza;
        while(p != null && p.siguiente != null){
            strBuf.insert(0, separador + String.format(formato, p.valor) );
            p = p.siguiente;
        }
        
        strBuf.insert(0, p.valor);
        
        
        if(signo < 0){
            strBuf.insert(0, "-");
        }
        return strBuf.toString();
    }
    
    
    class Nodo {
    
        public static final short DIGITOS_MAX = 3;
        public static final short VALOR_MAX = 1000;
        public short valor;

        public Nodo siguiente;

        public Nodo(){
            this("0");
        }

        public Nodo(String str){
            this(Short.parseShort(str));
        }

        public Nodo(short val){
            valor = val;
            siguiente = null;
        }
        
    }
    
}
