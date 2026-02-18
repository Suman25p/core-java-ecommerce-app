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
========== WELCOME ==========

1.View Products
2. Search Product
3.Sort Price Asc
4.Sort Price Desc
5.Add to Cart
6.Remove from Cart
7.View Cart
8.Checkout
9.Exit

Enter your preference: 5
Enter Product ID: 2
Enter Quantity: 2
Added to cart successfully!
========== WELCOME ==========

1.View Products
2. Search Product
3.Sort Price Asc
4.Sort Price Desc
5.Add to Cart
6.Remove from Cart
7.View Cart
8.Checkout
9.Exit

Enter your preference: 8
------------- Final Bill ---------------
Mobile | Qty: 2 | Subtotal: Rs.52000
GST (10%): Rs.5200
Total Amount: Rs.57200
Checkout successful!
