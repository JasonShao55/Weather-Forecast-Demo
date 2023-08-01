# Campus Weather-A Weather Forecast Demo
This was a weather forecast android application I desgined when I was trying to put computer networking knowledge into practice.

When creating this project, I learned how to use Retrofit for making network requests, parsing JSON data with Gson, managing asynchronous operations with Kotlin's coroutines, using LiveData to emit data in a lifecycle-conscious way, the repository pattern for abstracting data sources etc. I also learned how to annotate data class properties to map them to differently named JSON fields using @SerializedName. In conclusion this was a successful attempt in Android app development.


## Overview
Campus Weather is a cross-continental application developed to provide accurate and real-time weather information across the globe. Utilizing the powerful API of 彩云天气, it brings weather data right to your fingertips. Through a meticulously designed interface, users can search for weather details by city names and visualize the forecast with captivating visual elements.

## Core Features
- Debugging Support: A clear and effective logging system has been put in place, allowing detailed debugging information.
- Data Source Integration: A seamless integration with 彩云天气's API enables access to comprehensive weather information, with the development process facilitated by well-documented usage guidelines.
- Layered Architecture: A thoughtful layered framework underpins the entire application, allowing efficient function calling through various encapsulated layers.
- Data Structure and Network Request: With data structures designed in alignment with JSON formats and leveraging GSON, Kotlin data types are easily manipulated. The network request process has been made seamless with Android's Retrofit network library.
- UI Design & Interaction: A responsive and interactive UI ensures an engaging user experience. This includes search functionalities and comprehensive weather display, all built with careful attention to detail.

## Technological Breakdown
- Backend Design: Implements models to define weather information, matching JSON structures, and network modules to handle API requests.
- Repository Layer: Processes network request data, ensuring validation and temporary storage for frontend consumption.
- Frontend Design: With distinct UI logic codes for different functionalities, the frontend is elegantly designed to display weather information based on the user's queries.
- UI Resources & Aesthetics: Beautiful backgrounds and engaging weather icons, picked from premium resources, adorn the app. Customizable layouts and carefully curated color themes add to the aesthetic richness.

## How it Works
The entire application is driven by HTTP requests, making use of HTTP's GET operation. From searching cities to displaying weather, everything is conducted over HTTPS protocols. Each module, including `PlaceService`, `WeatherService`, and `NuaaWeatherNetwork`, plays a unique role in fetching and displaying data, aided by Retrofit's HTTP libraries.

## Code Specifications:
This code is a part of a weather application named "Campus Weather"(or "NuaaWeather"), written in Kotlin, and primarily designed for the Android platform. The application retrieves weather data from an external API (QWeather's API) using Retrofit library for making network requests, and Google's Gson library for parsing JSON data.

- The classes `PlaceResponse`, `Place`, `Location`, and `Reference` are data models that correspond to the structure of the data the application receives from the weather API.
- The class `Sky` maps different weather conditions to corresponding icon and background image resources.
- `NuaaWeatherNetwork` is an object that encapsulates the network operations, which include making a call to the API and handling the response using Kotlin's coroutine concept for asynchrony.
- `PlaceService` is an interface that defines the endpoint for searching places with Retrofit.
- `ServiceCreator` is an object that creates an instance of Retrofit with the base URL of the weather API and a Gson converter factory.
- `Repository` is an object that provides a method for searching places, which makes use of NuaaWeatherNetwork to retrieve data, and handles any errors that might occur during the process.
- `NuaaWeatherApplication` is the main application class, where the application's context is stored and can be accessed statically.

![1](https://github.com/JasonShao55/Weather-Forecast-Demo/assets/61415289/044ee0f9-f38d-471d-ac9f-73cc595ff15c) ![2](https://github.com/JasonShao55/Weather-Forecast-Demo/assets/61415289/7095c8d7-48df-4cae-adfa-3d9303ae4f54)

![3](https://github.com/JasonShao55/Weather-Forecast-Demo/assets/61415289/7a0c6efc-0f30-4b25-a4e8-d0a647e8b5b2) ![4](https://github.com/JasonShao55/Weather-Forecast-Demo/assets/61415289/c14b3644-e449-4743-9378-fc5e2af2af01) 

![NuaaWeather应用结构图 (2)_看图王](https://github.com/JasonShao55/Weather-Forecast-Demo/assets/61415289/0283e02e-3b39-4a83-8b4b-db74acd8a70b)
