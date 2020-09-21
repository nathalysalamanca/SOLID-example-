
> Single responsability principle
		Se definieron las clases de acuerdo a la naturaleza de la operacion que se va a realizar y cada una se encarga de establecer las operaciones para ellas misma.                 
    
  ![Clases](https://user-images.githubusercontent.com/70788046/93735824-e812ab00-fba3-11ea-8845-74e23da28af5.png)
    
> Open/Closed principle
		Debido a un nuevo requerimiento en el que se necesita un nuevo tipo de envio a compañia en el cual se requiere una cuenta bancaria, por lo cual se realiza una extencion de la     clase Delivery respetando el principio sin modificar la clase Delivery.
 
 ![Clase Delivery](https://user-images.githubusercontent.com/70788046/93736288-79cee800-fba5-11ea-9551-cad47a7d81a5.png)
 
> Liskov Substitution principle
		Las clases Delivery y Payment son subclases de la  clase Transaction, al inicicializar las trasacciones en la clase Main , se puede reemplazar por sus subclases y al ejecutar el metodo save  funciona de igual manera. 
		
![Clase Payment](https://user-images.githubusercontent.com/70788046/93736396-c9adaf00-fba5-11ea-8dde-01c9f0d7a06c.png)
> Interface segregation principle
		Los clientes que realizan transacciones de envio acumulan puntos pero los que realizan pagos no , por lo cual se tiene la interfaz IPoints que es implementada por la clase de envios pero no de pagos.

![Interfaz IPoints](https://user-images.githubusercontent.com/70788046/93736613-83a51b00-fba6-11ea-8395-65c2fcc1fed4.png)
    
> Dependendy Inversion principle
		Todas las transacciones requieren las instancias de las persistencia qeu van  a usar , asi  el servicio de  persistencia no depende de una instancia especifica.

![Servicio TrasactionService](https://user-images.githubusercontent.com/70788046/93736560-5c4e4e00-fba6-11ea-87ca-1ed2e93a586b.png)

