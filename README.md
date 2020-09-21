# SOLID-example-
Example how to apply correctly the five SOLID principles 

	#Single responsability principle
		Se definieron las clases de acuerdo a la naturaleza de la operacion que se va a realizar y cada una se encarga de establecer las operaciones para ellas misma. 
		

	#Open/Closed principle
		Debido a un nuevo requerimiento en el que se requiere un nuevo tipo de envio a compañia en el cual se requiere una cuenta bancaria, por lo cual se realiza una extencion de la clase Delivery respetando el principio sin modificar la clase Delivery.
	#Liskov Substitution principle
		Las clases Delivery y Payment son subclases de la  clase Transaction, al inicicializar las trasacciones en la clase Main , se puede reemplazar por sus subclases y al ejecutar el metodo save  funciona de igual manera.  
	#Interface segregation principle
		Los clientes que realizan transacciones de envio acumulan puntos pero los qeu realizan pagos no , por lo cual se tiene la interfaz IPoints que es implementada por la clase de envios pero no de pagos.
	#Dependendy Inversion principle
		Todas las transacciones requieren las instancias de las persistencia qeu van  a usar , asi  el servicio de  persistencia no depende de una instancia especifica.
