# 🛒 Core Java E-Commerce Console Application

## 📌 Project Overview

This is a console-based E-Commerce application built using **Core Java, Collections Framework, and Stream API**.

The application simulates real-world shopping functionality including product browsing, cart management, stock validation, and checkout with GST calculation.

The project follows a clean layered architecture with separation of:
- Model Layer
- Service Layer
- Business Logic
- Exception Handling

---

## 🚀 Features

### 🛍 Product Management
- View all available products
- Search product by name (case-insensitive & trimmed input)
- Sort products by price (Ascending & Descending)
- Get product by ID

### 🛒 Cart Management
- Add product to cart with stock validation
- Prevent adding quantity beyond available stock
- Remove product or reduce quantity
- View cart with subtotal calculation
- Calculate total cart amount

### 💳 Checkout Process
- Validate stock before purchase
- Calculate total bill with 10% GST
- Reduce stock after successful checkout
- Clear cart after purchase
- Handle OutOfStockException

### ⚠ Exception Handling
- Custom OutOfStockException
- Input validation for invalid ID and quantity
- Prevention of cart overflow beyond stock

---

## 🧠 Technologies Used

- Java (Core Java)
- Collections Framework
- Stream API
- OOP Principles
- Exception Handling

---

## ▶ How to Run

1. Clone the repository:
https://github.com/Suman25p/core-java-ecommerce-app.git

2. Open the project in Eclipse / IntelliJ IDEA.

3. Navigate to:
com.ecommerce.main.MainDriver

4. Run the `main()` method.

---

## 🖥 Sample Output
<img width="1366" height="768" alt="Screenshot (718)" src="https://github.com/user-attachments/assets/1328b603-4d91-4b8f-bfe9-90df3c24c4e8" />
<img width="1366" height="768" alt="Screenshot (719)" src="https://github.com/user-attachments/assets/64ec1e1d-14bd-4d2d-b258-06f23063c2c0" />
<img width="1366" height="768" alt="Screenshot (720)" src="https://github.com/user-attachments/assets/1cd75ab7-3bc7-4ee9-a1bb-ac47d5e2e424" />
<img width="1366" height="768" alt="Screenshot (721)" src="https://github.com/user-attachments/assets/a87be729-24f2-4a20-9bf2-8423c574c612" />
<img width="1366" height="768" alt="Screenshot (722)" src="https://github.com/user-attachments/assets/97d565e3-c474-4f2f-ab99-731f0cb237ea" />
<img width="1366" height="768" alt="Screenshot (723)" src="https://github.com/user-attachments/assets/497d4251-13f7-4af6-8768-ad2be2d85f3e" />







