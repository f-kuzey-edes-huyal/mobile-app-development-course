# Simple Navigation

This project is a simple Jetpack Compose navigation example built with Kotlin.

It is based on the first exercise of **Chapter 4: Building App Navigation** from the book **How to Build Android Applications with Kotlin, Third Edition**.

## Project Purpose

The goal of this project is to practice basic app navigation in Jetpack Compose by creating:

- a **Home screen**
- separate **Color screens**
- navigation between screens using **type-safe routes**

This example is useful for understanding how to:
- define routes
- organize screens
- connect navigation with `NavHost`
- pass simple arguments between destinations

## Project Files

### `MainActivity.kt`
This is the entry point of the application.

It:
- starts the app
- applies the theme
- calls `NavigationApp()`
- contains the `NavHost` setup for screen navigation

### `Routes.kt`
This file contains the route definitions used in navigation.

It includes:
- `Home` as the start destination
- `ColorRoute` for passing the selected color name and value

This file keeps the navigation models separate from the UI code.

### `Screens.kt`
This file contains the composable screens of the app.

It includes:
- `HomeScreen()` for displaying the list of color options
- `ColorScreen()` for displaying the selected color screen

This file is responsible for the user interface of the project.

## Technologies Used

- Kotlin
- Android Studio
- Jetpack Compose
- Navigation Compose
- Kotlin Serialization

## Notes

While adapting the exercise, a naming conflict appeared when using `Color` as a route name because Jetpack Compose already uses `Color` for UI colors.

To avoid this conflict, the route model was renamed to **`ColorRoute`**.

## Reference

This project is adapted from the Packt repository for the book:

**How to Build Android Applications with Kotlin, Third Edition**

Chapter reference:
- **Chapter 4 – Building App Navigation** [link](https://github.com/PacktPublishing/How-to-Build-Android-Applications-with-Kotlin-Third-Edition/tree/main/Chapter04?link_from_packtlink=yes)
- **Exercise04.01**

Packt course GitHub repository:
- PacktPublishing / *How-to-Build-Android-Applications-with-Kotlin-Third-Edition*
- Chapter04 folder

## Educational Use

This repository was prepared for learning purposes to better understand the structure of simple navigation in Jetpack Compose.

🎥 YouTube Short demo: [Simple Navigation App Demo](https://www.youtube.com/shorts/EdNPGEl73dw)
