:- dynamic cliente/2.
:- dynamic inventario/2.
:- dynamic historial/3.

% Productos
producto("tv",200).
producto("estufa",150).
producto("jugo",9).
producto("parrilla",55).
producto("licuadora",33).
producto("detergente",12).
producto("escoba",5).
producto("estereo",80).
producto("yogurt",7).
producto("freidora",45).

% Inventario
inventario("tv",4).
inventario("estufa",6).
inventario("jugo",12).
inventario("parrilla",3).
inventario("licuadora",7).
inventario("detergente",0).
inventario("escoba",5).
inventario("estereo",24).
inventario("yogurt",2).
inventario("freidora",8).

% Clientes
cliente("Kevin",800).
cliente("Eduardo",49).
cliente("Samuel",777).
cliente("Bob",901).
cliente("Edwin",543).
cliente("David",400).
cliente("Lucy",500).
cliente("Gabriela",100).
cliente("Rafael",202).
cliente("Julia",389).

%Reglas

% 1.- Puede comprar -------------------------------------------
puede_comprar(Cliente, Producto) :-
cliente(Cliente,Saldo), producto(Producto,Precio), Saldo>=Precio.

% 1.2.- Hay inventario -------------------------------------------
hay_inventario(Producto) :-
inventario(Producto,Cantidad), Cantidad>0.

% 2.- Comprar -------------------------------------------
comprar(Cliente, Producto) :-
% En caso de no contar con inventario
(\+hay_inventario(Producto) ->
format("No hay inventario!!!"))
% Hay inventario ¿ Tiene el cliente suficiente para comprar?
; (\+puede_comprar(Cliente, Producto) ->
format("No cuentas con suficiente saldo para comprar el producto."))
% Obtenemos los datos del cliente ahora que sabemos que puede comprar y existen unidades
; cliente(Cliente,Saldo)
, inventario(Producto,Cantidad)
, producto(Producto,Precio)
, NuevoSaldo is Saldo-Precio
, NuevaCantidad is Cantidad-1
% Aplicamos los datos a los hechos de cliente e inventario
, retract(cliente(Cliente,Saldo))
, assert(cliente(Cliente,NuevoSaldo))
, retract(inventario(Producto,Cantidad))
, assert(inventario(Producto,NuevaCantidad))
%Mensajes de confirmacion
, writef("El cliente %w tiene un saldo de %w.\n", [Cliente, NuevoSaldo])
, writef("El producto %w tiene un stock %wpz.\n", [Producto,NuevaCantidad])
, (historial(Cliente,Producto,UnidadesAdquiridas) ->
NuevaUnidad is UnidadesAdquiridas+1
, retract(historial(Cliente,Producto,UnidadesAdquiridas))
, assert(historial(Cliente,Producto,NuevaUnidad)))
; assert(historial(Cliente,Producto,1)).


% 3.1 Devolver -----------------------------------------
devolver(Cliente,Producto) :-
% Comprobamos que ha comprado dicho producto aqui
(\+historial(Cliente,Producto,UnidadesAdquiridas) ->
format("Lo sentimos usted no ha adquirido dicho producto en nuestra tienda."))
; historial(Cliente,Producto,UnidadesAdquiridas)
% Obtengo los datos del producto & Cliente para almacenar
,cliente(Cliente,Saldo)
, inventario(Producto,Cantidad)
, producto(Producto,Precio)

, NuevoSaldo is Saldo+Precio
, NuevaCantidad is Cantidad+1
, NuevaUnidad is UnidadesAdquiridas-1

% Aplicamos cambios
, retract(cliente(Cliente,Saldo))
, assert(cliente(Cliente,NuevoSaldo))
, retract(inventario(Producto,Cantidad))
, assert(inventario(Producto,NuevaCantidad))
, retract(historial(Cliente,Producto,UnidadesAdquiridas))
, assert(historial(Cliente,Producto,NuevaUnidad))

% Mensaje de confirmacion
, format("El producto ~w ha sido devuelto, ahora cuenta con un inventario de ~wpz.~nFue adquirido por ~w, quien cuenta ahora con un saldo de ~w.", [Producto,NuevaCantidad,Cliente,NuevoSaldo]).

% 3.3 Consultas -------------------------------------------
consulta_inventario(Producto) :-
inventario(Producto,Stock)
, format("El producto ~w tiene un stock de ~wpz.~n", [Producto,Stock]).

consulta_saldo(Cliente) :-
cliente(Cliente,Saldo)
, format("El cliente ~w tiene un saldo de $ ~w.00~n", [Cliente,Saldo]).

% 3.4 Rango de precios ----------------------------------------
consultar_precio(Min,Max) :-
producto(Producto,Precio)
, Precio>=Min, Precio=<Max
, format('~w~n',[Producto])
, fail.
consultar_precio(_,_).


% findall(
% (Producto,Precio)
% , (producto(Producto,Precio), Precio>= PrecioMin,Precio=<PrecioMax), % List)
% , format("~w",[List]).
%

% Ejemplos

% puede_comprar("Kevin","tv").
% puede_comprar("Gabriela","tv").

% comprar("Kevin","escoba").
% comprar("Lucy","tv").
% comprar("Edwin","detergente").

% devolver("Lucy","tv").

% Comprar mejorado
% comprar("Eduardo","yogurt"). % Hacerlo tres veces

% consulta_saldo("Bob").
% consulta_saldo("Rafael").
% consulta_saldo("David").
% consulta_inventario("parrilla").
% consulta_inventario("freidora").