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

├── data<br>
│   ├── api<br>
│   │   ├── ApiService.java<br>
│   │   └── RetrofitClient.java<br>
│   ├── model<br>
│   │   └── TransactionModel.java<br>
│   └── repository<br>
│       └── TransactionRepository.java<br>
│<br>
├── ui<br>
│   └── transaction<br>
│       ├── TransactionViewModel.java<br>
│       └── TransactionActivity.java   (or Fragment)<br>
│<br>
└── utils<br>
    └── Resource.java<br>
