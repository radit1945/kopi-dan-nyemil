# Implementation Plan - Kopi dan Nyemil App

Develop a mobile application based on the "Kopi dan Nyemil" wireframe and requirements.

## User Review Required

> [!NOTE]
> The app will implement all 8 screens requested in the wireframe and prompt:
> 1. Splash / Welcome
> 2. Sign Up
> 3. Login User
> 4. Register
> 5. Home (with 5+ static food/drink items)
> 6. Profile (with profile settings and editable name)
> 7. Alamat Pengiriman / Order
> 8. Konfirmasi Pesanan

## Proposed Changes

### Application Structure & Data Model
- **`UserSession`**: Singleton object storing shared state (Nama, Username, Alamat, Patokan) in-memory for static dummy data usage across activities.
- **`FoodItem`**: Data model representing food/beverage items (Name, Description, Price, Image/Icon).
- **Activities & Layouts**:
  - `SplashActivity`: Welcome screen with logo and "Start now" button.
  - `SignUpActivity`: Sign Up screen with Register and Login buttons.
  - `LoginActivity`: Login screen with username, password, and Login button.
  - `RegisterActivity`: Register screen with nama lengkap, username, password, and Register button.
  - `HomeActivity`: Home screen with "Halo Nama", list of 5 food items, and bottom navigation (Home, Order, Profile).
  - `ProfileActivity`: Profile screen with name editing and Save button, plus bottom navigation.
  - `OrderActivity`: Delivery address form (Nama Lengkap, Alamat, Patokan) and "Order dan Kirim" button.
  - `ConfirmationActivity`: Order confirmation screen with success check icon and message, plus "Oke" button returning to Home.

## Verification Plan

### Automated Tests
- Build test via `gradle_build(":app:assembleDebug")`.

### Manual Verification
- Verify app launch and navigation flow through all 8 screens.
- Check food item list displays 5 items with prices and descriptions.
- Check form submissions and state persistence between Home, Profile, and Order screens.
