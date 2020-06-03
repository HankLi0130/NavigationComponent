# Introducing Android Navigation Component using Kotlin

### [YouTube Video](https://youtu.be/cuLUk37SLYE)

## Benefits

- Handing Fragment Transactions
- Handing Up and Back actions correctly by default
- Providing standardized resources for animations and transitions
- Implementing and handing deep linking
- Including Navigation UI patterns, such as navigation drawers and bottom navigation, with minimal additional work
- Safe Args - a Gradle plugin that provides type safety when navigating and passing data between destinations
- ViewModel support - you can scope a ViewModel to a navigation graph to share UI-related data between the graph's destinations


## Resources

- [CodeLabs - Jetpack Navigation](https://codelabs.developers.google.com/codelabs/android-navigation/index.html)

- [Android Developer - Navigation](https://developer.android.com/guide/navigation)

- [Android Jetpack: Introducing Navigation Component](https://youtu.be/Y0Cs2MQxyIs)

- [Jetpack Navigation (Google I/O'19)](https://youtu.be/JFGq0asqSuA)

- [Single Activity: Why, When, and How (Android Dev Summit '18)](https://youtu.be/2k8x8V77CrU)

- [10 Best Practices for Moving to a Single Activity](https://youtu.be/9O1D_Ytk0xg)


##  Part 1 - Basic Usage 

1. The navigation component requires Android Studio 3.3 or higher and is dependent on [Java 8 language feature](https://developer.android.com/studio/write/java8-support#supported_features)

2. Dependencies [Setup](https://developer.android.com/guide/navigation/navigation-getting-started#Set-up)

3. Create fragments we want

4. Create navigation graph

5. Add the fragments to graph

6. Add a NavHost to an activity

7. Add listeners to buttons

8. Setup action bar with navigation UI

## Part 2 - Pass data

- [Pass data between destinations](https://developer.android.com/guide/navigation/navigation-pass-data)

### Bundle

- Send

> 1. Setting bundle
> 2. Navigate with action and bundle

- Receive

> 1. Receive arguments from bundle

### Safe Args

- Send

> 1. Add classpath in top level of build.gradle
> 2. Apply plugin in module level of build.gradle
> 3. Specify a destination and setup arguments in nav graph
> 4. Add arguments in direction
> 5. Navigate with direction

- Receive

> 1. Declare a "name"Args variable by navArgs()
> 2. Using the variable to get arguments

