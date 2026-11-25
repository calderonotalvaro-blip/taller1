 ¿Cuál es la diferencia entre la clase CuentaBancaria y un objeto CuentaBancaria?
 -que la clase es la que define datos y el objeto es una instancia creada a partir de esos datos 

  ¿Qué hace exactamente la palabra new?
  -crea una nueva instancia del objeto 

 Si tienes dos cuentas a y b y ejecutas a.consignar(1000), ¿cambia el saldo de b? Justifica tu respuesta.
 -no cambia ya que cada new crea un objeto distinto con su propio atributo saldo; modifica el estado de a solo afecta a esa instancia.

 ¿Por qué se dice que el método retirar protege el estado del objeto?
 -por q obliga a retirar las condiciones como q el monto no supere los ahorros o la plata evitando q el saldo sea mas o sea negativo

 Propón una entidad distinta a las trabajadas e indica dos de sus atributos y dos de sus métodos.
-entidad propuest:moto
atributos : placa (String) y velocidadActual (double)
metodos:acelerar(double incremento) y frenar(double ecremento)
