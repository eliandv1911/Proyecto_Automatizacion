# Proyecto_Automatizacion
Prueba conocimientos Automatizacion WEB programa Intership TCS

El proyecto consiste en automatizar Linio.com.co siguiendo los siguientes criterios:

    *La página a automatizar será Linio.com.co con el navegador Google chrome.*

    *En categoría Hogar, sección Colchones , base cama y almohadas, se debe seleccionar el producto “Super Mega Combo Azul Queen 160x190 Resortado Marshall”, Su cantidad debe ser igual a 3, se debe validar en la opción ir al carrito: el producto, la cantidad y que el nuevo valor coincida con el total de los productos.*

    *Se debe almacenar en un archivo txt el valor total de los productos, con el nombre del producto y la cantidad.

    *Se debe validar que a través de la opción del carrito en la página principal coincida los productos y el valor total que hay allí con los valores del txt anteriormente guardado.*

    *Se debe eliminar cada uno de los productos añadidos al carrito hasta quedar vacío y se debe validar con el mensaje ‘No hay productos en tu carrito’ que el carrito haya quedado vacío.*

**Plan de Pruebas:**

**Alcance:**
    Para la aplicación Linio, se debe seleccionar el producto “Super Mega Combo Azul Queen 160x190 Resortado Marshall” que se encuentra en la sección “Hogar” dentro de la categoría “Colchones , base cama y almohadas”, se debe colocar una cantidad de 3 unidades de este elemento y se debe validar que al dar click en la opción “ir al carrito” tanto el producto, como la cantidad y el nuevo valor coincidan con el total de los productos. Igualmente se debe almacenar en un archivo txt el valor total de los productos junto con el nombre del producto y la cantidad. Posteriormente se debe ir a la página principal, dar click en el carrito de compras y validar que coincidan los productos, su cantidad y valor con los guardados en el archivo txt. Finalmente se deben eliminar cada uno de los productos añadidos al carrito hasta que este quede vacío y se debe validar que se encuentre vacío con el mensaje “No hay productos en tu carrito”. Para la validación de los campos, se tendrá en cuenta los criterios de aceptación dados por el PO.

**Estrategia:**
    Se realizará pruebas modulares a la aplicación “Linio”, donde se valide el comportamiento de la funcionalidad de agregar productos al carrito a través de la búsqueda de los mismo por categoría y sección, y que dicha información quede guardada en la página en el módulo del carrito de compras y así mismo verificar que se puedan eliminar los elementos agregados al carrito de compras. Para esto se seleccionará un producto de una sección de una categoría, se añadirán al carrito 3 unidades de este elemento y posteriormente se procederá a eliminar los elementos del carrito, con fin de que validar el comportamiento de la aplicación. Se llevarán a cabo por medio de pruebas automatizadas, basadas en un patrón ScreenPlay, con metodología BDD.
