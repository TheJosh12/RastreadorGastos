# RastreadorGastos
# 📊 Sistema de Gestión de Gastos - Java Console App

Este proyecto es una aplicación de consola en Java que permite llevar el control de los gastos personales o generales. Incluye funcionalidades básicas como agregar, mostrar, actualizar y eliminar gastos, además de visualizar gastos por mes y obtener el total gastado.

---

## 🛠️ Tecnologías utilizadas

- Java 8 o superior
- IDE recomendado: IntelliJ IDEA, Eclipse, NetBeans o Visual Studio Code
- Consola para entrada y salida de datos

---

## 📦 Estructura del Proyecto

```plaintext
├── src/
│   ├── Gasto.java          # Clase modelo que representa un gasto
│   └── Main.java           # Clase principal con el menú y lógica del sistema
```

---

## 🚀 Cómo ejecutar

1. Clona el repositorio o descarga los archivos `Gasto.java` y `Main.java`.
2. Abre el proyecto en tu IDE favorito.
3. Asegúrate de que el archivo `Main.java` tenga el método `main`.
4. Ejecuta `Main.java`.
5. Interactúa con el menú desde la consola.

---

## 🧾 Funcionalidades

✅ Menú interactivo con las siguientes opciones:

1. **Mostrar lista de gastos:**  
   Visualiza todos los gastos registrados en una tabla.

2. **Añadir nuevo gasto:**  
   Ingresa el mes, descripción y monto del gasto.

3. **Actualizar gasto existente:**  
   Permite modificar el mes, la descripción o el monto de un gasto específico por su ID.

4. **Eliminar gasto:**  
   Elimina un gasto usando su ID.

5. **Total de gastos:**  
   Muestra la suma total de todos los montos registrados.

6. **Gastos por mes:**  
   Filtra y muestra gastos según el mes que el usuario indique.

7. **Salir del sistema:**  
   Finaliza la ejecución del programa.

---

## 📌 Notas

- El ID se asigna automáticamente de forma incremental.
- No se persiste la información (no usa base de datos ni archivos).
- Ideal para practicar lógica de programación y estructura de datos en Java.

---

## 📷 Ejemplo de salida (Resumen de tabla)

```
********Lista de Gastos********
------------------------------------------------------------
| ID   | Mes        | Descripción         | Monto     |
------------------------------------------------------------
| 1    | Enero      | Renta               | $4000.00  |
| 2    | Febrero    | Luz y agua          | $1200.00  |
------------------------------------------------------------
```

---

## 🧑‍💻 Autor

- Gustavo Josuhar Herminio Vázquez  
- [herminiovazquezgustavojosuhar@gmail.com](mailto:herminiovazquezgustavojosuhar@gmail.com)

---

## 📝 Licencia

Este proyecto es de uso libre con fines educativos.
# Rastreador de Gastos 💰

Este proyecto es una aplicación de consola escrita en Java para registrar, visualizar, actualizar y eliminar gastos. Permite llevar un control básico de gastos por mes y calcular el total acumulado.

https://roadmap.sh/projects/expense-tracker