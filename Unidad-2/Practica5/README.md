# Práctica 3 - Programación para Dispositivos Móviles

Este repositorio contiene la solución a los ejercicios de la **Práctica 3** del curso de **Programación para Dispositivos Móviles**. Todos los ejercicios han sido resueltos utilizando el lenguaje de programación **Kotlin**.

## Estructura de la Práctica

- **Ejercicio_1**: Carpeta que contiene la solución al primer ejercicio solicitado (Interacción de Imagenes).
- **Ejercicio_2**: Carpeta que contiene la solución al segundo ejercicio solicitado (Reroducción de Audios).
- **README.md**: Este archivo proporciona información sobre la estructura del proyecto y las instrucciones para ejecutar los ejercicios.

## Instrucciones para Ejecutar los Ejercicios

1. **Clonar el repositorio** en tu computadora utilizando el siguiente comando:
    ```bash
    git clone https://github.com/maferpinazocode/Practica_3.git
    ```
2. **Acceder** a la carpeta que contiene el primer ejercicio:
    ```bash
    cd Practica_3/Ejercicio_1/
    ```
3. **Acceder** a la carpeta que contiene el segundo ejercicio:
    ```bash
    cd Practica_3/Ejercicio_2/
    ```
4. **Abrir el proyecto** con Android Studio.
5. En el IDE, **navegar** a la estructura de archivos:
    ```
    app/main/kotlin/
    ```
6. Selecciona el ejercicio que deseas ejecutar por ejemplo, `InteraccionImage`, `MusicPlayer`, etc.
7. **Ejecutar** el archivo principal (`MainActivity.kt`) haciendo clic derecho sobre el archivo y seleccionando la opción `Run`.
8. **Revisar los resultados** en el dispositivo emulador.

## Estructura Detallada del Repositorio

```plaintext
Unidad_2/
├── Practica_3/
│   ├── Ejercicio_1/
│   │   └── InteraccionImage/
│   │       ├── app/
│   │       │   ├── src/
│   │       │   │   ├── main/
│   │       │   │   │   ├── java/
│   │       │   │   │   │   └── com/example/interactionimages/
│   │       │   │   │   │       ├── MainActivity.kt
│   │       │   │   │   │       ├── ImageActivity.kt
│   │       │   │   │   ├── res/
│   │       │   │   │   │   ├── layout/
│   │       │   │   │   │   │   ├── activity_main.xml
│   │       │   │   │   │   │   ├── activity_image.xml
│   │       │   │   │   │   ├── values/
│   │       │   │   │   │   │   └── strings.xml
│   │       ├── build.gradle
│   │       └── settings.gradle
│   ├── Ejercicio_2/
│   │   └── MusicPlayer/
│   │       ├── app/
│   │       │   ├── build/
│   │       │   ├── libs/
│   │       │   ├── src/
│   │       │   │   ├── debug/
│   │       │   │   ├── main/
│   │       │   │   │   ├── AndroidManifest.xml
│   │       │   │   │   ├── java/
│   │       │   │   │   │   └── com/example/musicplayergames/
│   │       │   │   │   │       ├── MainActivity.kt
│   │       │   │   │   │       ├── PlayerActivity.kt
│   │       │   │   │   ├── res/
│   │       │   │   │   │   ├── drawable/
│   │       │   │   │   │   ├── layout/
│   │       │   │   │   │   ├── mipmap/
│   │       │   │   │   │   ├── values/
│   │       │   │   │   │   │   ├── strings.xml
│   │       │   │   │   │   │   └── colors.xml
│   │       │   │   │   └── assets/
│   │       │   ├── release/
│   │       │   ├── build.gradle
│   │       │   └── proguard-rules.pro
│   │       ├── gradle/
│   │       ├── build.gradle
│   │       └── settings.gradle
│   ├── Rubrica/
│   │   └── Rubrica.docx.pdf
│   ├── README.md
│   └── .gitignore
├── README.md
└── .gitignore


