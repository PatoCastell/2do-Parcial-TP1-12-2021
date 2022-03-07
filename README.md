Enunciado 

Una pizzería vende pizzas de distintos tipos. Cada pizza contiene un nombre (String) que no debe ser nulo ni vacío, un precio de costo base (decimal y mayor a 0) un porcentaje de ganancia que se quiere obtener de su venta (decimal, 0 o positivo). 

Además, las pizzas son Mostrables, indicando por consola: • El tipo de pizza (Clase)
• Su nombre 
• El precio de venta

La pizzería prepara pizzas de que tienen las siguientes características 
• Tradicional o Tipo de masa - (A la piedra, Media masa, Molde)
• Especial o Tamaño de la pizza (Personal, Mediana o Familiar) o Cantidad de fainá (entero y puede ser cero)
• Rectangular o Largo de porciones (entero) o Ancho de porciones (entero) o Adicional de Queso (Simple, Doble o Triple)

Todas las pizzas deberán poder calcular e informar el precio de venta. Este precio es el valor de costo incrementado por el porcentaje de ganancia de cada uno. El costo de las pizzas depende del tipo de pizza. 
• Para las Tradicionales el costo se calcula como: La multiplicación de un multiplicador dependiente del tipo de masa por costo base de la pizza. (multiplicador del tipo de masa * costo base)

• Para las Especiales el costo se calcula como: La cantidad de fainas multiplicado por el precio unitario de cada porción de fainá más la multiplicación del costo base por un multiplicador dependiente del tamaño de la pizza, más. (cantidad de fainá * precio unitario de la faina) + (costo base * multiplicador del tamaño) (El precio unitario de la fainá siempre será de 38 pesos)

• Para las Rectangulares el costo se calcula como: La suma del costo base más la cantidad de porciones (largo * ancho) multiplicado por el precio unitario de la porción. Luego a todo eso se le suma el multiplicador del Adicional del Queso. (costo base + (cantidad de porciones * precio unitario de la porción)) * multiplicador del adicional del queso (El precio unitario de la porción siempre será de 52 pesos)

La pizzería deberá poder preparar pedidos de pizzas. Al momento de procesar un pedido se deberá indicar, además de la pizza deseada, el Topping que debe llevar la pizza arriba (Tomate, Jamón, Morrón, Cebolla o Salamín), cada pizza podrá tener solo un Topping. La pizzería posee un registro de la cantidad de cada uno de los Toppings destinados a cada tipo de pizza. Al momento de procesar el pedido se debe verificar que haya stock suficiente del Topping pedido para el tipo de pizza de la pizza pedida. Si no se puede procesar el pedido, porque la Pizza pedida era nula, el Topping pedido era nulo o no había stock suficiente del topping para la pizza solicitada, se deberá generar un registro del error (un texto). Estos errores se deben almacenar de forma tal que podamos acceder fácilmente al último error ocurrido, sin la posibilidad de acceder directamente a cualquier error. Adicionalmente la pizzería deberá poder agregar una determinada cantidad de unidades de topping para una determinada pizza. Esa cantidad deberá ser mayor a 0.

Al finalizar el día del trabajo la pizzeria deberá “Mostrar” por consola los siguientes datos:
• El nombre de la pizzería, 
• La cantidad de pizzas solicitadas por tipo de pizza.
• El importe total de las ventas de todos los pedidos 
• Listar las pizzas pedidas ordenadas por precio de venta en forma descendente 
• Mostrar los errores ocurridos durante el día de trabajo. Es importante mostrar del error más reciente al más antiguo.

Adicionalmente la pizzería deberá poder devolver la cantidad de pizzas pedidas en base a un nombre.
