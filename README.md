📱 Android MVVM Retrofit Project

A clean, scalable Android project following MVVM architecture, Retrofit API integration, and Repository pattern.
This project demonstrates how to consume an online API using modern Android best practices.

🚀 Features

MVVM (Model-View-ViewModel) architecture

Retrofit2 + OkHttp client

LiveData & ViewModel

Repository pattern

Clean package structure

Handles API loading, success, and error states

Example API: Fetch transactions from PHP backend

Easy to extend for other modules

📂 Project Structure
com.yourcompany.projectname
│
├── data
│   ├── api
│   │   ├── ApiService.java
│   │   └── RetrofitClient.java
│   ├── model
│   │   └── TransactionModel.java
│   └── repository
│       └── TransactionRepository.java
│
├── ui
│   └── transaction
│       ├── TransactionViewModel.java
│       └── TransactionActivity.java   (or Fragment)
│
└── utils
    └── Resource.java
